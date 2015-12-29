define(["ace/lib/oop", "ace/mode/text", "ace/mode/text_highlight_rules"], function(oop, mText, mTextHighlightRules) {
	var HighlightRules = function() {
		var keywords = "0|1|DELETE|GET|POST|active|alias|application|as|authorization|autorizations|backgroundApp|beacon|bigData|cache|cascading|const|constraints|custom|datatype|digits|domainDescription|domainKey|dto|enter|entity|enum|errorDto|event|extends|extensionPoint|friends|generator|headers|id|index|isArray|isDate|isDecimal|isDefault|isNotNull|isNull|isNumeric|isPrimitive|isString|isTime|isTimestamp|isUndefined|lazy|leave|lit|max|maxLength|method|min|minLength|mixin|param|parameters|project|queue|ref|regexp|requestDto|responseDto|rest|restCrud|restWorkflow|serialization|server|service|services|settings|slot|spp|strategy|text|toFirstLower|toFirstUpper|toLowerCase|toUpperCase|transient|type|uiApp|url|var|version";
		this.$rules = {
			"start": [
				{token: "comment", regex: "\\/\\/.*$"},
				{token: "comment", regex: "\\/\\*", next : "comment"},
				{token: "string", regex: '["](?:(?:\\\\.)|(?:[^"\\\\]))*?["]'},
				{token: "string", regex: "['](?:(?:\\\\.)|(?:[^'\\\\]))*?[']"},
				{token: "constant.numeric", regex: "[+-]?\\d+(?:(?:\\.\\d*)?(?:[eE][+-]?\\d+)?)?\\b"},
				{token: "lparen", regex: "[\\[({]"},
				{token: "rparen", regex: "[\\])}]"},
				{token: "keyword", regex: "\\b(?:" + keywords + ")\\b"}
			],
			"comment": [
				{token: "comment", regex: ".*?\\*\\/", next : "start"},
				{token: "comment", regex: ".+"}
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
