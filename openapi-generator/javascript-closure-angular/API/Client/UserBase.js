goog.provide('API.Client.UserBase');

/**
 * @record
 */
API.Client.UserBase = function() {}

/**
 * The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
 * @type {!string}
 * @export
 */
API.Client.UserBase.prototype.authType;

/**
 * The email address of this user.
 * @type {!string}
 * @export
 */
API.Client.UserBase.prototype.email;

/**
 * The first and last name of the user.
 * @type {!string}
 * @export
 */
API.Client.UserBase.prototype.name;

/**
 * The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
 * @type {!string}
 * @export
 */
API.Client.UserBase.prototype.organizationRoleId;

/** @enum {string} */
API.Client.UserBase.AuthTypeEnum = { 
  default: 'default',
  saml: 'saml',
}
