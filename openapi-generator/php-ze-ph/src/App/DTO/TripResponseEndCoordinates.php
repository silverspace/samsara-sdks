<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * End (latitude, longitude) in decimal degrees.
 */
class TripResponseEndCoordinates
{
    /**
     * @DTA\Data(field="latitude", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $latitude;
    /**
     * @DTA\Data(field="longitude", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $longitude;
}
