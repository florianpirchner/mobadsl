package org.mobadsl.grammar.converter

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.mobadsl.semantic.model.moba.MobaApplication
import org.mobadsl.semantic.model.moba.MobaGenerator
import org.mobadsl.semantic.model.moba.util.MobaUtil

class MobaQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	def QualifiedName qualifiedName(MobaApplication ele) {
		return QualifiedName.create(MobaUtil.toApplicationVersionedIdModelValue(ele.id).split("\\."))
	}
	
	def QualifiedName qualifiedName(MobaGenerator ele) {
		val tokens = ele.versionedId.split(":");
		// avoid splitting the versions into single tokens
		return QualifiedName.create(tokens.get(0)).append(QualifiedName.create(tokens.get(1)))
	}
}
