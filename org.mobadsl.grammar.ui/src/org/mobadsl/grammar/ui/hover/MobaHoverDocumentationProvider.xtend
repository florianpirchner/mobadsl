package org.mobadsl.grammar.ui.hover

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider
import org.mobadsl.semantic.model.moba.MobaConstant

class MobaHoverDocumentationProvider extends MultiLineCommentDocumentationProvider {

	override String getDocumentation(EObject o) {
		val String returnValue = findComment(o);
		var String extendedValue = ""
		if (returnValue != null) {
			extendedValue = getTextFromMultilineComment(returnValue);
		}
		val resultValue = o.getDocu(extendedValue)
		return resultValue
	}

	def dispatch String getDocu(EObject object, String value) {
		return value
	}

	def dispatch String getDocu(MobaConstant object, String value) {
		return value + '''<p>@value = <code>«object.value»</code></p>'''
	}

}
