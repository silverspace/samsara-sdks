<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class DispatchJob
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
    /**
     * The time at which the driver arrived at the job destination.
     * @DTA\Data(field="arrived_at_ms", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $arrived_at_ms;
    /**
     * The time at which the job was marked complete (e.g. started driving to the next destination).
     * @DTA\Data(field="completed_at_ms", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $completed_at_ms;
    /**
     * ID of the route that this job belongs to.
     * @DTA\Data(field="dispatch_route_id")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $dispatch_route_id;
    /**
     * ID of the driver assigned to the dispatch job.
     * @DTA\Data(field="driver_id", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $driver_id;
    /**
     * The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).
     * @DTA\Data(field="en_route_at_ms", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $en_route_at_ms;
    /**
     * The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.
     * @DTA\Data(field="estimated_arrival_ms", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $estimated_arrival_ms;
    /**
     * Fleet viewer url of the dispatch job.
     * @DTA\Data(field="fleet_viewer_url", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $fleet_viewer_url;
    /**
     * @DTA\Data(field="group_id")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $group_id;
    /**
     * ID of the Samsara dispatch job.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $id;
    /**
     * @DTA\Data(field="job_state")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\JobStatus::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\JobStatus::class})
     * @var \App\DTO\JobStatus
     */
    public $job_state;
    /**
     * The time at which the job was marked skipped.
     * @DTA\Data(field="skipped_at_ms", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $skipped_at_ms;
    /**
     * ID of the vehicle used for the dispatch job.
     * @DTA\Data(field="vehicle_id", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $vehicle_id;
}
