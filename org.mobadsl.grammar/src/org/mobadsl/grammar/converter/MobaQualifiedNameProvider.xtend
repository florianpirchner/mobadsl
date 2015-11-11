package org.mobadsl.grammar.converter

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.mobadsl.semantic.model.moba.MobaApplication
import org.mobadsl.semantic.model.moba.util.MobaUtil

class MobaQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	def QualifiedName qualifiedName(MobaApplication ele) {
		return QualifiedName.create(MobaUtil.toApplicationIdQualifiedNameString(ele.id).split("\\."))
	}
}
