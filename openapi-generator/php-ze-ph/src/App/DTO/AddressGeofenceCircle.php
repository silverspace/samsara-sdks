<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Information about a circular geofence. This field is only populated if the geofence is a circle.
 */
class AddressGeofenceCircle
{
    /**
     * The latitude of the center of the circular geofence
     * @DTA\Data(field="latitude", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $latitude;
    /**
     * The radius of the circular geofence
     * @DTA\Data(field="radiusMeters", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $radius_meters;
    /**
     * The longitude of the center of the circular geofence
     * @DTA\Data(field="longitude", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $longitude;
}
