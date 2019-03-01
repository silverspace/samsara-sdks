<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class DispatchRouteBase
{
    /**
     * The time in Unix epoch milliseconds that the route actually ended.
     * @DTA\Data(field="actual_end_ms", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $actual_end_ms;
    /**
     * The time in Unix epoch milliseconds that the route actually started.
     * @DTA\Data(field="actual_start_ms", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $actual_start_ms;
    /**
     * ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.
     * @DTA\Data(field="driver_id", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $driver_id;
    /**
     * ID of the group if the organization has multiple groups (optional).
     * @DTA\Data(field="group_id", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $group_id;
    /**
     * Descriptive name of this route.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * The time in Unix epoch milliseconds that the last job in the route is scheduled to end.
     * @DTA\Data(field="scheduled_end_ms")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $scheduled_end_ms;
    /**
     * The distance expected to be traveled for this route in meters.
     * @DTA\Data(field="scheduled_meters", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $scheduled_meters;
    /**
     * The time in Unix epoch milliseconds that the route is scheduled to start.
     * @DTA\Data(field="scheduled_start_ms")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $scheduled_start_ms;
    /**
     * The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.
     * @DTA\Data(field="start_location_address", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $start_location_address;
    /**
     * ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.
     * @DTA\Data(field="start_location_address_id", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $start_location_address_id;
    /**
     * Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
     * @DTA\Data(field="start_location_lat", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $start_location_lat;
    /**
     * Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.
     * @DTA\Data(field="start_location_lng", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $start_location_lng;
    /**
     * The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry.
     * @DTA\Data(field="start_location_name", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $start_location_name;
    /**
     * ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.
     * @DTA\Data(field="trailer_id", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $trailer_id;
    /**
     * ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.
     * @DTA\Data(field="vehicle_id", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $vehicle_id;
}
