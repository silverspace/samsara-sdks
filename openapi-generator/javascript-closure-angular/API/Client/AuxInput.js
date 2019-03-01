goog.provide('API.Client.AuxInput');

/**
 * Digital value of an aux input.
 * @record
 */
API.Client.AuxInput = function() {}

/**
 * Timestamp in Unix epoch milliseconds.
 * @type {!API.Client.Object}
 * @export
 */
API.Client.AuxInput.prototype.timeMs;

/**
 * Boolean representing the digital value of the aux input.
 * @type {!boolean}
 * @export
 */
API.Client.AuxInput.prototype.value;

