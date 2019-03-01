<?php
/**
 * DispatchJobCreate
 */
namespace app\Models;

/**
 * DispatchJobCreate
 */
class DispatchJobCreate {

    /** @var string $destinationAddress The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.*/
    private $destinationAddress;

    /** @var int $destinationAddressId ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.*/
    private $destinationAddressId;

    /** @var double $destinationLat Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.*/
    private $destinationLat;

    /** @var double $destinationLng Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.*/
    private $destinationLng;

    /** @var string $destinationName The name of the job destination. If provided, it will take precedence over the name of the address book entry.*/
    private $destinationName;

    /** @var string $notes Notes regarding the details of this job.*/
    private $notes;

    /** @var int $scheduledArrivalTimeMs The time at which the assigned driver is scheduled to arrive at the job destination.*/
    private $scheduledArrivalTimeMs;

    /** @var int $scheduledDepartureTimeMs The time at which the assigned driver is scheduled to depart from the job destination.*/
    private $scheduledDepartureTimeMs;

}
