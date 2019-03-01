<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
 */
class AddressGeofence
{
    /**
     * @DTA\Data(field="circle", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AddressGeofenceCircle::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\AddressGeofenceCircle::class})
     * @var \App\DTO\AddressGeofenceCircle
     */
    public $circle;
    /**
     * @DTA\Data(field="polygon", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AddressGeofencePolygon::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\AddressGeofencePolygon::class})
     * @var \App\DTO\AddressGeofencePolygon
     */
    public $polygon;
}
