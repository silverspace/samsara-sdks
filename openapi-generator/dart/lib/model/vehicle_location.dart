part of openapi.api;

class VehicleLocation {
  /* Heading in degrees. */
  double heading = null;
  /* ID of the vehicle. */
  int id = null;
  /* Latitude in decimal degrees. */
  double latitude = null;
  /* Text representation of nearest identifiable location to (latitude, longitude) coordinates. */
  String location = null;
  /* Longitude in decimal degrees. */
  double longitude = null;
  /* Name of the vehicle. */
  String name = null;
  /* The number of meters reported by the odometer. */
  int odometerMeters = null;
  /* Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint. */
  bool onTrip = null;
  /* Speed in miles per hour. */
  double speed = null;
  /* The time the reported location was logged, reported as a UNIX timestamp in milliseconds. */
  int time = null;
  /* Vehicle Identification Number (VIN) of the vehicle. */
  String vin = null;
  VehicleLocation();

  @override
  String toString() {
    return 'VehicleLocation[heading=$heading, id=$id, latitude=$latitude, location=$location, longitude=$longitude, name=$name, odometerMeters=$odometerMeters, onTrip=$onTrip, speed=$speed, time=$time, vin=$vin, ]';
  }

  VehicleLocation.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['heading'] == null) {
      heading = null;
    } else {
          heading = json['heading'];
    }
    if (json['id'] == null) {
      id = null;
    } else {
          id = json['id'];
    }
    if (json['latitude'] == null) {
      latitude = null;
    } else {
          latitude = json['latitude'];
    }
    if (json['location'] == null) {
      location = null;
    } else {
          location = json['location'];
    }
    if (json['longitude'] == null) {
      longitude = null;
    } else {
          longitude = json['longitude'];
    }
    if (json['name'] == null) {
      name = null;
    } else {
          name = json['name'];
    }
    if (json['odometerMeters'] == null) {
      odometerMeters = null;
    } else {
          odometerMeters = json['odometerMeters'];
    }
    if (json['onTrip'] == null) {
      onTrip = null;
    } else {
          onTrip = json['onTrip'];
    }
    if (json['speed'] == null) {
      speed = null;
    } else {
          speed = json['speed'];
    }
    if (json['time'] == null) {
      time = null;
    } else {
          time = json['time'];
    }
    if (json['vin'] == null) {
      vin = null;
    } else {
          vin = json['vin'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'heading': heading,
      'id': id,
      'latitude': latitude,
      'location': location,
      'longitude': longitude,
      'name': name,
      'odometerMeters': odometerMeters,
      'onTrip': onTrip,
      'speed': speed,
      'time': time,
      'vin': vin
    };
  }

  static List<VehicleLocation> listFromJson(List<dynamic> json) {
    return json == null ? new List<VehicleLocation>() : json.map((value) => new VehicleLocation.fromJson(value)).toList();
  }

  static Map<String, VehicleLocation> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, VehicleLocation>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new VehicleLocation.fromJson(value));
    }
    return map;
  }
}

