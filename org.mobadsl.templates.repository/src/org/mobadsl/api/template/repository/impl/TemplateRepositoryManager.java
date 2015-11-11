package org.mobadsl.api.template.repository.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.mobadsl.api.template.repository.ITemplateRepository;
import org.mobadsl.api.template.repository.ITemplateRepositoryManager;
import org.mobadsl.semantic.model.moba.index.MobaIndex;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

@Component(immediate = true)
public class TemplateRepositoryManager implements ITemplateRepositoryManager {

	private List<ITemplateRepository> repos = new ArrayList<>();

	@Activate
	void activate() {

	}

	@Deactivate
	void deactivate() {
		repos.clear();
	}

	@Override
	public Map<String, MobaIndex> getIndexes() {
		Map<String, MobaIndex> indexes = new HashMap<>();

		for (ITemplateRepository repo : new ArrayList<>(repos)) {
			MobaIndex index = repo.getIndex();
			String id = index.getTransientRepoID();
			if (id == null) {
				id = UUID.randomUUID().toString();
			}
			indexes.put(id, index);
		}

		return indexes;
	}

	@Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC, unbind = "removeRepo")
	void addRepo(ITemplateRepository repo) {
		repos.add(repo);
	}

	void removeRepo(ITemplateRepository repo) {
		repos.remove(repo);
	}
}
