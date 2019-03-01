goog.provide('API.Client.UserTagRole');

/**
 * @record
 */
API.Client.UserTagRole = function() {}

/**
 * The name of the role the user has been granted on this tag.
 * @type {!string}
 * @export
 */
API.Client.UserTagRole.prototype.role;

/**
 * The id of the role the user has been granted on this tag.
 * @type {!string}
 * @export
 */
API.Client.UserTagRole.prototype.roleId;

/**
 * @type {!API.Client.UserTagRole_tag}
 * @export
 */
API.Client.UserTagRole.prototype.tag;

