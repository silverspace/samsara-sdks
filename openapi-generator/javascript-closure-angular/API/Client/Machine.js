goog.provide('API.Client.Machine');

/**
 * Contains information about a machine.
 * @record
 */
API.Client.Machine = function() {}

/**
 * ID of the machine.
 * @type {!number}
 * @export
 */
API.Client.Machine.prototype.id;

/**
 * Name of the machine.
 * @type {!string}
 * @export
 */
API.Client.Machine.prototype.name;

/**
 * Notes about the machine
 * @type {!string}
 * @export
 */
API.Client.Machine.prototype.notes;

