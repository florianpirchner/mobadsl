/*
 * generated by Xtext 2.9.0.beta6
 */
package org.mobadsl.grammar.ui.labeling

import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import org.mobadsl.semantic.model.moba.MobaApplication
import org.mobadsl.semantic.model.moba.MobaConstant
import org.mobadsl.semantic.model.moba.MobaSettings

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
class MobaLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
//	def text(Moba ele) {
//		'A greeting to ' + ele.name
//	}
//
//	def image(MobaApplication ele) {
//		'application_enterprise.png'
//	}
//
//	def image(MobaSettings ele) {
//		'gear.png'
//	}
//
//	def image(MobaConstant ele) {
//		'safe.png'
//	}
	
	
}
