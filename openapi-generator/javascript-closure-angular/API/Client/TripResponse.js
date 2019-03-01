goog.provide('API.Client.TripResponse');

/**
 * Contains the trips for the vehicle in the requested timeframe. A trip is represented as an object that contains startMs, startLocation, startAddress, startCoordinates, endMs, endLocation, endAddress and endCoordinates.
 * @record
 */
API.Client.TripResponse = function() {}

/**
 * @type {!Array<!API.Client.TripResponse_trips>}
 * @export
 */
API.Client.TripResponse.prototype.trips;

