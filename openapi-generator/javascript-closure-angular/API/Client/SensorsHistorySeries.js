goog.provide('API.Client._sensors_history_series');

/**
 * Sensor ID and field to query.
 * @record
 */
API.Client.SensorsHistorySeries = function() {}

/**
 * Field to query.
 * @type {!string}
 * @export
 */
API.Client.SensorsHistorySeries.prototype.field;

/**
 * Sensor ID to query.
 * @type {!number}
 * @export
 */
API.Client.SensorsHistorySeries.prototype.widgetId;

/** @enum {string} */
API.Client.SensorsHistorySeries.FieldEnum = { 
  ambientTemperature: 'ambientTemperature',
  probeTemperature: 'probeTemperature',
  currentLoop1Raw: 'currentLoop1Raw',
  currentLoop1Mapped: 'currentLoop1Mapped',
  currentLoop2Raw: 'currentLoop2Raw',
  currentLoop2Mapped: 'currentLoop2Mapped',
  pmPowerTotal: 'pmPowerTotal',
  pmPhase1Power: 'pmPhase1Power',
  pmPhase2Power: 'pmPhase2Power',
  pmPhase3Power: 'pmPhase3Power',
  pmPhase1PowerFactor: 'pmPhase1PowerFactor',
  pmPhase2PowerFactor: 'pmPhase2PowerFactor',
  pmPhase3PowerFactor: 'pmPhase3PowerFactor',
}
