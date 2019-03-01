<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Information about a polygon geofence. This field is only populated if the geofence is a polygon.
 */
class AddressGeofencePolygon
{
    /**
     * The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.
     * @DTA\Data(field="vertices", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\AddressGeofencePolygonVertices::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\AddressGeofencePolygonVertices::class}}
     * }})
     * @var \App\DTO\AddressGeofencePolygonVertices[]
     */
    public $vertices;
}
