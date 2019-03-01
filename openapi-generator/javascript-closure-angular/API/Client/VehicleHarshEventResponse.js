goog.provide('API.Client.VehicleHarshEventResponse');

/**
 * Harsh event details for a vehicle
 * @record
 */
API.Client.VehicleHarshEventResponse = function() {}

/**
 * URL for downloading the forward facing video
 * @type {!string}
 * @export
 */
API.Client.VehicleHarshEventResponse.prototype.downloadForwardVideoUrl;

/**
 * URL for downloading the inward facing video
 * @type {!string}
 * @export
 */
API.Client.VehicleHarshEventResponse.prototype.downloadInwardVideoUrl;

/**
 * URL for downloading the tracked inward facing video
 * @type {!string}
 * @export
 */
API.Client.VehicleHarshEventResponse.prototype.downloadTrackedInwardVideoUrl;

/**
 * Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]
 * @type {!string}
 * @export
 */
API.Client.VehicleHarshEventResponse.prototype.harshEventType;

/**
 * URL of the associated incident report page
 * @type {!string}
 * @export
 */
API.Client.VehicleHarshEventResponse.prototype.incidentReportUrl;

/**
 * Whether the driver was deemed distracted during this harsh event
 * @type {!boolean}
 * @export
 */
API.Client.VehicleHarshEventResponse.prototype.isDistracted;

/**
 * @type {!API.Client.VehicleHarshEventResponse_location}
 * @export
 */
API.Client.VehicleHarshEventResponse.prototype.location;

