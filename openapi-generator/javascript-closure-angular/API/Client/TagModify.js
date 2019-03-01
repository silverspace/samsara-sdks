goog.provide('API.Client.TagModify');

/**
 * @record
 */
API.Client.TagModify = function() {}

/**
 * @type {!API.Client.TagModify_add}
 * @export
 */
API.Client.TagModify.prototype.add;

/**
 * @type {!API.Client.TagModify_delete}
 * @export
 */
API.Client.TagModify.prototype.delete;

/**
 * Updated name of this tag.
 * @type {!string}
 * @export
 */
API.Client.TagModify.prototype.name;

/**
 * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag.
 * @type {!number}
 * @export
 */
API.Client.TagModify.prototype.parentTagId;

