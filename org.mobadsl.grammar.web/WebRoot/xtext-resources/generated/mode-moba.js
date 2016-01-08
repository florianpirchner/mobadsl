define(["ace/lib/oop", "ace/mode/text", "ace/mode/text_highlight_rules"], function(oop, mText, mTextHighlightRules) {
	var HighlightRules = function() {
		var keywords = "0|1|DELETE|GET|POST|PUT|active|alias|application|as|authorization|autorization|backgroundApp|beacon|bigData|cache|cascading|const|constraints|custom|datatype|digits|domainDescription|domainKey|dto|embed|enter|entity|enum|errorDto|event|extends|extensionPoint|format|friends|generator|headers|id|index|interval|isArray|isBool|isDate|isDecimal|isDefault|isHidden|isNotNull|isNull|isNumeric|isPredefined|isPrimitive|isString|isTime|isTimestamp|isUndefined|javaPackage|lazy|leave|lit|lowEnergy|max|maxLength|method|min|minLength|mixin|opposite|param|parameters|persistence|project|queue|ref|refEntity|regexp|requestDto|responseDto|rest|restCrud|restWorkflow|serialization|server|service|services|settings|slot|spp|strategy|text|toFirstLower|toFirstUpper|toLowerCase|toUpperCase|transient|type|uiApp|unique|url|using|var|version|wraps";
		this.$rules = {
			"start": [
				{token: "lparen", regex: "[\\[({]"},
				{token: "rparen", regex: "[\\])}]"},
				{token: "keyword", regex: "\\b(?:" + keywords + ")\\b"}
			]
		};
	};
	oop.inherits(HighlightRules, mTextHighlightRules.TextHighlightRules);
	
	var Mode = function() {
		this.HighlightRules = HighlightRules;
	};
	oop.inherits(Mode, mText.Mode);
	Mode.prototype.$id = "xtext/moba";
	Mode.prototype.getCompletions = function(state, session, pos, prefix) {
		return [];
	}
	
	return {
		Mode: Mode
	};
});
