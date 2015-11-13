package org.mobadsl.api.template.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mobadsl.api.template.repository.ITemplateRepository;
import org.mobadsl.api.template.repository.ITemplateRepositoryManager;
import org.mobadsl.semantic.model.moba.index.MobaIndex;
import org.mobadsl.semantic.model.moba.index.MobaIndexEntry;
import org.mobadsl.semantic.model.moba.util.MobaUtil;
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
	public List<MobaIndex> getIndexes() {
		List<MobaIndex> indexes = new ArrayList<>(repos.size());

		for (ITemplateRepository repo : new ArrayList<>(repos)) {
			MobaIndex index = repo.getIndex();
			if(index != null) {
				indexes.add(index);
			}
		}

		return indexes;
	}

	@Override
	public String getApplicationModelAsString(MobaIndexEntry entry) {
		MobaIndex index = (MobaIndex) entry.eContainer();

		ITemplateRepository repo = findRepo(index);
		if (repo != null) {
			return repo.getApplicationModelAsString(entry);
		}
		return null;
	}

	/**
	 * Tries to find the repo by its id.
	 * 
	 * @param index
	 * @return
	 */
	protected ITemplateRepository findRepo(MobaIndex index) {
		for (ITemplateRepository repo : new ArrayList<>(repos)) {
			MobaIndex temp = repo.getIndex();
			if (temp.getId().equals(index.getId())) {
				return repo;
			}
		}
		return null;
	}

	/**
	 * Tries to find the repo by its id.
	 * 
	 * @param index
	 * @return
	 */
	protected ITemplateRepository findRepo(String id) {
		for (ITemplateRepository repo : new ArrayList<>(repos)) {
			MobaIndex temp = repo.getIndex();
			if (temp.getId().equals(id)) {
				return repo;
			}
		}
		return null;
	}

	@Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC, unbind = "removeRepo")
	void addRepo(ITemplateRepository repo, Map<String, Object> props) {
		repos.add(repo);
	}

	void removeRepo(ITemplateRepository repo, Map<String, Object> props) {
		repos.remove(repo);
	}

	@Override
	public List<MobaIndexEntry> getAvailableEntries() {
		List<MobaIndexEntry> result = new ArrayList<>();

		for (MobaIndex index : getIndexes()) {
			result.addAll(index.getEntries());
		}

		return result;
	}

	@Override
	public MobaIndexEntry find(String indexId, String templateName, String templateVersion) {
		String templateId = MobaUtil.toApplicationVersionedId(templateName, templateVersion);
		ITemplateRepository repo = findRepo(indexId);
		if (repo != null) {
			MobaIndex index = repo.getIndex();
			if (index != null) {
				for (MobaIndexEntry entry : index.getEntries()) {
					if (entry.getTemplateId().equals(templateId)) {
						return entry;
					}
				}
			}
		}
		return null;
	}
}
