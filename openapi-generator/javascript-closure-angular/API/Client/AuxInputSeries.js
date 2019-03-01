goog.provide('API.Client.AuxInputSeries');

/**
 * A list of aux input values over a timerange.
 * @record
 */
API.Client.AuxInputSeries = function() {}

/**
 * The name of the aux input.
 * @type {!string}
 * @export
 */
API.Client.AuxInputSeries.prototype.name;

/**
 * @type {!Array<!API.Client.AuxInput>}
 * @export
 */
API.Client.AuxInputSeries.prototype.values;

/** @enum {string} */
API.Client.AuxInputSeries.NameEnum = { 
  Emergency Lights: 'Emergency Lights',
  Emergency Alarm: 'Emergency Alarm',
  Stop Paddle: 'Stop Paddle',
  Power Take-Off: 'Power Take-Off',
  Plow: 'Plow',
  Sweeper: 'Sweeper',
  Salter: 'Salter',
  Boom: 'Boom',
}
