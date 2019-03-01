/* SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; */
/* SET AUTOCOMMIT = 0; */
/* START TRANSACTION; */
/* SET time_zone = "+00:00"; */

-- --------------------------------------------------------

--
-- Table structure for table `Address` generated from model 'Address'
-- Information about an address/geofence. Geofences are either a circle or a polygon.
--

CREATE TABLE IF NOT EXISTS `Address` (
  `contacts` JSON DEFAULT NULL,
  `formattedAddress` TEXT DEFAULT NULL COMMENT 'The full address associated with this address/geofence, as it might be recognized by maps.google.com',
  `geofence` TEXT DEFAULT NULL,
  `id` BIGINT DEFAULT NULL COMMENT 'ID of the address',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the address or geofence',
  `notes` TEXT DEFAULT NULL COMMENT 'Notes associated with an address.',
  `tags` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Information about an address/geofence. Geofences are either a circle or a polygon.';

--
-- Table structure for table `AddressGeofence` generated from model 'AddressGeofence'
-- The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
--

CREATE TABLE IF NOT EXISTS `AddressGeofence` (
  `circle` TEXT DEFAULT NULL,
  `polygon` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.';

--
-- Table structure for table `AddressGeofence_circle` generated from model 'AddressGeofenceUnderscorecircle'
-- Information about a circular geofence. This field is only populated if the geofence is a circle.
--

CREATE TABLE IF NOT EXISTS `AddressGeofence_circle` (
  `latitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The latitude of the center of the circular geofence',
  `radiusMeters` BIGINT DEFAULT NULL COMMENT 'The radius of the circular geofence',
  `longitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The longitude of the center of the circular geofence'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Information about a circular geofence. This field is only populated if the geofence is a circle.';

--
-- Table structure for table `AddressGeofence_polygon` generated from model 'AddressGeofenceUnderscorepolygon'
-- Information about a polygon geofence. This field is only populated if the geofence is a polygon.
--

CREATE TABLE IF NOT EXISTS `AddressGeofence_polygon` (
  `vertices` JSON DEFAULT NULL COMMENT 'The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Information about a polygon geofence. This field is only populated if the geofence is a polygon.';

--
-- Table structure for table `AddressGeofence_polygon_vertices` generated from model 'AddressGeofenceUnderscorepolygonUnderscorevertices'
--

CREATE TABLE IF NOT EXISTS `AddressGeofence_polygon_vertices` (
  `latitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The longitude of a geofence vertex',
  `longitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The longitude of a geofence vertex'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `_addresses_addresses` generated from model 'UnderscoreaddressesUnderscoreaddresses'
--

CREATE TABLE IF NOT EXISTS `_addresses_addresses` (
  `notes` TEXT DEFAULT NULL COMMENT 'Notes associated with an address.',
  `formattedAddress` TEXT NOT NULL COMMENT 'The full address associated with this address/geofence, as it might be recognized by maps.google.com',
  `geofence` TEXT NOT NULL,
  `tagIds` JSON DEFAULT NULL COMMENT 'A list of tag IDs.',
  `name` TEXT NOT NULL COMMENT 'The name of this address/geofence',
  `contactIds` JSON DEFAULT NULL COMMENT 'A list of IDs for contact book entries.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `allRouteJobUpdates` generated from model 'allRouteJobUpdates'
--

CREATE TABLE IF NOT EXISTS `allRouteJobUpdates` (
  `job_updates` JSON DEFAULT NULL,
  `sequence_id` TEXT DEFAULT NULL COMMENT 'Sequence ID of the last update returned in the response'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Asset` generated from model 'Asset'
-- Basic information of an asset
--

CREATE TABLE IF NOT EXISTS `Asset` (
  `assetSerialNumber` TEXT DEFAULT NULL COMMENT 'Serial number of the host asset',
  `cable` JSON DEFAULT NULL COMMENT 'The cable connected to the asset',
  `engineHours` INT DEFAULT NULL COMMENT 'Engine hours',
  `id` BIGINT NOT NULL COMMENT 'Asset ID',
  `name` TEXT DEFAULT NULL COMMENT 'Asset name'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Basic information of an asset';

--
-- Table structure for table `Asset_cable` generated from model 'AssetUnderscorecable'
--

CREATE TABLE IF NOT EXISTS `Asset_cable` (
  `assetType` TEXT DEFAULT NULL COMMENT 'Asset type'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AssetCurrentLocation` generated from model 'AssetCurrentLocation'
-- Current location of an asset
--

CREATE TABLE IF NOT EXISTS `AssetCurrentLocation` (
  `latitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The latitude of the location in degrees.',
  `location` TEXT DEFAULT NULL COMMENT 'The best effort (street,city,state) for the latitude and longitude.',
  `longitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The longitude of the location in degrees.',
  `speedMilesPerHour` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The speed calculated from GPS that the asset was traveling at in miles per hour.',
  `timeMs` BIGINT DEFAULT NULL COMMENT 'Time in Unix milliseconds since epoch when the asset was at the location.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Current location of an asset';

--
-- Table structure for table `AssetCurrentLocationsResponse` generated from model 'AssetCurrentLocationsResponse'
-- Basic information of an asset
--

CREATE TABLE IF NOT EXISTS `AssetCurrentLocationsResponse` (
  `cable` JSON DEFAULT NULL COMMENT 'The cable connected to the asset',
  `engineHours` INT DEFAULT NULL COMMENT 'Engine hours',
  `id` BIGINT NOT NULL COMMENT 'Asset ID',
  `location` JSON DEFAULT NULL COMMENT 'Current location of an asset',
  `name` TEXT DEFAULT NULL COMMENT 'Asset name'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Basic information of an asset';

--
-- Table structure for table `AssetReeferResponse` generated from model 'AssetReeferResponse'
-- Reefer-specific asset details
--

CREATE TABLE IF NOT EXISTS `AssetReeferResponse` (
  `assetType` TEXT DEFAULT NULL COMMENT 'Asset type',
  `id` INT DEFAULT NULL COMMENT 'Asset ID',
  `name` TEXT DEFAULT NULL COMMENT 'Asset name',
  `reeferStats` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Reefer-specific asset details';

--
-- Table structure for table `AssetReeferResponse_reeferStats` generated from model 'AssetReeferResponseUnderscorereeferStats'
--

CREATE TABLE IF NOT EXISTS `AssetReeferResponse_reeferStats` (
  `fuelPercentage` JSON DEFAULT NULL COMMENT 'Fuel percentage of the reefer',
  `powerStatus` JSON DEFAULT NULL COMMENT 'Power status of the reefer',
  `engineHours` JSON DEFAULT NULL COMMENT 'Engine hours of the reefer',
  `setPoint` JSON DEFAULT NULL COMMENT 'Set point temperature of the reefer',
  `returnAirTemp` JSON DEFAULT NULL COMMENT 'Return air temperature of the reefer',
  `alarms` JSON DEFAULT NULL COMMENT 'Reefer alarms'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AssetReeferResponse_reeferStats_alarms` generated from model 'AssetReeferResponseUnderscorereeferStatsUnderscorealarms'
--

CREATE TABLE IF NOT EXISTS `AssetReeferResponse_reeferStats_alarms` (
  `severity` BIGINT DEFAULT NULL COMMENT 'Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action',
  `operatorAction` TEXT DEFAULT NULL COMMENT 'Recommended operator action',
  `description` TEXT DEFAULT NULL COMMENT 'Description of the alarm',
  `alarmCode` BIGINT DEFAULT NULL COMMENT 'ID of the alarm'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AssetReeferResponse_reeferStats_alarms_1` generated from model 'AssetReeferResponseUnderscorereeferStatsUnderscorealarmsUnderscore1'
--

CREATE TABLE IF NOT EXISTS `AssetReeferResponse_reeferStats_alarms_1` (
  `alarms` JSON DEFAULT NULL,
  `changedAtMs` BIGINT DEFAULT NULL COMMENT 'Timestamp when the alarms were reported, in Unix milliseconds since epoch'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AssetReeferResponse_reeferStats_engineHours` generated from model 'AssetReeferResponseUnderscorereeferStatsUnderscoreengineHours'
--

CREATE TABLE IF NOT EXISTS `AssetReeferResponse_reeferStats_engineHours` (
  `engineHours` BIGINT DEFAULT NULL COMMENT 'Engine hours of the reefer.',
  `changedAtMs` BIGINT DEFAULT NULL COMMENT 'Timestamp in Unix milliseconds since epoch.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AssetReeferResponse_reeferStats_fuelPercentage` generated from model 'AssetReeferResponseUnderscorereeferStatsUnderscorefuelPercentage'
--

CREATE TABLE IF NOT EXISTS `AssetReeferResponse_reeferStats_fuelPercentage` (
  `fuelPercentage` BIGINT DEFAULT NULL COMMENT 'Fuel percentage of the reefer.',
  `changedAtMs` BIGINT DEFAULT NULL COMMENT 'Timestamp in Unix milliseconds since epoch.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AssetReeferResponse_reeferStats_powerStatus` generated from model 'AssetReeferResponseUnderscorereeferStatsUnderscorepowerStatus'
--

CREATE TABLE IF NOT EXISTS `AssetReeferResponse_reeferStats_powerStatus` (
  `changedAtMs` BIGINT DEFAULT NULL COMMENT 'Timestamp in Unix milliseconds since epoch.',
  `status` TEXT DEFAULT NULL COMMENT 'Power status of the reefer.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AssetReeferResponse_reeferStats_returnAirTemp` generated from model 'AssetReeferResponseUnderscorereeferStatsUnderscorereturnAirTemp'
--

CREATE TABLE IF NOT EXISTS `AssetReeferResponse_reeferStats_returnAirTemp` (
  `tempInMilliC` BIGINT DEFAULT NULL COMMENT 'Return air temperature in millidegree Celsius.',
  `changedAtMs` BIGINT DEFAULT NULL COMMENT 'Timestamp in Unix milliseconds since epoch.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AssetReeferResponse_reeferStats_setPoint` generated from model 'AssetReeferResponseUnderscorereeferStatsUnderscoresetPoint'
--

CREATE TABLE IF NOT EXISTS `AssetReeferResponse_reeferStats_setPoint` (
  `tempInMilliC` BIGINT DEFAULT NULL COMMENT 'Set point temperature in millidegree Celsius.',
  `changedAtMs` BIGINT DEFAULT NULL COMMENT 'Timestamp in Unix milliseconds since epoch.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AuxInput` generated from model 'AuxInput'
-- Digital value of an aux input.
--

CREATE TABLE IF NOT EXISTS `AuxInput` (
  `timeMs` JSON NOT NULL COMMENT 'Timestamp in Unix epoch milliseconds.',
  `value` TINYINT(1) NOT NULL COMMENT 'Boolean representing the digital value of the aux input.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Digital value of an aux input.';

--
-- Table structure for table `AuxInputSeries` generated from model 'AuxInputSeries'
-- A list of aux input values over a timerange.
--

CREATE TABLE IF NOT EXISTS `AuxInputSeries` (
  `name` ENUM('Emergency Lights', 'Emergency Alarm', 'Stop Paddle', 'Power Take-Off', 'Plow', 'Sweeper', 'Salter', 'Boom') NOT NULL COMMENT 'The name of the aux input.',
  `values` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A list of aux input values over a timerange.';

--
-- Table structure for table `CargoResponse` generated from model 'CargoResponse'
-- Contains the current cargo status of a sensor.
--

CREATE TABLE IF NOT EXISTS `CargoResponse` (
  `groupId` BIGINT DEFAULT NULL,
  `sensors` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Contains the current cargo status of a sensor.';

--
-- Table structure for table `CargoResponse_sensors` generated from model 'CargoResponseUnderscoresensors'
--

CREATE TABLE IF NOT EXISTS `CargoResponse_sensors` (
  `cargoEmpty` TINYINT(1) DEFAULT NULL COMMENT 'Flag indicating whether the current cargo is empty or loaded.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the sensor.',
  `id` BIGINT DEFAULT NULL COMMENT 'ID of the sensor.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Contact` generated from model 'Contact'
-- Information about a notification contact for alerts.
--

CREATE TABLE IF NOT EXISTS `Contact` (
  `email` TEXT DEFAULT NULL COMMENT 'Email address of the contact',
  `firstName` TEXT DEFAULT NULL COMMENT 'First name of the contact',
  `id` BIGINT DEFAULT NULL COMMENT 'ID of the contact',
  `lastName` TEXT DEFAULT NULL COMMENT 'Last name of the contact',
  `phone` TEXT DEFAULT NULL COMMENT 'Phone number of the contact'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Information about a notification contact for alerts.';

--
-- Table structure for table `DataInputHistoryResponse` generated from model 'DataInputHistoryResponse'
--

CREATE TABLE IF NOT EXISTS `DataInputHistoryResponse` (
  `id` BIGINT DEFAULT NULL COMMENT 'The ID of this data input',
  `name` TEXT NOT NULL COMMENT 'Name of this data input',
  `points` JSON DEFAULT NULL COMMENT 'Data points from this data input'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DataInputHistoryResponse_points` generated from model 'DataInputHistoryResponseUnderscorepoints'
--

CREATE TABLE IF NOT EXISTS `DataInputHistoryResponse_points` (
  `value` DECIMAL(20, 9) DEFAULT NULL,
  `timeMs` BIGINT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DispatchJob` generated from model 'DispatchJob'
--

CREATE TABLE IF NOT EXISTS `DispatchJob` (
  `destination_address` TEXT DEFAULT NULL COMMENT 'The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.',
  `destination_address_id` BIGINT DEFAULT NULL COMMENT 'ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.',
  `destination_lat` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.',
  `destination_lng` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.',
  `destination_name` TEXT DEFAULT NULL COMMENT 'The name of the job destination. If provided, it will take precedence over the name of the address book entry.',
  `notes` TEXT DEFAULT NULL COMMENT 'Notes regarding the details of this job.',
  `scheduled_arrival_time_ms` BIGINT NOT NULL COMMENT 'The time at which the assigned driver is scheduled to arrive at the job destination.',
  `scheduled_departure_time_ms` BIGINT DEFAULT NULL COMMENT 'The time at which the assigned driver is scheduled to depart from the job destination.',
  `arrived_at_ms` BIGINT DEFAULT NULL COMMENT 'The time at which the driver arrived at the job destination.',
  `completed_at_ms` BIGINT DEFAULT NULL COMMENT 'The time at which the job was marked complete (e.g. started driving to the next destination).',
  `dispatch_route_id` BIGINT NOT NULL COMMENT 'ID of the route that this job belongs to.',
  `driver_id` BIGINT DEFAULT NULL COMMENT 'ID of the driver assigned to the dispatch job.',
  `en_route_at_ms` BIGINT DEFAULT NULL COMMENT 'The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination).',
  `estimated_arrival_ms` BIGINT DEFAULT NULL COMMENT 'The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs.',
  `fleet_viewer_url` TEXT DEFAULT NULL COMMENT 'Fleet viewer url of the dispatch job.',
  `group_id` BIGINT NOT NULL,
  `id` BIGINT NOT NULL COMMENT 'ID of the Samsara dispatch job.',
  `job_state` TEXT NOT NULL,
  `skipped_at_ms` BIGINT DEFAULT NULL COMMENT 'The time at which the job was marked skipped.',
  `vehicle_id` BIGINT DEFAULT NULL COMMENT 'ID of the vehicle used for the dispatch job.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DispatchJobCreate` generated from model 'DispatchJobCreate'
--

CREATE TABLE IF NOT EXISTS `DispatchJobCreate` (
  `destination_address` TEXT DEFAULT NULL COMMENT 'The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.',
  `destination_address_id` BIGINT DEFAULT NULL COMMENT 'ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.',
  `destination_lat` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.',
  `destination_lng` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.',
  `destination_name` TEXT DEFAULT NULL COMMENT 'The name of the job destination. If provided, it will take precedence over the name of the address book entry.',
  `notes` TEXT DEFAULT NULL COMMENT 'Notes regarding the details of this job.',
  `scheduled_arrival_time_ms` BIGINT NOT NULL COMMENT 'The time at which the assigned driver is scheduled to arrive at the job destination.',
  `scheduled_departure_time_ms` BIGINT DEFAULT NULL COMMENT 'The time at which the assigned driver is scheduled to depart from the job destination.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DispatchRoute` generated from model 'DispatchRoute'
--

CREATE TABLE IF NOT EXISTS `DispatchRoute` (
  `actual_end_ms` BIGINT DEFAULT NULL COMMENT 'The time in Unix epoch milliseconds that the route actually ended.',
  `actual_start_ms` BIGINT DEFAULT NULL COMMENT 'The time in Unix epoch milliseconds that the route actually started.',
  `driver_id` BIGINT DEFAULT NULL COMMENT 'ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.',
  `group_id` BIGINT DEFAULT NULL COMMENT 'ID of the group if the organization has multiple groups (optional).',
  `name` TEXT NOT NULL COMMENT 'Descriptive name of this route.',
  `scheduled_end_ms` BIGINT NOT NULL COMMENT 'The time in Unix epoch milliseconds that the last job in the route is scheduled to end.',
  `scheduled_meters` BIGINT DEFAULT NULL COMMENT 'The distance expected to be traveled for this route in meters.',
  `scheduled_start_ms` BIGINT NOT NULL COMMENT 'The time in Unix epoch milliseconds that the route is scheduled to start.',
  `start_location_address` TEXT DEFAULT NULL COMMENT 'The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.',
  `start_location_address_id` BIGINT DEFAULT NULL COMMENT 'ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.',
  `start_location_lat` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.',
  `start_location_lng` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.',
  `start_location_name` TEXT DEFAULT NULL COMMENT 'The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry.',
  `trailer_id` BIGINT DEFAULT NULL COMMENT 'ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.',
  `vehicle_id` BIGINT DEFAULT NULL COMMENT 'ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.',
  `dispatch_jobs` JSON NOT NULL COMMENT 'The dispatch jobs associated with this route.',
  `id` BIGINT NOT NULL COMMENT 'ID of the Samsara dispatch route.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DispatchRouteBase` generated from model 'DispatchRouteBase'
--

CREATE TABLE IF NOT EXISTS `DispatchRouteBase` (
  `actual_end_ms` BIGINT DEFAULT NULL COMMENT 'The time in Unix epoch milliseconds that the route actually ended.',
  `actual_start_ms` BIGINT DEFAULT NULL COMMENT 'The time in Unix epoch milliseconds that the route actually started.',
  `driver_id` BIGINT DEFAULT NULL COMMENT 'ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.',
  `group_id` BIGINT DEFAULT NULL COMMENT 'ID of the group if the organization has multiple groups (optional).',
  `name` TEXT NOT NULL COMMENT 'Descriptive name of this route.',
  `scheduled_end_ms` BIGINT NOT NULL COMMENT 'The time in Unix epoch milliseconds that the last job in the route is scheduled to end.',
  `scheduled_meters` BIGINT DEFAULT NULL COMMENT 'The distance expected to be traveled for this route in meters.',
  `scheduled_start_ms` BIGINT NOT NULL COMMENT 'The time in Unix epoch milliseconds that the route is scheduled to start.',
  `start_location_address` TEXT DEFAULT NULL COMMENT 'The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.',
  `start_location_address_id` BIGINT DEFAULT NULL COMMENT 'ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.',
  `start_location_lat` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.',
  `start_location_lng` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.',
  `start_location_name` TEXT DEFAULT NULL COMMENT 'The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry.',
  `trailer_id` BIGINT DEFAULT NULL COMMENT 'ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.',
  `vehicle_id` BIGINT DEFAULT NULL COMMENT 'ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DispatchRouteCreate` generated from model 'DispatchRouteCreate'
--

CREATE TABLE IF NOT EXISTS `DispatchRouteCreate` (
  `actual_end_ms` BIGINT DEFAULT NULL COMMENT 'The time in Unix epoch milliseconds that the route actually ended.',
  `actual_start_ms` BIGINT DEFAULT NULL COMMENT 'The time in Unix epoch milliseconds that the route actually started.',
  `driver_id` BIGINT DEFAULT NULL COMMENT 'ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned.',
  `group_id` BIGINT DEFAULT NULL COMMENT 'ID of the group if the organization has multiple groups (optional).',
  `name` TEXT NOT NULL COMMENT 'Descriptive name of this route.',
  `scheduled_end_ms` BIGINT NOT NULL COMMENT 'The time in Unix epoch milliseconds that the last job in the route is scheduled to end.',
  `scheduled_meters` BIGINT DEFAULT NULL COMMENT 'The distance expected to be traveled for this route in meters.',
  `scheduled_start_ms` BIGINT NOT NULL COMMENT 'The time in Unix epoch milliseconds that the route is scheduled to start.',
  `start_location_address` TEXT DEFAULT NULL COMMENT 'The address of the route&#39;s starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided.',
  `start_location_address_id` BIGINT DEFAULT NULL COMMENT 'ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided.',
  `start_location_lat` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.',
  `start_location_lng` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided.',
  `start_location_name` TEXT DEFAULT NULL COMMENT 'The name of the route&#39;s starting location. If provided, it will take precedence over the name of the address book entry.',
  `trailer_id` BIGINT DEFAULT NULL COMMENT 'ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them.',
  `vehicle_id` BIGINT DEFAULT NULL COMMENT 'ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned.',
  `dispatch_jobs` JSON NOT NULL COMMENT 'The dispatch jobs to create for this route.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DispatchRouteHistoricalEntry` generated from model 'DispatchRouteHistoricalEntry'
--

CREATE TABLE IF NOT EXISTS `DispatchRouteHistoricalEntry` (
  `changed_at_ms` BIGINT DEFAULT NULL COMMENT 'Timestamp that the route was updated, represented as Unix milliseconds since epoch.',
  `route` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DispatchRouteHistory` generated from model 'DispatchRouteHistory'
--

CREATE TABLE IF NOT EXISTS `DispatchRouteHistory` (
  `history` JSON DEFAULT NULL COMMENT 'History of the route&#39;s state changes.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Document` generated from model 'Document'
--

CREATE TABLE IF NOT EXISTS `Document` (
  `dispatchJobId` BIGINT DEFAULT NULL COMMENT 'ID of the Samsara dispatch job for which the document is submitted',
  `notes` TEXT DEFAULT NULL COMMENT 'Notes submitted with this document.',
  `documentType` TEXT NOT NULL COMMENT 'Descriptive name of this type of document.',
  `driverCreatedAtMs` BIGINT NOT NULL COMMENT 'The time in Unix epoch milliseconds that the document is created.',
  `driverId` BIGINT NOT NULL COMMENT 'ID of the driver for whom the document is submitted',
  `fields` JSON NOT NULL COMMENT 'The fields associated with this document.',
  `vehicleId` BIGINT DEFAULT NULL COMMENT 'VehicleID of the driver at document creation.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DocumentBase` generated from model 'DocumentBase'
--

CREATE TABLE IF NOT EXISTS `DocumentBase` (
  `dispatchJobId` BIGINT DEFAULT NULL COMMENT 'ID of the Samsara dispatch job for which the document is submitted',
  `notes` TEXT DEFAULT NULL COMMENT 'Notes submitted with this document.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DocumentCreate` generated from model 'DocumentCreate'
--

CREATE TABLE IF NOT EXISTS `DocumentCreate` (
  `dispatchJobId` BIGINT DEFAULT NULL COMMENT 'ID of the Samsara dispatch job for which the document is submitted',
  `notes` TEXT DEFAULT NULL COMMENT 'Notes submitted with this document.',
  `documentTypeUuid` TEXT NOT NULL COMMENT 'Universally unique identifier for the document type this document is being created for.',
  `fields` JSON NOT NULL COMMENT 'List of fields should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DocumentField` generated from model 'DocumentField'
--

CREATE TABLE IF NOT EXISTS `DocumentField` (
  `numberValue` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Value of this field if this document field has valueType: ValueType_Number.',
  `photoValue` JSON DEFAULT NULL COMMENT 'Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.',
  `stringValue` TEXT DEFAULT NULL COMMENT 'Value of this field if this document field has valueType: ValueType_String.',
  `valueType` TEXT NOT NULL COMMENT 'Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.',
  `label` TEXT NOT NULL COMMENT 'Descriptive name of this field.',
  `value` JSON DEFAULT NULL COMMENT 'DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DocumentFieldCreate` generated from model 'DocumentFieldCreate'
--

CREATE TABLE IF NOT EXISTS `DocumentFieldCreate` (
  `numberValue` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Value of this field if this document field has valueType: ValueType_Number.',
  `photoValue` JSON DEFAULT NULL COMMENT 'Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.',
  `stringValue` TEXT DEFAULT NULL COMMENT 'Value of this field if this document field has valueType: ValueType_String.',
  `valueType` TEXT NOT NULL COMMENT 'Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DocumentFieldCreate_photoValue` generated from model 'DocumentFieldCreateUnderscorephotoValue'
--

CREATE TABLE IF NOT EXISTS `DocumentFieldCreate_photoValue` (
  `url` TEXT DEFAULT NULL COMMENT 'Photo URL for a JPG image'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DocumentFieldType` generated from model 'DocumentFieldType'
--

CREATE TABLE IF NOT EXISTS `DocumentFieldType` (
  `label` TEXT NOT NULL COMMENT 'Descriptive name of this field type.',
  `numberValueTypeMetadata` TEXT DEFAULT NULL,
  `valueType` TEXT NOT NULL COMMENT 'The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DocumentFieldType_numberValueTypeMetadata` generated from model 'DocumentFieldTypeUnderscorenumberValueTypeMetadata'
-- Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
--

CREATE TABLE IF NOT EXISTS `DocumentFieldType_numberValueTypeMetadata` (
  `numDecimalPlaces` BIGINT DEFAULT NULL COMMENT 'Number of decimal places that values for this field type can have.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.';

--
-- Table structure for table `DocumentType` generated from model 'DocumentType'
--

CREATE TABLE IF NOT EXISTS `DocumentType` (
  `fieldTypes` JSON DEFAULT NULL COMMENT 'The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.',
  `name` TEXT NOT NULL COMMENT 'Name of the document type.',
  `orgId` BIGINT NOT NULL COMMENT 'ID for the organization this document belongs to.',
  `uuid` TEXT NOT NULL COMMENT 'Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DoorResponse` generated from model 'DoorResponse'
-- Contains the current door status of a sensor.
--

CREATE TABLE IF NOT EXISTS `DoorResponse` (
  `groupId` BIGINT DEFAULT NULL,
  `sensors` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Contains the current door status of a sensor.';

--
-- Table structure for table `DoorResponse_sensors` generated from model 'DoorResponseUnderscoresensors'
--

CREATE TABLE IF NOT EXISTS `DoorResponse_sensors` (
  `doorClosed` TINYINT(1) DEFAULT NULL COMMENT 'Flag indicating whether the current door is closed or open.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the sensor.',
  `id` BIGINT DEFAULT NULL COMMENT 'ID of the sensor.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Driver` generated from model 'Driver'
--

CREATE TABLE IF NOT EXISTS `Driver` (
  `eldAdverseWeatherExemptionEnabled` TINYINT(1) DEFAULT NULL COMMENT 'Flag indicating this driver may use Adverse Weather exemptions in ELD logs.',
  `eldBigDayExemptionEnabled` TINYINT(1) DEFAULT NULL COMMENT 'Flag indicating this driver may use Big Day excemptions in ELD logs.',
  `eldDayStartHour` INT DEFAULT NULL COMMENT '0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.',
  `eldExempt` TINYINT(1) DEFAULT NULL COMMENT 'Flag indicating this driver is exempt from the Electronic Logging Mandate.',
  `eldExemptReason` TEXT DEFAULT NULL COMMENT 'Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).',
  `eldPcEnabled` TINYINT(1) DEFAULT false COMMENT 'Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.',
  `eldYmEnabled` TINYINT(1) DEFAULT false COMMENT 'Flag indicating this driver may select the Yard Move duty status in ELD logs.',
  `externalIds` JSON DEFAULT NULL COMMENT 'Dictionary of external IDs (string key-value pairs)',
  `groupId` BIGINT DEFAULT NULL COMMENT 'ID of the group if the organization has multiple groups (uncommon).',
  `licenseNumber` TEXT DEFAULT NULL COMMENT 'Driver&#39;s state issued license number.',
  `licenseState` TEXT DEFAULT NULL COMMENT 'Abbreviation of state that issued driver&#39;s license.',
  `name` TEXT NOT NULL COMMENT 'Driver&#39;s name.',
  `notes` TEXT DEFAULT NULL COMMENT 'Notes about the driver.',
  `phone` TEXT DEFAULT NULL COMMENT 'Driver&#39;s phone number. Please include only digits, ex. 4157771234',
  `username` TEXT DEFAULT NULL COMMENT 'Driver&#39;s login username into the driver app.',
  `vehicleId` BIGINT DEFAULT NULL COMMENT 'ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).',
  `id` BIGINT NOT NULL COMMENT 'ID of the driver.',
  `isDeactivated` TINYINT(1) DEFAULT NULL COMMENT 'True if the driver account has been deactivated.',
  `tags` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DriverBase` generated from model 'DriverBase'
--

CREATE TABLE IF NOT EXISTS `DriverBase` (
  `eldAdverseWeatherExemptionEnabled` TINYINT(1) DEFAULT NULL COMMENT 'Flag indicating this driver may use Adverse Weather exemptions in ELD logs.',
  `eldBigDayExemptionEnabled` TINYINT(1) DEFAULT NULL COMMENT 'Flag indicating this driver may use Big Day excemptions in ELD logs.',
  `eldDayStartHour` INT DEFAULT NULL COMMENT '0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.',
  `eldExempt` TINYINT(1) DEFAULT NULL COMMENT 'Flag indicating this driver is exempt from the Electronic Logging Mandate.',
  `eldExemptReason` TEXT DEFAULT NULL COMMENT 'Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).',
  `eldPcEnabled` TINYINT(1) DEFAULT false COMMENT 'Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.',
  `eldYmEnabled` TINYINT(1) DEFAULT false COMMENT 'Flag indicating this driver may select the Yard Move duty status in ELD logs.',
  `externalIds` JSON DEFAULT NULL COMMENT 'Dictionary of external IDs (string key-value pairs)',
  `groupId` BIGINT DEFAULT NULL COMMENT 'ID of the group if the organization has multiple groups (uncommon).',
  `licenseNumber` TEXT DEFAULT NULL COMMENT 'Driver&#39;s state issued license number.',
  `licenseState` TEXT DEFAULT NULL COMMENT 'Abbreviation of state that issued driver&#39;s license.',
  `name` TEXT NOT NULL COMMENT 'Driver&#39;s name.',
  `notes` TEXT DEFAULT NULL COMMENT 'Notes about the driver.',
  `phone` TEXT DEFAULT NULL COMMENT 'Driver&#39;s phone number. Please include only digits, ex. 4157771234',
  `username` TEXT DEFAULT NULL COMMENT 'Driver&#39;s login username into the driver app.',
  `vehicleId` BIGINT DEFAULT NULL COMMENT 'ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DriverDailyLogResponse` generated from model 'DriverDailyLogResponse'
--

CREATE TABLE IF NOT EXISTS `DriverDailyLogResponse` (
  `days` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DriverDailyLogResponse_days` generated from model 'DriverDailyLogResponseUnderscoredays'
--

CREATE TABLE IF NOT EXISTS `DriverDailyLogResponse_days` (
  `certifiedAtMs` BIGINT DEFAULT NULL COMMENT 'Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0.',
  `endMs` INT DEFAULT NULL COMMENT 'End of the HOS day, specified in milliseconds UNIX time.',
  `startMs` INT DEFAULT NULL COMMENT 'End of the HOS day, specified in milliseconds UNIX time.',
  `trailerIds` JSON DEFAULT NULL COMMENT 'List of trailer ID&#39;s associated with the driver for the day.',
  `activeHours` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Hours spent on duty or driving, rounded to two decimal places.',
  `distanceMiles` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Distance driven in miles, rounded to two decimal places.',
  `activeMs` BIGINT DEFAULT NULL COMMENT 'Milliseconds spent on duty or driving.',
  `certified` TINYINT(1) DEFAULT NULL COMMENT 'Whether this HOS day chart was certified by the driver.',
  `vehicleIds` JSON DEFAULT NULL COMMENT 'List of vehicle ID&#39;s associated with the driver for the day.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DriverForCreate` generated from model 'DriverForCreate'
--

CREATE TABLE IF NOT EXISTS `DriverForCreate` (
  `eldAdverseWeatherExemptionEnabled` TINYINT(1) DEFAULT NULL COMMENT 'Flag indicating this driver may use Adverse Weather exemptions in ELD logs.',
  `eldBigDayExemptionEnabled` TINYINT(1) DEFAULT NULL COMMENT 'Flag indicating this driver may use Big Day excemptions in ELD logs.',
  `eldDayStartHour` INT DEFAULT NULL COMMENT '0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.',
  `eldExempt` TINYINT(1) DEFAULT NULL COMMENT 'Flag indicating this driver is exempt from the Electronic Logging Mandate.',
  `eldExemptReason` TEXT DEFAULT NULL COMMENT 'Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).',
  `eldPcEnabled` TINYINT(1) DEFAULT false COMMENT 'Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.',
  `eldYmEnabled` TINYINT(1) DEFAULT false COMMENT 'Flag indicating this driver may select the Yard Move duty status in ELD logs.',
  `externalIds` JSON DEFAULT NULL COMMENT 'Dictionary of external IDs (string key-value pairs)',
  `groupId` BIGINT DEFAULT NULL COMMENT 'ID of the group if the organization has multiple groups (uncommon).',
  `licenseNumber` TEXT DEFAULT NULL COMMENT 'Driver&#39;s state issued license number.',
  `licenseState` TEXT DEFAULT NULL COMMENT 'Abbreviation of state that issued driver&#39;s license.',
  `name` TEXT NOT NULL COMMENT 'Driver&#39;s name.',
  `notes` TEXT DEFAULT NULL COMMENT 'Notes about the driver.',
  `phone` TEXT DEFAULT NULL COMMENT 'Driver&#39;s phone number. Please include only digits, ex. 4157771234',
  `username` TEXT DEFAULT NULL COMMENT 'Driver&#39;s login username into the driver app.',
  `vehicleId` BIGINT DEFAULT NULL COMMENT 'ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).',
  `password` TEXT NOT NULL COMMENT 'Driver&#39;s password for the driver app.',
  `tagIds` JSON DEFAULT NULL COMMENT 'A list of tag IDs.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DriverSafetyScoreResponse` generated from model 'DriverSafetyScoreResponse'
-- Safety score details for a driver
--

CREATE TABLE IF NOT EXISTS `DriverSafetyScoreResponse` (
  `crashCount` INT DEFAULT NULL COMMENT 'Crash event count',
  `driverId` INT DEFAULT NULL COMMENT 'Driver ID',
  `harshAccelCount` INT DEFAULT NULL COMMENT 'Harsh acceleration event count',
  `harshBrakingCount` INT DEFAULT NULL COMMENT 'Harsh braking event count',
  `harshEvents` JSON DEFAULT NULL,
  `harshTurningCount` INT DEFAULT NULL COMMENT 'Harsh turning event count',
  `safetyScore` INT DEFAULT NULL COMMENT 'Safety Score',
  `safetyScoreRank` TEXT DEFAULT NULL COMMENT 'Safety Score Rank',
  `timeOverSpeedLimitMs` INT DEFAULT NULL COMMENT 'Amount of time driven over the speed limit in milliseconds',
  `totalDistanceDrivenMeters` INT DEFAULT NULL COMMENT 'Total distance driven in meters',
  `totalHarshEventCount` INT DEFAULT NULL COMMENT 'Total harsh event count',
  `totalTimeDrivenMs` INT DEFAULT NULL COMMENT 'Amount of time driven in milliseconds'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Safety score details for a driver';

--
-- Table structure for table `DriversResponse` generated from model 'DriversResponse'
--

CREATE TABLE IF NOT EXISTS `DriversResponse` (
  `drivers` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DriversSummaryResponse` generated from model 'DriversSummaryResponse'
--

CREATE TABLE IF NOT EXISTS `DriversSummaryResponse` (
  `Summaries` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DriversSummaryResponse_Summaries` generated from model 'DriversSummaryResponseUnderscoreSummaries'
--

CREATE TABLE IF NOT EXISTS `DriversSummaryResponse_Summaries` (
  `driverId` BIGINT DEFAULT NULL COMMENT 'ID of the driver.',
  `distanceMiles` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Distance driven in miles, rounded to two decimal places.',
  `driveMs` BIGINT DEFAULT NULL COMMENT 'Duration in milliseconds that driver was driving during the requested time range',
  `activeMs` BIGINT DEFAULT NULL COMMENT 'Duration in milliseconds that driver was on duty or driving during the requested time range',
  `driverUsername` TEXT DEFAULT NULL COMMENT 'Username of the driver.',
  `groupId` BIGINT DEFAULT NULL COMMENT 'Group of the driver.',
  `driverName` TEXT DEFAULT NULL COMMENT 'Name of the driver.',
  `onDutyMs` BIGINT DEFAULT NULL COMMENT 'Duration in milliseconds that driver was on duty during the requested time range'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DvirBase` generated from model 'DvirBase'
--

CREATE TABLE IF NOT EXISTS `DvirBase` (
  `authorSignature` TEXT DEFAULT NULL,
  `defectsCorrected` TINYINT(1) DEFAULT NULL COMMENT 'Signifies if the defects on the vehicle corrected after the DVIR is done.',
  `defectsNeedNotBeCorrected` TINYINT(1) DEFAULT NULL COMMENT 'Signifies if the defects on this vehicle can be ignored.',
  `id` BIGINT DEFAULT NULL COMMENT 'The id of this DVIR record.',
  `inspectionType` TEXT DEFAULT NULL COMMENT 'Inspection type of the DVIR.',
  `mechanicNotes` TEXT DEFAULT NULL COMMENT 'The mechanics notes on the DVIR.',
  `mechanicOrAgentSignature` TEXT DEFAULT NULL,
  `nextDriverSignature` TEXT DEFAULT NULL,
  `odometerMiles` BIGINT DEFAULT NULL COMMENT 'The odometer reading in miles for the vehicle when the DVIR was done.',
  `timeMs` BIGINT DEFAULT NULL COMMENT 'Timestamp of this DVIR in UNIX milliseconds.',
  `trailerDefects` JSON DEFAULT NULL COMMENT 'Defects registered for the trailer which was part of the DVIR.',
  `trailerId` INT DEFAULT NULL COMMENT 'The id of the trailer which was part of the DVIR.',
  `trailerName` TEXT DEFAULT NULL COMMENT 'The name of the trailer which was part of the DVIR.',
  `vehicle` TEXT DEFAULT NULL,
  `vehicleCondition` TEXT DEFAULT NULL COMMENT 'The condition of vechile on which DVIR was done.',
  `vehicleDefects` JSON DEFAULT NULL COMMENT 'Defects registered for the vehicle which was part of the DVIR.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DvirBase_authorSignature` generated from model 'DvirBaseUnderscoreauthorSignature'
-- The authors signature for the DVIR.
--

CREATE TABLE IF NOT EXISTS `DvirBase_authorSignature` (
  `mechanicUserId` BIGINT DEFAULT NULL COMMENT 'ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.',
  `driverId` BIGINT DEFAULT NULL COMMENT 'ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.',
  `name` TEXT DEFAULT NULL COMMENT 'The name of the driver or mechanic who signed the DVIR.',
  `signedAt` BIGINT DEFAULT NULL COMMENT 'The time in millis when the DVIR was signed',
  `type` TEXT DEFAULT NULL COMMENT 'Type corresponds to whether the signature corresponds to driver|mechanic.',
  `email` TEXT DEFAULT NULL COMMENT 'Email of the  driver|mechanic who signed the DVIR.',
  `username` TEXT DEFAULT NULL COMMENT 'Username of the  driver|mechanic who signed the DVIR.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The authors signature for the DVIR.';

--
-- Table structure for table `DvirBase_mechanicOrAgentSignature` generated from model 'DvirBaseUnderscoremechanicOrAgentSignature'
-- The mechanic&#39;s or agent&#39;s signature for the DVIR.
--

CREATE TABLE IF NOT EXISTS `DvirBase_mechanicOrAgentSignature` (
  `mechanicUserId` BIGINT DEFAULT NULL COMMENT 'ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned.',
  `driverId` BIGINT DEFAULT NULL COMMENT 'ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned.',
  `name` TEXT DEFAULT NULL COMMENT 'The name of the agent or mechanic who signed the DVIR.',
  `signedAt` BIGINT DEFAULT NULL COMMENT 'The time in millis when the DVIR was signed',
  `type` TEXT DEFAULT NULL COMMENT 'Type corresponds to whether the signature corresponds to driver|mechanic.',
  `email` TEXT DEFAULT NULL COMMENT 'Email of the  agent|mechanic who signed the DVIR.',
  `username` TEXT DEFAULT NULL COMMENT 'Username of the  agent|mechanic who signed the DVIR.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The mechanic&#39;s or agent&#39;s signature for the DVIR.';

--
-- Table structure for table `DvirBase_nextDriverSignature` generated from model 'DvirBaseUnderscorenextDriverSignature'
-- The next driver signature for the DVIR.
--

CREATE TABLE IF NOT EXISTS `DvirBase_nextDriverSignature` (
  `driverId` BIGINT DEFAULT NULL COMMENT 'ID of the driver who signed the DVIR',
  `name` TEXT DEFAULT NULL COMMENT 'The name of the driver who signed the next DVIR on this vehicle.',
  `signedAt` BIGINT DEFAULT NULL COMMENT 'The time in millis when the next driver signed the DVIR on this vehicle.',
  `type` TEXT DEFAULT NULL COMMENT 'Type corresponds to driver.',
  `email` TEXT DEFAULT NULL COMMENT 'Email of the  driver who signed the next DVIR on this vehicle.',
  `username` TEXT DEFAULT NULL COMMENT 'Username of the  driver who signed the next DVIR on this vehicle.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The next driver signature for the DVIR.';

--
-- Table structure for table `DvirBase_trailerDefects` generated from model 'DvirBaseUnderscoretrailerDefects'
--

CREATE TABLE IF NOT EXISTS `DvirBase_trailerDefects` (
  `comment` TEXT DEFAULT NULL COMMENT 'The comment describing the type of DVIR defect',
  `defectType` TEXT DEFAULT NULL COMMENT 'The type of DVIR defect'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `DvirBase_vehicle` generated from model 'DvirBaseUnderscorevehicle'
-- The vehicle on which DVIR was done.
--

CREATE TABLE IF NOT EXISTS `DvirBase_vehicle` (
  `name` TEXT DEFAULT NULL COMMENT 'The vehicle on which DVIR was done.',
  `id` BIGINT DEFAULT NULL COMMENT 'The vehicle id on which DVIR was done.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The vehicle on which DVIR was done.';

--
-- Table structure for table `DvirListResponse` generated from model 'DvirListResponse'
--

CREATE TABLE IF NOT EXISTS `DvirListResponse` (
  `dvirs` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EngineState` generated from model 'EngineState'
-- The state of the vehicle over time. State can be Running, Off, or Idle.
--

CREATE TABLE IF NOT EXISTS `EngineState` (
  `timeMs` JSON NOT NULL COMMENT 'Timestamp in Unix epoch milliseconds.',
  `value` ENUM('Running', 'Off', 'Idle') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='The state of the vehicle over time. State can be Running, Off, or Idle.';

--
-- Table structure for table `FleetVehicleLocation` generated from model 'FleetVehicleLocation'
-- Contains the location and speed of a vehicle at a particular time
--

CREATE TABLE IF NOT EXISTS `FleetVehicleLocation` (
  `latitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The latitude of the location in degrees.',
  `location` TEXT DEFAULT NULL COMMENT 'The best effort (street,city,state) for the latitude and longitude.',
  `longitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The longitude of the location in degrees.',
  `speedMilesPerHour` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The speed calculated from GPS that the asset was traveling at in miles per hour.',
  `timeMs` BIGINT DEFAULT NULL COMMENT 'Time in Unix milliseconds since epoch when the asset was at the location.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Contains the location and speed of a vehicle at a particular time';

--
-- Table structure for table `FleetVehicleResponse` generated from model 'FleetVehicleResponse'
-- A vehicle object as returned for fleet/vehicle
--

CREATE TABLE IF NOT EXISTS `FleetVehicleResponse` (
  `externalIds` JSON DEFAULT NULL,
  `harshAccelSetting` TEXT DEFAULT NULL COMMENT 'Harsh event detection setting.',
  `id` BIGINT NOT NULL COMMENT 'ID of the vehicle.',
  `name` TEXT NOT NULL COMMENT 'Name of the vehicle.',
  `vehicleInfo` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A vehicle object as returned for fleet/vehicle';

--
-- Table structure for table `FleetVehicleResponse_vehicleInfo` generated from model 'FleetVehicleResponseUnderscorevehicleInfo'
--

CREATE TABLE IF NOT EXISTS `FleetVehicleResponse_vehicleInfo` (
  `year` BIGINT DEFAULT NULL COMMENT 'Year of the vehicle.',
  `model` TEXT DEFAULT NULL COMMENT 'Model of the Vehicle.',
  `vin` TEXT DEFAULT NULL COMMENT 'Vehicle Identification Number.',
  `make` TEXT DEFAULT NULL COMMENT 'Make of the vehicle.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `HosAuthenticationLogsResponse` generated from model 'HosAuthenticationLogsResponse'
--

CREATE TABLE IF NOT EXISTS `HosAuthenticationLogsResponse` (
  `authenticationLogs` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `HosAuthenticationLogsResponse_authenticationLogs` generated from model 'HosAuthenticationLogsResponseUnderscoreauthenticationLogs'
--

CREATE TABLE IF NOT EXISTS `HosAuthenticationLogsResponse_authenticationLogs` (
  `actionType` TEXT DEFAULT NULL COMMENT 'The log type - one of &#39;signin&#39; or &#39;signout&#39;',
  `address` TEXT DEFAULT NULL COMMENT 'Address at which the log was recorded, if applicable.',
  `city` TEXT DEFAULT NULL COMMENT 'City in which the log was recorded, if applicable.',
  `happenedAtMs` BIGINT DEFAULT NULL COMMENT 'The time at which the event was recorded in UNIX milliseconds.',
  `addressName` TEXT DEFAULT NULL COMMENT 'Address name from the group address book at which the log was recorded, if applicable.',
  `state` TEXT DEFAULT NULL COMMENT 'State in which the log was recorded, if applicable.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `HosLogsResponse` generated from model 'HosLogsResponse'
--

CREATE TABLE IF NOT EXISTS `HosLogsResponse` (
  `logs` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `HosLogsResponse_logs` generated from model 'HosLogsResponseUnderscorelogs'
--

CREATE TABLE IF NOT EXISTS `HosLogsResponse_logs` (
  `locLng` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Longitude at which the log was recorded.',
  `logStartMs` BIGINT DEFAULT NULL COMMENT 'The time at which the log/HOS status started in UNIX milliseconds.',
  `driverId` BIGINT DEFAULT NULL COMMENT 'ID of the driver.',
  `statusType` TEXT DEFAULT NULL COMMENT 'The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.',
  `locCity` TEXT DEFAULT NULL COMMENT 'City in which the log was recorded.',
  `groupId` BIGINT DEFAULT NULL COMMENT 'ID of the group.',
  `locName` TEXT DEFAULT NULL COMMENT 'Name of location at which the log was recorded.',
  `locLat` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Latitude at which the log was recorded.',
  `remark` TEXT DEFAULT NULL COMMENT 'Remark associated with the log entry.',
  `locState` TEXT DEFAULT NULL COMMENT 'State in which the log was recorded.',
  `vehicleId` BIGINT DEFAULT NULL COMMENT 'ID of the vehicle.',
  `codriverIds` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `HosLogsSummaryResponse` generated from model 'HosLogsSummaryResponse'
--

CREATE TABLE IF NOT EXISTS `HosLogsSummaryResponse` (
  `drivers` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `HosLogsSummaryResponse_drivers` generated from model 'HosLogsSummaryResponseUnderscoredrivers'
--

CREATE TABLE IF NOT EXISTS `HosLogsSummaryResponse_drivers` (
  `timeUntilBreak` BIGINT DEFAULT NULL COMMENT 'The amount of time (in ms) remaining until the driver cannot drive without a rest break.',
  `vehicleName` TEXT DEFAULT NULL COMMENT 'Name of the vehicle.',
  `drivingInViolationToday` BIGINT DEFAULT NULL COMMENT 'The amount of driving time in violation today (in ms).',
  `driverId` BIGINT DEFAULT NULL COMMENT 'ID of the driver.',
  `cycleRemaining` BIGINT DEFAULT NULL COMMENT 'The amount of remaining cycle time (in ms).',
  `driverName` TEXT DEFAULT NULL COMMENT 'Name of the driver.',
  `dutyStatus` TEXT DEFAULT NULL COMMENT 'The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;.',
  `cycleTomorrow` BIGINT DEFAULT NULL COMMENT 'The amount of cycle time (in ms) available tomorrow.',
  `shiftDriveRemaining` BIGINT DEFAULT NULL COMMENT 'The amount of remaining shift drive time (in ms).',
  `timeInCurrentStatus` BIGINT DEFAULT NULL COMMENT 'The amount of time (in ms) that the driver has been in the current &#x60;dutyStatus&#x60;.',
  `drivingInViolationCycle` BIGINT DEFAULT NULL COMMENT 'The amount of driving time in violation in this cycle (in ms).',
  `shiftRemaining` BIGINT DEFAULT NULL COMMENT 'The amount of remaining shift time (in ms).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `HumidityResponse` generated from model 'HumidityResponse'
-- Contains the current humidity of a sensor.
--

CREATE TABLE IF NOT EXISTS `HumidityResponse` (
  `groupId` BIGINT DEFAULT NULL,
  `sensors` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Contains the current humidity of a sensor.';

--
-- Table structure for table `HumidityResponse_sensors` generated from model 'HumidityResponseUnderscoresensors'
--

CREATE TABLE IF NOT EXISTS `HumidityResponse_sensors` (
  `name` TEXT DEFAULT NULL COMMENT 'Name of the sensor.',
  `humidity` INT DEFAULT NULL COMMENT 'Currently reported relative humidity in percent, from 0-100.',
  `id` BIGINT DEFAULT NULL COMMENT 'ID of the sensor.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object` generated from model 'inlineUnderscoreobject'
--

CREATE TABLE IF NOT EXISTS `inline_object` (
  `addresses` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_1` generated from model 'inlineUnderscoreobjectUnderscore1'
--

CREATE TABLE IF NOT EXISTS `inline_object_1` (
  `contactIds` JSON DEFAULT NULL COMMENT 'A list of IDs for contact book entries.',
  `formattedAddress` TEXT DEFAULT NULL COMMENT 'The full address associated with this address/geofence, as it might be recognized by maps.google.com',
  `geofence` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL COMMENT 'The name of this address/geofence',
  `notes` TEXT DEFAULT NULL COMMENT 'Notes associated with an address.',
  `tagIds` JSON DEFAULT NULL COMMENT 'A list of tag IDs.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_10` generated from model 'inlineUnderscoreobjectUnderscore10'
--

CREATE TABLE IF NOT EXISTS `inline_object_10` (
  `groupId` BIGINT NOT NULL COMMENT 'Group ID to query.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_11` generated from model 'inlineUnderscoreobjectUnderscore11'
--

CREATE TABLE IF NOT EXISTS `inline_object_11` (
  `groupId` BIGINT NOT NULL COMMENT 'Group ID to query.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_12` generated from model 'inlineUnderscoreobjectUnderscore12'
--

CREATE TABLE IF NOT EXISTS `inline_object_12` (
  `inspectionType` ENUM('mechanic') NOT NULL COMMENT 'Only type &#39;mechanic&#39; is currently accepted.',
  `mechanicNotes` TEXT DEFAULT NULL COMMENT 'Any notes from the mechanic.',
  `odometerMiles` INT DEFAULT NULL COMMENT 'The current odometer of the vehicle.',
  `previousDefectsCorrected` TINYINT(1) DEFAULT NULL COMMENT 'Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.',
  `previousDefectsIgnored` TINYINT(1) DEFAULT NULL COMMENT 'Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true.',
  `safe` ENUM('safe', 'unsafe') NOT NULL COMMENT 'Whether or not this vehicle or trailer is safe to drive.',
  `trailerId` INT DEFAULT NULL COMMENT 'Id of trailer being inspected. Either vehicleId or trailerId must be provided.',
  `userEmail` TEXT NOT NULL COMMENT 'The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user&#39;s email.',
  `vehicleId` INT DEFAULT NULL COMMENT 'Id of vehicle being inspected. Either vehicleId or trailerId must be provided.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_13` generated from model 'inlineUnderscoreobjectUnderscore13'
--

CREATE TABLE IF NOT EXISTS `inline_object_13` (
  `groupId` BIGINT NOT NULL COMMENT 'Group ID to query.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_14` generated from model 'inlineUnderscoreobjectUnderscore14'
--

CREATE TABLE IF NOT EXISTS `inline_object_14` (
  `groupId` BIGINT NOT NULL COMMENT 'Group ID to query.',
  `vehicles` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_15` generated from model 'inlineUnderscoreobjectUnderscore15'
--

CREATE TABLE IF NOT EXISTS `inline_object_15` (
  `endMs` INT NOT NULL COMMENT 'End of the time range, specified in milliseconds UNIX time.',
  `groupId` BIGINT NOT NULL COMMENT 'Group ID to query.',
  `startMs` INT NOT NULL COMMENT 'Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs',
  `vehicleId` BIGINT NOT NULL COMMENT 'Vehicle ID to query.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_16` generated from model 'inlineUnderscoreobjectUnderscore16'
--

CREATE TABLE IF NOT EXISTS `inline_object_16` (
  `externalIds` JSON DEFAULT NULL,
  `harsh_accel_setting` INT DEFAULT NULL COMMENT 'Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic',
  `name` TEXT DEFAULT NULL COMMENT 'Name'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_17` generated from model 'inlineUnderscoreobjectUnderscore17'
--

CREATE TABLE IF NOT EXISTS `inline_object_17` (
  `endMs` INT NOT NULL COMMENT 'End of the time range, specified in milliseconds UNIX time.',
  `groupId` BIGINT NOT NULL COMMENT 'Group ID to query.',
  `startMs` INT NOT NULL COMMENT 'Beginning of the time range, specified in milliseconds UNIX time.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_18` generated from model 'inlineUnderscoreobjectUnderscore18'
--

CREATE TABLE IF NOT EXISTS `inline_object_18` (
  `groupId` BIGINT NOT NULL COMMENT 'Group ID to query.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_19` generated from model 'inlineUnderscoreobjectUnderscore19'
--

CREATE TABLE IF NOT EXISTS `inline_object_19` (
  `groupId` BIGINT NOT NULL COMMENT 'Group ID to query.',
  `sensors` JSON NOT NULL COMMENT 'List of sensor IDs to query.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_2` generated from model 'inlineUnderscoreobjectUnderscore2'
--

CREATE TABLE IF NOT EXISTS `inline_object_2` (
  `address` TEXT NOT NULL COMMENT 'The address of the entry to add, as it would be recognized if provided to maps.google.com.',
  `groupId` BIGINT NOT NULL COMMENT 'Group ID to query.',
  `name` TEXT NOT NULL COMMENT 'Name of the location to add to the address book.',
  `radius` INT NOT NULL COMMENT 'Radius in meters of the address (used for matching vehicle trip stops to this location).'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_20` generated from model 'inlineUnderscoreobjectUnderscore20'
--

CREATE TABLE IF NOT EXISTS `inline_object_20` (
  `groupId` BIGINT NOT NULL COMMENT 'Group ID to query.',
  `sensors` JSON NOT NULL COMMENT 'List of sensor IDs to query.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_21` generated from model 'inlineUnderscoreobjectUnderscore21'
--

CREATE TABLE IF NOT EXISTS `inline_object_21` (
  `endMs` INT NOT NULL COMMENT 'End of the time range, specified in milliseconds UNIX time.',
  `fillMissing` ENUM('withNull', 'withPrevious') DEFAULT 'withNull',
  `groupId` BIGINT NOT NULL COMMENT 'Group ID to query.',
  `series` JSON NOT NULL,
  `startMs` INT NOT NULL COMMENT 'Beginning of the time range, specified in milliseconds UNIX time.',
  `stepMs` INT NOT NULL COMMENT 'Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_22` generated from model 'inlineUnderscoreobjectUnderscore22'
--

CREATE TABLE IF NOT EXISTS `inline_object_22` (
  `groupId` BIGINT NOT NULL COMMENT 'Group ID to query.',
  `sensors` JSON NOT NULL COMMENT 'List of sensor IDs to query.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_23` generated from model 'inlineUnderscoreobjectUnderscore23'
--

CREATE TABLE IF NOT EXISTS `inline_object_23` (
  `groupId` BIGINT NOT NULL COMMENT 'Group ID to query.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_24` generated from model 'inlineUnderscoreobjectUnderscore24'
--

CREATE TABLE IF NOT EXISTS `inline_object_24` (
  `groupId` BIGINT NOT NULL COMMENT 'Group ID to query.',
  `sensors` JSON NOT NULL COMMENT 'List of sensor IDs to query.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_3` generated from model 'inlineUnderscoreobjectUnderscore3'
--

CREATE TABLE IF NOT EXISTS `inline_object_3` (
  `groupId` BIGINT NOT NULL COMMENT 'Group ID to query.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_4` generated from model 'inlineUnderscoreobjectUnderscore4'
--

CREATE TABLE IF NOT EXISTS `inline_object_4` (
  `reactivate` TINYINT(1) NOT NULL COMMENT 'True indicates that this driver should be reactivated.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_5` generated from model 'inlineUnderscoreobjectUnderscore5'
--

CREATE TABLE IF NOT EXISTS `inline_object_5` (
  `endMs` BIGINT NOT NULL COMMENT 'End time (ms) of queried time period.',
  `orgId` BIGINT NOT NULL COMMENT 'Org ID to query.',
  `startMs` BIGINT NOT NULL COMMENT 'Start time (ms) of queried time period.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_6` generated from model 'inlineUnderscoreobjectUnderscore6'
--

CREATE TABLE IF NOT EXISTS `inline_object_6` (
  `driverId` BIGINT NOT NULL COMMENT 'Driver ID to query.',
  `endMs` INT NOT NULL COMMENT 'End of the time range, specified in milliseconds UNIX time.',
  `groupId` BIGINT NOT NULL COMMENT 'Group ID to query.',
  `startMs` INT NOT NULL COMMENT 'Beginning of the time range, specified in milliseconds UNIX time.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_7` generated from model 'inlineUnderscoreobjectUnderscore7'
--

CREATE TABLE IF NOT EXISTS `inline_object_7` (
  `driverId` BIGINT NOT NULL COMMENT 'Driver ID to query.',
  `endMs` INT NOT NULL COMMENT 'End of the time range, specified in milliseconds UNIX time.',
  `groupId` BIGINT NOT NULL COMMENT 'Group ID to query.',
  `startMs` INT NOT NULL COMMENT 'Beginning of the time range, specified in milliseconds UNIX time.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_8` generated from model 'inlineUnderscoreobjectUnderscore8'
--

CREATE TABLE IF NOT EXISTS `inline_object_8` (
  `driverId` BIGINT NOT NULL COMMENT 'Driver ID to query.',
  `endMs` INT NOT NULL COMMENT 'End of the time range, specified in milliseconds UNIX time.',
  `groupId` BIGINT NOT NULL COMMENT 'Group ID to query.',
  `startMs` INT NOT NULL COMMENT 'Beginning of the time range, specified in milliseconds UNIX time.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_object_9` generated from model 'inlineUnderscoreobjectUnderscore9'
--

CREATE TABLE IF NOT EXISTS `inline_object_9` (
  `groupId` BIGINT NOT NULL COMMENT 'Group ID to query.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_response_200` generated from model 'inlineUnderscoreresponseUnderscore200'
--

CREATE TABLE IF NOT EXISTS `inline_response_200` (
  `assets` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_response_200_1` generated from model 'inlineUnderscoreresponseUnderscore200Underscore1'
--

CREATE TABLE IF NOT EXISTS `inline_response_200_1` (
  `assets` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_response_200_2` generated from model 'inlineUnderscoreresponseUnderscore200Underscore2'
--

CREATE TABLE IF NOT EXISTS `inline_response_200_2` (
  `pagination` TEXT DEFAULT NULL,
  `groupId` BIGINT DEFAULT NULL COMMENT 'Group ID to query.',
  `vehicles` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_response_200_3` generated from model 'inlineUnderscoreresponseUnderscore200Underscore3'
--

CREATE TABLE IF NOT EXISTS `inline_response_200_3` (
  `groupId` BIGINT DEFAULT NULL COMMENT 'Group ID to query.',
  `vehicles` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_response_200_4` generated from model 'inlineUnderscoreresponseUnderscore200Underscore4'
--

CREATE TABLE IF NOT EXISTS `inline_response_200_4` (
  `vehicles` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_response_200_5` generated from model 'inlineUnderscoreresponseUnderscore200Underscore5'
--

CREATE TABLE IF NOT EXISTS `inline_response_200_5` (
  `pagination` TEXT DEFAULT NULL,
  `vehicleStats` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_response_200_5_vehicleStats` generated from model 'inlineUnderscoreresponseUnderscore200Underscore5UnderscorevehicleStats'
--

CREATE TABLE IF NOT EXISTS `inline_response_200_5_vehicleStats` (
  `engineState` JSON DEFAULT NULL,
  `auxInput2` TEXT DEFAULT NULL,
  `vehicleId` BIGINT NOT NULL COMMENT 'ID of the vehicle.',
  `auxInput1` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_response_200_6` generated from model 'inlineUnderscoreresponseUnderscore200Underscore6'
--

CREATE TABLE IF NOT EXISTS `inline_response_200_6` (
  `dataInputs` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_response_200_7` generated from model 'inlineUnderscoreresponseUnderscore200Underscore7'
--

CREATE TABLE IF NOT EXISTS `inline_response_200_7` (
  `machines` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_response_200_8` generated from model 'inlineUnderscoreresponseUnderscore200Underscore8'
--

CREATE TABLE IF NOT EXISTS `inline_response_200_8` (
  `sensors` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `inline_response_200_9` generated from model 'inlineUnderscoreresponseUnderscore200Underscore9'
--

CREATE TABLE IF NOT EXISTS `inline_response_200_9` (
  `tags` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `jobUpdateObject` generated from model 'jobUpdateObject'
--

CREATE TABLE IF NOT EXISTS `jobUpdateObject` (
  `changed_at_ms` BIGINT DEFAULT NULL COMMENT 'Timestamp that this event was updated, represented as Unix milliseconds since epoch.',
  `job_id` BIGINT DEFAULT NULL COMMENT 'ID of the Samsara job.',
  `job_state` TEXT DEFAULT NULL,
  `prev_job_state` TEXT DEFAULT NULL,
  `route` TEXT DEFAULT NULL,
  `route_id` BIGINT DEFAULT NULL COMMENT 'ID of the Samsara dispatch route.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Machine` generated from model 'Machine'
-- Contains information about a machine.
--

CREATE TABLE IF NOT EXISTS `Machine` (
  `id` BIGINT NOT NULL COMMENT 'ID of the machine.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the machine.',
  `notes` TEXT DEFAULT NULL COMMENT 'Notes about the machine'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Contains information about a machine.';

--
-- Table structure for table `MachineHistoryResponse` generated from model 'MachineHistoryResponse'
-- Contains the results for a machine history request
--

CREATE TABLE IF NOT EXISTS `MachineHistoryResponse` (
  `machines` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Contains the results for a machine history request';

--
-- Table structure for table `MachineHistoryResponse_machines` generated from model 'MachineHistoryResponseUnderscoremachines'
--

CREATE TABLE IF NOT EXISTS `MachineHistoryResponse_machines` (
  `name` TEXT DEFAULT NULL COMMENT 'Machine name',
  `id` INT DEFAULT NULL COMMENT 'Machine ID',
  `vibrations` JSON DEFAULT NULL COMMENT 'List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MachineHistoryResponse_vibrations` generated from model 'MachineHistoryResponseUnderscorevibrations'
--

CREATE TABLE IF NOT EXISTS `MachineHistoryResponse_vibrations` (
  `X` DECIMAL(20, 9) DEFAULT NULL,
  `Y` DECIMAL(20, 9) DEFAULT NULL,
  `Z` DECIMAL(20, 9) DEFAULT NULL,
  `time` BIGINT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Pagination` generated from model 'Pagination'
--

CREATE TABLE IF NOT EXISTS `Pagination` (
  `endCursor` TEXT NOT NULL COMMENT 'Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;starting_after&#39; query parameter.',
  `hasNextPage` TINYINT(1) NOT NULL COMMENT 'True if there are more pages of results after this response.',
  `hasPrevPage` TINYINT(1) NOT NULL COMMENT 'True if there are more pages of results before this response.',
  `startCursor` TEXT NOT NULL COMMENT 'Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;ending_before&#39; query parameter.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SafetyReportHarshEvent` generated from model 'SafetyReportHarshEvent'
-- List of harsh events
--

CREATE TABLE IF NOT EXISTS `SafetyReportHarshEvent` (
  `harshEventType` TEXT DEFAULT NULL COMMENT 'Type of the harsh event',
  `timestampMs` INT DEFAULT NULL COMMENT 'Timestamp that the harsh event occurred in Unix milliseconds since epoch',
  `vehicleId` INT DEFAULT NULL COMMENT 'Vehicle associated with the harsh event'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='List of harsh events';

--
-- Table structure for table `Sensor` generated from model 'Sensor'
-- Contains information about a sensor.
--

CREATE TABLE IF NOT EXISTS `Sensor` (
  `id` BIGINT NOT NULL COMMENT 'ID of the sensor.',
  `macAddress` TEXT DEFAULT NULL COMMENT 'MAC address of the sensor.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the sensor.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Contains information about a sensor.';

--
-- Table structure for table `SensorHistoryResponse` generated from model 'SensorHistoryResponse'
-- Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair.
--

CREATE TABLE IF NOT EXISTS `SensorHistoryResponse` (
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair.';

--
-- Table structure for table `SensorHistoryResponse_results` generated from model 'SensorHistoryResponseUnderscoreresults'
--

CREATE TABLE IF NOT EXISTS `SensorHistoryResponse_results` (
  `series` JSON DEFAULT NULL COMMENT 'List of datapoints, one for each requested (sensor, field) pair.',
  `timeMs` INT DEFAULT NULL COMMENT 'Timestamp in UNIX milliseconds.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `_sensors_history_series` generated from model 'UnderscoresensorsUnderscorehistoryUnderscoreseries'
-- Sensor ID and field to query.
--

CREATE TABLE IF NOT EXISTS `_sensors_history_series` (
  `field` ENUM('ambientTemperature', 'probeTemperature', 'currentLoop1Raw', 'currentLoop1Mapped', 'currentLoop2Raw', 'currentLoop2Mapped', 'pmPowerTotal', 'pmPhase1Power', 'pmPhase2Power', 'pmPhase3Power', 'pmPhase1PowerFactor', 'pmPhase2PowerFactor', 'pmPhase3PowerFactor') NOT NULL COMMENT 'Field to query.',
  `widgetId` BIGINT NOT NULL COMMENT 'Sensor ID to query.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Sensor ID and field to query.';

--
-- Table structure for table `Tag` generated from model 'Tag'
--

CREATE TABLE IF NOT EXISTS `Tag` (
  `addresses` JSON DEFAULT NULL COMMENT 'The addresses that belong to this tag.',
  `assets` JSON DEFAULT NULL COMMENT 'The assets that belong to this tag.',
  `drivers` JSON DEFAULT NULL COMMENT 'The drivers that belong to this tag.',
  `groupId` BIGINT DEFAULT NULL COMMENT 'The GroupID that this tag belongs to.',
  `id` BIGINT NOT NULL COMMENT 'The ID of this tag.',
  `machines` JSON DEFAULT NULL COMMENT 'The machines that belong to this tag.',
  `name` TEXT NOT NULL COMMENT 'Name of this tag.',
  `parentTagId` BIGINT DEFAULT NULL COMMENT 'If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.',
  `sensors` JSON DEFAULT NULL COMMENT 'The sensors that belong to this tag.',
  `vehicles` JSON DEFAULT NULL COMMENT 'The vehicles that belong to this tag.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TagCreate` generated from model 'TagCreate'
--

CREATE TABLE IF NOT EXISTS `TagCreate` (
  `assets` JSON DEFAULT NULL COMMENT 'The assets that belong to this tag.',
  `drivers` JSON DEFAULT NULL COMMENT 'The drivers that belong to this tag.',
  `machines` JSON DEFAULT NULL COMMENT 'The machines that belong to this tag.',
  `name` TEXT NOT NULL COMMENT 'Name of this tag.',
  `parentTagId` BIGINT DEFAULT NULL COMMENT 'If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.',
  `sensors` JSON DEFAULT NULL COMMENT 'The sensors that belong to this tag.',
  `vehicles` JSON DEFAULT NULL COMMENT 'The vehicles that belong to this tag.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TagMetadata` generated from model 'TagMetadata'
--

CREATE TABLE IF NOT EXISTS `TagMetadata` (
  `id` BIGINT NOT NULL COMMENT 'The ID of this tag.',
  `name` TEXT NOT NULL COMMENT 'Name of this tag.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TagModify` generated from model 'TagModify'
--

CREATE TABLE IF NOT EXISTS `TagModify` (
  `add` TEXT DEFAULT NULL,
  `delete` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL COMMENT 'Updated name of this tag.',
  `parentTagId` BIGINT DEFAULT NULL COMMENT 'If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TagModify_add` generated from model 'TagModifyUnderscoreadd'
-- Specify devices, etc. that should be added to the tag.
--

CREATE TABLE IF NOT EXISTS `TagModify_add` (
  `assets` JSON DEFAULT NULL COMMENT 'The assets to be added to this tag.',
  `sensors` JSON DEFAULT NULL COMMENT 'The sensors to be added to this tag.',
  `vehicles` JSON DEFAULT NULL COMMENT 'The vehicles to be added to this tag.',
  `machines` JSON DEFAULT NULL COMMENT 'The machines to be added to this tag.',
  `drivers` JSON DEFAULT NULL COMMENT 'The drivers to be added to this tag.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Specify devices, etc. that should be added to the tag.';

--
-- Table structure for table `TagModify_delete` generated from model 'TagModifyUnderscoredelete'
-- Specify devices, etc. that should be removed from the tag.
--

CREATE TABLE IF NOT EXISTS `TagModify_delete` (
  `assets` JSON DEFAULT NULL COMMENT 'The assets to be removed from this tag.',
  `sensors` JSON DEFAULT NULL COMMENT 'The sensors to be removed from this tag.',
  `vehicles` JSON DEFAULT NULL COMMENT 'The vehicles to be removed from this tag.',
  `machines` JSON DEFAULT NULL COMMENT 'The machines to be removed from this tag.',
  `drivers` JSON DEFAULT NULL COMMENT 'The drivers to be removed from this tag.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Specify devices, etc. that should be removed from the tag.';

--
-- Table structure for table `TagUpdate` generated from model 'TagUpdate'
--

CREATE TABLE IF NOT EXISTS `TagUpdate` (
  `assets` JSON DEFAULT NULL COMMENT 'The assets that belong to this tag.',
  `drivers` JSON DEFAULT NULL COMMENT 'The drivers that belong to this tag.',
  `machines` JSON DEFAULT NULL COMMENT 'The machines that belong to this tag.',
  `name` TEXT DEFAULT NULL COMMENT 'Updated name of this tag.',
  `parentTagId` BIGINT DEFAULT NULL COMMENT 'If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.',
  `sensors` JSON DEFAULT NULL COMMENT 'The sensors that belong to this tag.',
  `vehicles` JSON DEFAULT NULL COMMENT 'The vehicles that belong to this tag.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TaggedAddress` generated from model 'TaggedAddress'
--

CREATE TABLE IF NOT EXISTS `TaggedAddress` (
  `id` BIGINT NOT NULL COMMENT 'The ID of the address being tagged.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the address being tagged.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TaggedAddressBase` generated from model 'TaggedAddressBase'
--

CREATE TABLE IF NOT EXISTS `TaggedAddressBase` (
  `id` BIGINT NOT NULL COMMENT 'The ID of the address being tagged.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TaggedAsset` generated from model 'TaggedAsset'
--

CREATE TABLE IF NOT EXISTS `TaggedAsset` (
  `id` BIGINT NOT NULL COMMENT 'The ID of the Asset being tagged.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the Asset being tagged.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TaggedAssetBase` generated from model 'TaggedAssetBase'
--

CREATE TABLE IF NOT EXISTS `TaggedAssetBase` (
  `id` BIGINT NOT NULL COMMENT 'The ID of the Asset being tagged.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TaggedDriver` generated from model 'TaggedDriver'
--

CREATE TABLE IF NOT EXISTS `TaggedDriver` (
  `id` BIGINT NOT NULL COMMENT 'The ID of the Driver being tagged.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the Driver being tagged.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TaggedDriverBase` generated from model 'TaggedDriverBase'
--

CREATE TABLE IF NOT EXISTS `TaggedDriverBase` (
  `id` BIGINT NOT NULL COMMENT 'The ID of the Driver being tagged.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TaggedMachine` generated from model 'TaggedMachine'
--

CREATE TABLE IF NOT EXISTS `TaggedMachine` (
  `id` BIGINT NOT NULL COMMENT 'The ID of the Machine being tagged.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the Machine being tagged.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TaggedMachineBase` generated from model 'TaggedMachineBase'
--

CREATE TABLE IF NOT EXISTS `TaggedMachineBase` (
  `id` BIGINT NOT NULL COMMENT 'The ID of the Machine being tagged.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TaggedSensor` generated from model 'TaggedSensor'
--

CREATE TABLE IF NOT EXISTS `TaggedSensor` (
  `id` BIGINT NOT NULL COMMENT 'The ID of the Sensor being tagged.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the Sensor being tagged.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TaggedSensorBase` generated from model 'TaggedSensorBase'
--

CREATE TABLE IF NOT EXISTS `TaggedSensorBase` (
  `id` BIGINT NOT NULL COMMENT 'The ID of the Sensor being tagged.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TaggedVehicle` generated from model 'TaggedVehicle'
--

CREATE TABLE IF NOT EXISTS `TaggedVehicle` (
  `id` BIGINT NOT NULL COMMENT 'The ID of the Vehicle being tagged.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the Vehicle being tagged.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TaggedVehicleBase` generated from model 'TaggedVehicleBase'
--

CREATE TABLE IF NOT EXISTS `TaggedVehicleBase` (
  `id` BIGINT NOT NULL COMMENT 'The ID of the Vehicle being tagged.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TemperatureResponse` generated from model 'TemperatureResponse'
-- Contains the current temperatures of a sensor.
--

CREATE TABLE IF NOT EXISTS `TemperatureResponse` (
  `groupId` BIGINT DEFAULT NULL,
  `sensors` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Contains the current temperatures of a sensor.';

--
-- Table structure for table `TemperatureResponse_sensors` generated from model 'TemperatureResponseUnderscoresensors'
--

CREATE TABLE IF NOT EXISTS `TemperatureResponse_sensors` (
  `probeTemperature` INT DEFAULT NULL COMMENT 'Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the sensor.',
  `id` BIGINT DEFAULT NULL COMMENT 'ID of the sensor.',
  `ambientTemperature` INT DEFAULT NULL COMMENT 'Currently reported ambient temperature in millidegrees celsius.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TripResponse` generated from model 'TripResponse'
-- Contains the trips for the vehicle in the requested timeframe. A trip is represented as an object that contains startMs, startLocation, startAddress, startCoordinates, endMs, endLocation, endAddress and endCoordinates.
--

CREATE TABLE IF NOT EXISTS `TripResponse` (
  `trips` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Contains the trips for the vehicle in the requested timeframe. A trip is represented as an object that contains startMs, startLocation, startAddress, startCoordinates, endMs, endLocation, endAddress and endCoordinates.';

--
-- Table structure for table `TripResponse_endCoordinates` generated from model 'TripResponseUnderscoreendCoordinates'
-- End (latitude, longitude) in decimal degrees.
--

CREATE TABLE IF NOT EXISTS `TripResponse_endCoordinates` (
  `latitude` DECIMAL(20, 9) DEFAULT NULL,
  `longitude` DECIMAL(20, 9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='End (latitude, longitude) in decimal degrees.';

--
-- Table structure for table `TripResponse_startCoordinates` generated from model 'TripResponseUnderscorestartCoordinates'
-- Start (latitude, longitude) in decimal degrees.
--

CREATE TABLE IF NOT EXISTS `TripResponse_startCoordinates` (
  `latitude` DECIMAL(20, 9) DEFAULT NULL,
  `longitude` DECIMAL(20, 9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Start (latitude, longitude) in decimal degrees.';

--
-- Table structure for table `TripResponse_trips` generated from model 'TripResponseUnderscoretrips'
--

CREATE TABLE IF NOT EXISTS `TripResponse_trips` (
  `endOdometer` INT DEFAULT NULL COMMENT 'Odometer reading at the end of the trip.',
  `distanceMeters` INT DEFAULT NULL COMMENT 'Length of the trip in meters.',
  `endMs` INT DEFAULT NULL COMMENT 'End of the trip in UNIX milliseconds.',
  `startMs` INT DEFAULT NULL COMMENT 'Beginning of the trip in UNIX milliseconds.',
  `fuelConsumedMl` INT DEFAULT NULL COMMENT 'Amount in milliliters of fuel consumed on this trip.',
  `startAddress` TEXT DEFAULT NULL COMMENT 'Text representation of nearest identifiable location to the start (latitude, longitude) coordinates.',
  `startCoordinates` TEXT DEFAULT NULL,
  `endCoordinates` TEXT DEFAULT NULL,
  `startOdometer` INT DEFAULT NULL COMMENT 'Odometer reading at the beginning of the trip.',
  `driverId` INT DEFAULT NULL COMMENT 'ID of the driver.',
  `startLocation` TEXT DEFAULT NULL COMMENT 'Geocoded street address of start (latitude, longitude) coordinates.',
  `tollMeters` INT DEFAULT NULL COMMENT 'Length in meters trip spent on toll roads.',
  `endAddress` TEXT DEFAULT NULL COMMENT 'Text representation of nearest identifiable location to the end (latitude, longitude) coordinates.',
  `endLocation` TEXT DEFAULT NULL COMMENT 'Geocoded street address of start (latitude, longitude) coordinates.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `User` generated from model 'User'
--

CREATE TABLE IF NOT EXISTS `User` (
  `authType` ENUM('default', 'saml') NOT NULL COMMENT 'The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.',
  `email` TEXT NOT NULL COMMENT 'The email address of this user.',
  `name` TEXT DEFAULT NULL COMMENT 'The first and last name of the user.',
  `organizationRoleId` TEXT DEFAULT NULL COMMENT 'The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.',
  `id` BIGINT DEFAULT NULL COMMENT 'The ID of the User record.',
  `organizationRole` TEXT DEFAULT NULL COMMENT 'The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.',
  `tagRoles` JSON DEFAULT NULL COMMENT 'The specific tags this user has access to. This will be blank for users that have full access to the organization.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UserBase` generated from model 'UserBase'
--

CREATE TABLE IF NOT EXISTS `UserBase` (
  `authType` ENUM('default', 'saml') NOT NULL COMMENT 'The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.',
  `email` TEXT NOT NULL COMMENT 'The email address of this user.',
  `name` TEXT DEFAULT NULL COMMENT 'The first and last name of the user.',
  `organizationRoleId` TEXT DEFAULT NULL COMMENT 'The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UserRole` generated from model 'UserRole'
--

CREATE TABLE IF NOT EXISTS `UserRole` (
  `id` TEXT DEFAULT NULL,
  `name` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UserTagRole` generated from model 'UserTagRole'
--

CREATE TABLE IF NOT EXISTS `UserTagRole` (
  `role` TEXT DEFAULT NULL COMMENT 'The name of the role the user has been granted on this tag.',
  `roleId` TEXT NOT NULL COMMENT 'The id of the role the user has been granted on this tag.',
  `tag` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `UserTagRole_tag` generated from model 'UserTagRoleUnderscoretag'
--

CREATE TABLE IF NOT EXISTS `UserTagRole_tag` (
  `parentTagId` BIGINT DEFAULT NULL COMMENT 'The ID of this tag.',
  `name` TEXT NOT NULL COMMENT 'Name of this tag.',
  `id` BIGINT NOT NULL COMMENT 'The ID of this tag.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Vehicle` generated from model 'Vehicle'
-- A vehicle object.
--

CREATE TABLE IF NOT EXISTS `Vehicle` (
  `engineHours` BIGINT DEFAULT NULL COMMENT 'Total engine hours for the vehicle.',
  `fuelLevelPercent` DECIMAL(20, 9) DEFAULT NULL COMMENT 'The fuel level of the vehicle as a percentage. (0.0 to 1.0)',
  `id` BIGINT NOT NULL COMMENT 'ID of the vehicle.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the vehicle.',
  `note` TEXT DEFAULT NULL,
  `odometerMeters` BIGINT DEFAULT NULL COMMENT 'The number of meters reported by the odometer.',
  `vin` TEXT DEFAULT NULL COMMENT 'Vehicle Identification Number.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='A vehicle object.';

--
-- Table structure for table `VehicleHarshEventResponse` generated from model 'VehicleHarshEventResponse'
-- Harsh event details for a vehicle
--

CREATE TABLE IF NOT EXISTS `VehicleHarshEventResponse` (
  `downloadForwardVideoUrl` TEXT DEFAULT NULL COMMENT 'URL for downloading the forward facing video',
  `downloadInwardVideoUrl` TEXT DEFAULT NULL COMMENT 'URL for downloading the inward facing video',
  `downloadTrackedInwardVideoUrl` TEXT DEFAULT NULL COMMENT 'URL for downloading the tracked inward facing video',
  `harshEventType` TEXT NOT NULL COMMENT 'Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event]',
  `incidentReportUrl` TEXT NOT NULL COMMENT 'URL of the associated incident report page',
  `isDistracted` TINYINT(1) DEFAULT NULL COMMENT 'Whether the driver was deemed distracted during this harsh event',
  `location` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Harsh event details for a vehicle';

--
-- Table structure for table `VehicleHarshEventResponse_location` generated from model 'VehicleHarshEventResponseUnderscorelocation'
--

CREATE TABLE IF NOT EXISTS `VehicleHarshEventResponse_location` (
  `address` TEXT DEFAULT NULL COMMENT 'Address of location where the harsh event occurred',
  `latitude` TEXT DEFAULT NULL COMMENT 'Latitude of location where the harsh event occurred',
  `longitude` TEXT DEFAULT NULL COMMENT 'Longitude of location where the harsh event occurred'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `VehicleLocation` generated from model 'VehicleLocation'
-- Contains the location, in latitude and longitude, of a vehicle.
--

CREATE TABLE IF NOT EXISTS `VehicleLocation` (
  `heading` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Heading in degrees.',
  `id` BIGINT NOT NULL COMMENT 'ID of the vehicle.',
  `latitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Latitude in decimal degrees.',
  `location` TEXT DEFAULT NULL COMMENT 'Text representation of nearest identifiable location to (latitude, longitude) coordinates.',
  `longitude` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Longitude in decimal degrees.',
  `name` TEXT DEFAULT NULL COMMENT 'Name of the vehicle.',
  `odometerMeters` BIGINT DEFAULT NULL COMMENT 'The number of meters reported by the odometer.',
  `onTrip` TINYINT(1) DEFAULT NULL COMMENT 'Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint.',
  `speed` DECIMAL(20, 9) DEFAULT NULL COMMENT 'Speed in miles per hour.',
  `time` INT DEFAULT NULL COMMENT 'The time the reported location was logged, reported as a UNIX timestamp in milliseconds.',
  `vin` TEXT DEFAULT NULL COMMENT 'Vehicle Identification Number (VIN) of the vehicle.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Contains the location, in latitude and longitude, of a vehicle.';

--
-- Table structure for table `VehicleMaintenance` generated from model 'VehicleMaintenance'
-- Contains any J1939/Passenger engine light warnings and engine faults.
--

CREATE TABLE IF NOT EXISTS `VehicleMaintenance` (
  `id` BIGINT NOT NULL COMMENT 'ID of the vehicle.',
  `j1939` TEXT DEFAULT NULL,
  `passenger` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Contains any J1939/Passenger engine light warnings and engine faults.';

--
-- Table structure for table `VehicleMaintenance_j1939` generated from model 'VehicleMaintenanceUnderscorej1939'
-- J1939 based data. Null if no data is available.
--

CREATE TABLE IF NOT EXISTS `VehicleMaintenance_j1939` (
  `checkEngineLight` TEXT DEFAULT NULL,
  `diagnosticTroubleCodes` JSON DEFAULT NULL COMMENT 'J1939 DTCs.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='J1939 based data. Null if no data is available.';

--
-- Table structure for table `VehicleMaintenance_j1939_checkEngineLight` generated from model 'VehicleMaintenanceUnderscorej1939UnderscorecheckEngineLight'
-- J1939 check engine lights.
--

CREATE TABLE IF NOT EXISTS `VehicleMaintenance_j1939_checkEngineLight` (
  `protectIsOn` TINYINT(1) DEFAULT NULL,
  `stopIsOn` TINYINT(1) DEFAULT NULL,
  `warningIsOn` TINYINT(1) DEFAULT NULL,
  `emissionsIsOn` TINYINT(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='J1939 check engine lights.';

--
-- Table structure for table `VehicleMaintenance_j1939_diagnosticTroubleCodes` generated from model 'VehicleMaintenanceUnderscorej1939UnderscorediagnosticTroubleCodes'
--

CREATE TABLE IF NOT EXISTS `VehicleMaintenance_j1939_diagnosticTroubleCodes` (
  `spnDescription` TEXT DEFAULT NULL,
  `fmiText` TEXT DEFAULT NULL,
  `spnId` INT DEFAULT NULL,
  `occurrenceCount` INT DEFAULT NULL,
  `txId` INT DEFAULT NULL,
  `fmiId` INT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `VehicleMaintenance_passenger` generated from model 'VehicleMaintenanceUnderscorepassenger'
-- Passenger vehicle data. Null if no data is available.
--

CREATE TABLE IF NOT EXISTS `VehicleMaintenance_passenger` (
  `checkEngineLight` TEXT DEFAULT NULL,
  `diagnosticTroubleCodes` JSON DEFAULT NULL COMMENT 'Passenger vehicle DTCs.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Passenger vehicle data. Null if no data is available.';

--
-- Table structure for table `VehicleMaintenance_passenger_checkEngineLight` generated from model 'VehicleMaintenanceUnderscorepassengerUnderscorecheckEngineLight'
-- Passenger vehicle check engine light.
--

CREATE TABLE IF NOT EXISTS `VehicleMaintenance_passenger_checkEngineLight` (
  `isOn` TINYINT(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Passenger vehicle check engine light.';

--
-- Table structure for table `VehicleMaintenance_passenger_diagnosticTroubleCodes` generated from model 'VehicleMaintenanceUnderscorepassengerUnderscorediagnosticTroubleCodes'
--

CREATE TABLE IF NOT EXISTS `VehicleMaintenance_passenger_diagnosticTroubleCodes` (
  `dtcShortCode` TEXT DEFAULT NULL,
  `dtcId` INT DEFAULT NULL,
  `dtcDescription` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `VehicleSafetyScoreResponse` generated from model 'VehicleSafetyScoreResponse'
-- Safety score details for a vehicle
--

CREATE TABLE IF NOT EXISTS `VehicleSafetyScoreResponse` (
  `crashCount` INT DEFAULT NULL COMMENT 'Crash event count',
  `harshAccelCount` INT DEFAULT NULL COMMENT 'Harsh acceleration event count',
  `harshBrakingCount` INT DEFAULT NULL COMMENT 'Harsh braking event count',
  `harshEvents` JSON DEFAULT NULL,
  `harshTurningCount` INT DEFAULT NULL COMMENT 'Harsh turning event count',
  `safetyScore` INT DEFAULT NULL COMMENT 'Safety Score',
  `safetyScoreRank` TEXT DEFAULT NULL COMMENT 'Safety Score Rank',
  `timeOverSpeedLimitMs` INT DEFAULT NULL COMMENT 'Amount of time driven over the speed limit in milliseconds',
  `totalDistanceDrivenMeters` INT DEFAULT NULL COMMENT 'Total distance driven in meters',
  `totalHarshEventCount` INT DEFAULT NULL COMMENT 'Total harsh event count',
  `totalTimeDrivenMs` INT DEFAULT NULL COMMENT 'Amount of time driven in milliseconds',
  `vehicleId` INT DEFAULT NULL COMMENT 'Vehicle ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Safety score details for a vehicle';

