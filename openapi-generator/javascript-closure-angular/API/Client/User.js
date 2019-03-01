goog.provide('API.Client.User');

/**
 * @record
 */
API.Client.User = function() {}

/**
 * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
 * @type {!string}
 * @export
 */
API.Client.User.prototype.authType;

/**
 * The email address of this user.
 * @type {!string}
 * @export
 */
API.Client.User.prototype.email;

/**
 * The first and last name of the user.
 * @type {!string}
 * @export
 */
API.Client.User.prototype.name;

/**
 * The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
 * @type {!string}
 * @export
 */
API.Client.User.prototype.organizationRoleId;

/**
 * The ID of the User record.
 * @type {!number}
 * @export
 */
API.Client.User.prototype.id;

/**
 * The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
 * @type {!string}
 * @export
 */
API.Client.User.prototype.organizationRole;

/**
 * The specific tags this user has access to. This will be blank for users that have full access to the organization.
 * @type {!Array<!API.Client.UserTagRole>}
 * @export
 */
API.Client.User.prototype.tagRoles;

/** @enum {string} */
API.Client.User.AuthTypeEnum = { 
  default: 'default',
  saml: 'saml',
}
