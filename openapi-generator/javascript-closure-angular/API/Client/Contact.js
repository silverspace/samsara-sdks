goog.provide('API.Client.Contact');

/**
 * Information about a notification contact for alerts.
 * @record
 */
API.Client.Contact = function() {}

/**
 * Email address of the contact
 * @type {!string}
 * @export
 */
API.Client.Contact.prototype.email;

/**
 * First name of the contact
 * @type {!string}
 * @export
 */
API.Client.Contact.prototype.firstName;

/**
 * ID of the contact
 * @type {!number}
 * @export
 */
API.Client.Contact.prototype.id;

/**
 * Last name of the contact
 * @type {!string}
 * @export
 */
API.Client.Contact.prototype.lastName;

/**
 * Phone number of the contact
 * @type {!string}
 * @export
 */
API.Client.Contact.prototype.phone;

