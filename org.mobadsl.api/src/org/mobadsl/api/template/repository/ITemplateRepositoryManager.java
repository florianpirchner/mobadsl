package org.mobadsl.api.template.repository;

import java.util.List;

import org.mobadsl.semantic.model.moba.index.MobaIndex;
import org.mobadsl.semantic.model.moba.index.MobaIndexEntry;

public interface ITemplateRepositoryManager {

	/**
	 * Returns all indexes.
	 * 
	 * @return
	 */
	List<MobaIndex> getIndexes();

	/**
	 * Returns the serialized application for the given index entry.
	 * 
	 * @param entry
	 * @return
	 */
	String getApplicationModelAsString(MobaIndexEntry entry);

	/**
	 * Returns all available entries.
	 * 
	 * @return
	 */
	List<MobaIndexEntry> getAvailableEntries();

	/**
	 * Returns the {@link MobaIndexEntry} for the given information.
	 * 
	 * @param indexId
	 * @param templateId
	 * @param version
	 * @return
	 */
	MobaIndexEntry find(String indexId, String templateId, String version);

}
