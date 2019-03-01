goog.provide('API.Client.EngineState');

/**
 * The state of the vehicle over time. State can be Running, Off, or Idle.
 * @record
 */
API.Client.EngineState = function() {}

/**
 * Timestamp in Unix epoch milliseconds.
 * @type {!API.Client.Object}
 * @export
 */
API.Client.EngineState.prototype.timeMs;

/**
 * @type {!string}
 * @export
 */
API.Client.EngineState.prototype.value;

/** @enum {string} */
API.Client.EngineState.ValueEnum = { 
  Running: 'Running',
  Off: 'Off',
  Idle: 'Idle',
}
