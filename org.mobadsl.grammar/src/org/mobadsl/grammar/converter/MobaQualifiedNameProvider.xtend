package org.mobadsl.grammar.converter

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.mobadsl.semantic.model.moba.MobaApplication
import org.eclipse.xtext.naming.QualifiedName

class MobaQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	def QualifiedName qualifiedName(MobaApplication ele) {
		return QualifiedName.create(ele.id)		
	}
}