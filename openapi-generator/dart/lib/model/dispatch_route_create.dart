part of openapi.api;

class DispatchRouteCreate {
  /* The time in Unix epoch milliseconds that the route actually ended. */
  int actualEndMs = null;
  /* The time in Unix epoch milliseconds that the route actually started. */
  int actualStartMs = null;
  /* ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned. */
  int driverId = null;
  /* ID of the group if the organization has multiple groups (optional). */
  int groupId = null;
  /* Descriptive name of this route. */
  String name = null;
  /* The time in Unix epoch milliseconds that the last job in the route is scheduled to end. */
  int scheduledEndMs = null;
  /* The distance expected to be traveled for this route in meters. */
  int scheduledMeters = null;
  /* The time in Unix epoch milliseconds that the route is scheduled to start. */
  int scheduledStartMs = null;
  /* The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided. */
  String startLocationAddress = null;
  /* ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided. */
  int startLocationAddressId = null;
  /* Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. */
  double startLocationLat = null;
  /* Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. */
  double startLocationLng = null;
  /* The name of the route's starting location. If provided, it will take precedence over the name of the address book entry. */
  String startLocationName = null;
  /* ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them. */
  int trailerId = null;
  /* ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned. */
  int vehicleId = null;
  /* The dispatch jobs to create for this route. */
  List<DispatchJobCreate> dispatchJobs = [];
  DispatchRouteCreate();

  @override
  String toString() {
    return 'DispatchRouteCreate[actualEndMs=$actualEndMs, actualStartMs=$actualStartMs, driverId=$driverId, groupId=$groupId, name=$name, scheduledEndMs=$scheduledEndMs, scheduledMeters=$scheduledMeters, scheduledStartMs=$scheduledStartMs, startLocationAddress=$startLocationAddress, startLocationAddressId=$startLocationAddressId, startLocationLat=$startLocationLat, startLocationLng=$startLocationLng, startLocationName=$startLocationName, trailerId=$trailerId, vehicleId=$vehicleId, dispatchJobs=$dispatchJobs, ]';
  }

  DispatchRouteCreate.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['actual_end_ms'] == null) {
      actualEndMs = null;
    } else {
          actualEndMs = json['actual_end_ms'];
    }
    if (json['actual_start_ms'] == null) {
      actualStartMs = null;
    } else {
          actualStartMs = json['actual_start_ms'];
    }
    if (json['driver_id'] == null) {
      driverId = null;
    } else {
          driverId = json['driver_id'];
    }
    if (json['group_id'] == null) {
      groupId = null;
    } else {
          groupId = json['group_id'];
    }
    if (json['name'] == null) {
      name = null;
    } else {
          name = json['name'];
    }
    if (json['scheduled_end_ms'] == null) {
      scheduledEndMs = null;
    } else {
          scheduledEndMs = json['scheduled_end_ms'];
    }
    if (json['scheduled_meters'] == null) {
      scheduledMeters = null;
    } else {
          scheduledMeters = json['scheduled_meters'];
    }
    if (json['scheduled_start_ms'] == null) {
      scheduledStartMs = null;
    } else {
          scheduledStartMs = json['scheduled_start_ms'];
    }
    if (json['start_location_address'] == null) {
      startLocationAddress = null;
    } else {
          startLocationAddress = json['start_location_address'];
    }
    if (json['start_location_address_id'] == null) {
      startLocationAddressId = null;
    } else {
          startLocationAddressId = json['start_location_address_id'];
    }
    if (json['start_location_lat'] == null) {
      startLocationLat = null;
    } else {
          startLocationLat = json['start_location_lat'];
    }
    if (json['start_location_lng'] == null) {
      startLocationLng = null;
    } else {
          startLocationLng = json['start_location_lng'];
    }
    if (json['start_location_name'] == null) {
      startLocationName = null;
    } else {
          startLocationName = json['start_location_name'];
    }
    if (json['trailer_id'] == null) {
      trailerId = null;
    } else {
          trailerId = json['trailer_id'];
    }
    if (json['vehicle_id'] == null) {
      vehicleId = null;
    } else {
          vehicleId = json['vehicle_id'];
    }
    if (json['dispatch_jobs'] == null) {
      dispatchJobs = null;
    } else {
      dispatchJobs = DispatchJobCreate.listFromJson(json['dispatch_jobs']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'actual_end_ms': actualEndMs,
      'actual_start_ms': actualStartMs,
      'driver_id': driverId,
      'group_id': groupId,
      'name': name,
      'scheduled_end_ms': scheduledEndMs,
      'scheduled_meters': scheduledMeters,
      'scheduled_start_ms': scheduledStartMs,
      'start_location_address': startLocationAddress,
      'start_location_address_id': startLocationAddressId,
      'start_location_lat': startLocationLat,
      'start_location_lng': startLocationLng,
      'start_location_name': startLocationName,
      'trailer_id': trailerId,
      'vehicle_id': vehicleId,
      'dispatch_jobs': dispatchJobs
    };
  }

  static List<DispatchRouteCreate> listFromJson(List<dynamic> json) {
    return json == null ? new List<DispatchRouteCreate>() : json.map((value) => new DispatchRouteCreate.fromJson(value)).toList();
  }

  static Map<String, DispatchRouteCreate> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DispatchRouteCreate>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DispatchRouteCreate.fromJson(value));
    }
    return map;
  }
}

