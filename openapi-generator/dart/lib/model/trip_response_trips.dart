part of openapi.api;

class TripResponseTrips {
  /* Odometer reading at the end of the trip. */
  int endOdometer = null;
  /* Length of the trip in meters. */
  int distanceMeters = null;
  /* End of the trip in UNIX milliseconds. */
  int endMs = null;
  /* Beginning of the trip in UNIX milliseconds. */
  int startMs = null;
  /* Amount in milliliters of fuel consumed on this trip. */
  int fuelConsumedMl = null;
  /* Text representation of nearest identifiable location to the start (latitude, longitude) coordinates. */
  String startAddress = null;
  
  TripResponseStartCoordinates startCoordinates = null;
  
  TripResponseEndCoordinates endCoordinates = null;
  /* Odometer reading at the beginning of the trip. */
  int startOdometer = null;
  /* ID of the driver. */
  int driverId = null;
  /* Geocoded street address of start (latitude, longitude) coordinates. */
  String startLocation = null;
  /* Length in meters trip spent on toll roads. */
  int tollMeters = null;
  /* Text representation of nearest identifiable location to the end (latitude, longitude) coordinates. */
  String endAddress = null;
  /* Geocoded street address of start (latitude, longitude) coordinates. */
  String endLocation = null;
  TripResponseTrips();

  @override
  String toString() {
    return 'TripResponseTrips[endOdometer=$endOdometer, distanceMeters=$distanceMeters, endMs=$endMs, startMs=$startMs, fuelConsumedMl=$fuelConsumedMl, startAddress=$startAddress, startCoordinates=$startCoordinates, endCoordinates=$endCoordinates, startOdometer=$startOdometer, driverId=$driverId, startLocation=$startLocation, tollMeters=$tollMeters, endAddress=$endAddress, endLocation=$endLocation, ]';
  }

  TripResponseTrips.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['endOdometer'] == null) {
      endOdometer = null;
    } else {
          endOdometer = json['endOdometer'];
    }
    if (json['distanceMeters'] == null) {
      distanceMeters = null;
    } else {
          distanceMeters = json['distanceMeters'];
    }
    if (json['endMs'] == null) {
      endMs = null;
    } else {
          endMs = json['endMs'];
    }
    if (json['startMs'] == null) {
      startMs = null;
    } else {
          startMs = json['startMs'];
    }
    if (json['fuelConsumedMl'] == null) {
      fuelConsumedMl = null;
    } else {
          fuelConsumedMl = json['fuelConsumedMl'];
    }
    if (json['startAddress'] == null) {
      startAddress = null;
    } else {
          startAddress = json['startAddress'];
    }
    if (json['startCoordinates'] == null) {
      startCoordinates = null;
    } else {
      startCoordinates = new TripResponseStartCoordinates.fromJson(json['startCoordinates']);
    }
    if (json['endCoordinates'] == null) {
      endCoordinates = null;
    } else {
      endCoordinates = new TripResponseEndCoordinates.fromJson(json['endCoordinates']);
    }
    if (json['startOdometer'] == null) {
      startOdometer = null;
    } else {
          startOdometer = json['startOdometer'];
    }
    if (json['driverId'] == null) {
      driverId = null;
    } else {
          driverId = json['driverId'];
    }
    if (json['startLocation'] == null) {
      startLocation = null;
    } else {
          startLocation = json['startLocation'];
    }
    if (json['tollMeters'] == null) {
      tollMeters = null;
    } else {
          tollMeters = json['tollMeters'];
    }
    if (json['endAddress'] == null) {
      endAddress = null;
    } else {
          endAddress = json['endAddress'];
    }
    if (json['endLocation'] == null) {
      endLocation = null;
    } else {
          endLocation = json['endLocation'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'endOdometer': endOdometer,
      'distanceMeters': distanceMeters,
      'endMs': endMs,
      'startMs': startMs,
      'fuelConsumedMl': fuelConsumedMl,
      'startAddress': startAddress,
      'startCoordinates': startCoordinates,
      'endCoordinates': endCoordinates,
      'startOdometer': startOdometer,
      'driverId': driverId,
      'startLocation': startLocation,
      'tollMeters': tollMeters,
      'endAddress': endAddress,
      'endLocation': endLocation
    };
  }

  static List<TripResponseTrips> listFromJson(List<dynamic> json) {
    return json == null ? new List<TripResponseTrips>() : json.map((value) => new TripResponseTrips.fromJson(value)).toList();
  }

  static Map<String, TripResponseTrips> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, TripResponseTrips>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new TripResponseTrips.fromJson(value));
    }
    return map;
  }
}

