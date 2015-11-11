package org.mobadsl.api.template.repository;

import java.util.Map;

import org.mobadsl.semantic.model.moba.index.MobaIndex;

public interface ITemplateRepositoryManager {

	/**
	 * Returns all indexes grouped by its repository ID. If a repository does
	 * not contain an ID, then a UUID will be used.
	 * 
	 * @return
	 */
	Map<String, MobaIndex> getIndexes();

}
