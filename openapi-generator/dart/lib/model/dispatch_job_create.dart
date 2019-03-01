part of openapi.api;

class DispatchJobCreate {
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
  DispatchJobCreate();

  @override
  String toString() {
    return 'DispatchJobCreate[destinationAddress=$destinationAddress, destinationAddressId=$destinationAddressId, destinationLat=$destinationLat, destinationLng=$destinationLng, destinationName=$destinationName, notes=$notes, scheduledArrivalTimeMs=$scheduledArrivalTimeMs, scheduledDepartureTimeMs=$scheduledDepartureTimeMs, ]';
  }

  DispatchJobCreate.fromJson(Map<String, dynamic> json) {
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
      'scheduled_departure_time_ms': scheduledDepartureTimeMs
    };
  }

  static List<DispatchJobCreate> listFromJson(List<dynamic> json) {
    return json == null ? new List<DispatchJobCreate>() : json.map((value) => new DispatchJobCreate.fromJson(value)).toList();
  }

  static Map<String, DispatchJobCreate> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DispatchJobCreate>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DispatchJobCreate.fromJson(value));
    }
    return map;
  }
}

