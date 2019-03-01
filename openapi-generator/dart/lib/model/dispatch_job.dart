part of openapi.api;

class DispatchJob {
  /* The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided. */
  String destinationAddress = null;
  /* ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided. */
  int destinationAddressId = null;
  /* Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. */
  double destinationLat = null;
  /* Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. */
  double destinationLng = null;
  /* The name of the job destination. If provided, it will take precedence over the name of the address book entry. */
  String destinationName = null;
  /* Notes regarding the details of this job. */
  String notes = null;
  /* The time at which the assigned driver is scheduled to arrive at the job destination. */
  int scheduledArrivalTimeMs = null;
  /* The time at which the assigned driver is scheduled to depart from the job destination. */
  int scheduledDepartureTimeMs = null;
  /* The time at which the driver arrived at the job destination. */
  int arrivedAtMs = null;
  /* The time at which the job was marked complete (e.g. started driving to the next destination). */
  int completedAtMs = null;
  /* ID of the route that this job belongs to. */
  int dispatchRouteId = null;
  /* ID of the driver assigned to the dispatch job. */
  int driverId = null;
  /* The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination). */
  int enRouteAtMs = null;
  /* The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs. */
  int estimatedArrivalMs = null;
  /* Fleet viewer url of the dispatch job. */
  String fleetViewerUrl = null;
  
  int groupId = null;
  /* ID of the Samsara dispatch job. */
  int id = null;
  
  JobStatus jobState = null;
  //enum jobStateEnum {  JobState_Unassigned,  JobState_Scheduled,  JobState_EnRoute,  JobState_Arrived,  JobState_Completed,  JobState_Skipped,  };{
  /* The time at which the job was marked skipped. */
  int skippedAtMs = null;
  /* ID of the vehicle used for the dispatch job. */
  int vehicleId = null;
  DispatchJob();

  @override
  String toString() {
    return 'DispatchJob[destinationAddress=$destinationAddress, destinationAddressId=$destinationAddressId, destinationLat=$destinationLat, destinationLng=$destinationLng, destinationName=$destinationName, notes=$notes, scheduledArrivalTimeMs=$scheduledArrivalTimeMs, scheduledDepartureTimeMs=$scheduledDepartureTimeMs, arrivedAtMs=$arrivedAtMs, completedAtMs=$completedAtMs, dispatchRouteId=$dispatchRouteId, driverId=$driverId, enRouteAtMs=$enRouteAtMs, estimatedArrivalMs=$estimatedArrivalMs, fleetViewerUrl=$fleetViewerUrl, groupId=$groupId, id=$id, jobState=$jobState, skippedAtMs=$skippedAtMs, vehicleId=$vehicleId, ]';
  }

  DispatchJob.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['destination_address'] == null) {
      destinationAddress = null;
    } else {
          destinationAddress = json['destination_address'];
    }
    if (json['destination_address_id'] == null) {
      destinationAddressId = null;
    } else {
          destinationAddressId = json['destination_address_id'];
    }
    if (json['destination_lat'] == null) {
      destinationLat = null;
    } else {
          destinationLat = json['destination_lat'];
    }
    if (json['destination_lng'] == null) {
      destinationLng = null;
    } else {
          destinationLng = json['destination_lng'];
    }
    if (json['destination_name'] == null) {
      destinationName = null;
    } else {
          destinationName = json['destination_name'];
    }
    if (json['notes'] == null) {
      notes = null;
    } else {
          notes = json['notes'];
    }
    if (json['scheduled_arrival_time_ms'] == null) {
      scheduledArrivalTimeMs = null;
    } else {
          scheduledArrivalTimeMs = json['scheduled_arrival_time_ms'];
    }
    if (json['scheduled_departure_time_ms'] == null) {
      scheduledDepartureTimeMs = null;
    } else {
          scheduledDepartureTimeMs = json['scheduled_departure_time_ms'];
    }
    if (json['arrived_at_ms'] == null) {
      arrivedAtMs = null;
    } else {
          arrivedAtMs = json['arrived_at_ms'];
    }
    if (json['completed_at_ms'] == null) {
      completedAtMs = null;
    } else {
          completedAtMs = json['completed_at_ms'];
    }
    if (json['dispatch_route_id'] == null) {
      dispatchRouteId = null;
    } else {
          dispatchRouteId = json['dispatch_route_id'];
    }
    if (json['driver_id'] == null) {
      driverId = null;
    } else {
          driverId = json['driver_id'];
    }
    if (json['en_route_at_ms'] == null) {
      enRouteAtMs = null;
    } else {
          enRouteAtMs = json['en_route_at_ms'];
    }
    if (json['estimated_arrival_ms'] == null) {
      estimatedArrivalMs = null;
    } else {
          estimatedArrivalMs = json['estimated_arrival_ms'];
    }
    if (json['fleet_viewer_url'] == null) {
      fleetViewerUrl = null;
    } else {
          fleetViewerUrl = json['fleet_viewer_url'];
    }
    if (json['group_id'] == null) {
      groupId = null;
    } else {
          groupId = json['group_id'];
    }
    if (json['id'] == null) {
      id = null;
    } else {
          id = json['id'];
    }
    if (json['job_state'] == null) {
      jobState = null;
    } else {
      jobState = new JobStatus.fromJson(json['job_state']);
    }
    if (json['skipped_at_ms'] == null) {
      skippedAtMs = null;
    } else {
          skippedAtMs = json['skipped_at_ms'];
    }
    if (json['vehicle_id'] == null) {
      vehicleId = null;
    } else {
          vehicleId = json['vehicle_id'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'destination_address': destinationAddress,
      'destination_address_id': destinationAddressId,
      'destination_lat': destinationLat,
      'destination_lng': destinationLng,
      'destination_name': destinationName,
      'notes': notes,
      'scheduled_arrival_time_ms': scheduledArrivalTimeMs,
      'scheduled_departure_time_ms': scheduledDepartureTimeMs,
      'arrived_at_ms': arrivedAtMs,
      'completed_at_ms': completedAtMs,
      'dispatch_route_id': dispatchRouteId,
      'driver_id': driverId,
      'en_route_at_ms': enRouteAtMs,
      'estimated_arrival_ms': estimatedArrivalMs,
      'fleet_viewer_url': fleetViewerUrl,
      'group_id': groupId,
      'id': id,
      'job_state': jobState,
      'skipped_at_ms': skippedAtMs,
      'vehicle_id': vehicleId
    };
  }

  static List<DispatchJob> listFromJson(List<dynamic> json) {
    return json == null ? new List<DispatchJob>() : json.map((value) => new DispatchJob.fromJson(value)).toList();
  }

  static Map<String, DispatchJob> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DispatchJob>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DispatchJob.fromJson(value));
    }
    return map;
  }
}

