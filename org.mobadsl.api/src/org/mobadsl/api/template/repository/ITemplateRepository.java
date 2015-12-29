package org.mobadsl.api.template.repository;

import org.mobadsl.semantic.model.moba.index.MobaIndex;
import org.mobadsl.semantic.model.moba.index.MobaIndexEntry;

public interface ITemplateRepository {

	/**
	 * Is used to register the repository id by OSGi service properties.
	 */
	public static final String ID = "moba.repository.id";

	/**
	 * Is used to register the repository name by OSGi service properties.
	 */
	public static final String VERSION = "moba.repository.version";

	/**
	 * Returns the moba index associated with this repository. The index
	 * contains all available template applications.
	 * 
	 * @return
	 */
	MobaIndex getIndex();

	/**
	 * Returns the serialized application for the given index entry.
	 * 
	 * @param entry
	 * @return
	 */
	String getApplicationModelAsString(MobaIndexEntry entry);

}
