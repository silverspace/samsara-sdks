<?php
/**
 * DispatchRoute
 */
namespace app\Models;

/**
 * DispatchRoute
 */
class DispatchRoute {

    /** @var int $actualEndMs The time in Unix epoch milliseconds that the route actually ended.*/
    private $actualEndMs;

    /** @var int $actualStartMs The time in Unix epoch milliseconds that the route actually started.*/
    private $actualStartMs;

    /** @var int $driverId ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.*/
    private $driverId;

    /** @var int $groupId ID of the group if the organization has multiple groups (optional).*/
    private $groupId;

    /** @var string $name Descriptive name of this route.*/
    private $name;

    /** @var int $scheduledEndMs The time in Unix epoch milliseconds that the last job in the route is scheduled to end.*/
    private $scheduledEndMs;

    /** @var int $scheduledMeters The distance expected to be traveled for this route in meters.*/
    private $scheduledMeters;

    /** @var int $scheduledStartMs The time in Unix epoch milliseconds that the route is scheduled to start.*/
    private $scheduledStartMs;

    /** @var string $startLocationAddress The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.*/
    private $startLocationAddress;

    /** @var int $startLocationAddressId ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.*/
    private $startLocationAddressId;

    /** @var double $startLocationLat Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.*/
    private $startLocationLat;

    /** @var double $startLocationLng Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.*/
    private $startLocationLng;

    /** @var string $startLocationName The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry.*/
    private $startLocationName;

    /** @var int $trailerId ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.*/
    private $trailerId;

    /** @var int $vehicleId ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.*/
    private $vehicleId;

    /** @var \app\Models\DispatchJob[] $dispatchJobs The dispatch jobs associated with this route.*/
    private $dispatchJobs;

    /** @var int $id ID of the Samsara dispatch route.*/
    private $id;

}
