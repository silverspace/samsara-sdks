<?php
/**
 * AddressGeofencePolygon
 */
namespace app\Models;

/**
 * AddressGeofencePolygon
 */
class AddressGeofencePolygon {

    /** @var \app\Models\AddressGeofencePolygonVertices[] $vertices The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.*/
    private $vertices;

}
