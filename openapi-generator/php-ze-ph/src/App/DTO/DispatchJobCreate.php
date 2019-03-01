<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class DispatchJobCreate
{
    /**
     * The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
     * @DTA\Data(field="destination_address", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $destination_address;
    /**
     * ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
     * @DTA\Data(field="destination_address_id", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $destination_address_id;
    /**
     * Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
     * @DTA\Data(field="destination_lat", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $destination_lat;
    /**
     * Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
     * @DTA\Data(field="destination_lng", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $destination_lng;
    /**
     * The name of the job destination. If provided, it will take precedence over the name of the address book entry.
     * @DTA\Data(field="destination_name", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $destination_name;
    /**
     * Notes regarding the details of this job.
     * @DTA\Data(field="notes", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $notes;
    /**
     * The time at which the assigned driver is scheduled to arrive at the job destination.
     * @DTA\Data(field="scheduled_arrival_time_ms")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $scheduled_arrival_time_ms;
    /**
     * The time at which the assigned driver is scheduled to depart from the job destination.
     * @DTA\Data(field="scheduled_departure_time_ms", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $scheduled_departure_time_ms;
}
