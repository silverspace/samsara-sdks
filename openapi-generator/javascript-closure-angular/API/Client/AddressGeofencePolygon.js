goog.provide('API.Client.AddressGeofence_polygon');

/**
 * Information about a polygon geofence. This field is only populated if the geofence is a polygon.
 * @record
 */
API.Client.AddressGeofencePolygon = function() {}

/**
 * The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.
 * @type {!Array<!API.Client.AddressGeofence_polygon_vertices>}
 * @export
 */
API.Client.AddressGeofencePolygon.prototype.vertices;

