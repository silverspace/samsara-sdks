part of openapi.api;

class FleetVehicleLocation {
  /* The latitude of the location in degrees. */
  double latitude = null;
  /* The best effort (street,city,state) for the latitude and longitude. */
  String location = null;
  /* The longitude of the location in degrees. */
  double longitude = null;
  /* The speed calculated from GPS that the asset was traveling at in miles per hour. */
  double speedMilesPerHour = null;
  /* Time in Unix milliseconds since epoch when the asset was at the location. */
  int timeMs = null;
  FleetVehicleLocation();

  @override
  String toString() {
    return 'FleetVehicleLocation[latitude=$latitude, location=$location, longitude=$longitude, speedMilesPerHour=$speedMilesPerHour, timeMs=$timeMs, ]';
  }

  FleetVehicleLocation.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
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
    if (json['speedMilesPerHour'] == null) {
      speedMilesPerHour = null;
    } else {
          speedMilesPerHour = json['speedMilesPerHour'];
    }
    if (json['timeMs'] == null) {
      timeMs = null;
    } else {
          timeMs = json['timeMs'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'latitude': latitude,
      'location': location,
      'longitude': longitude,
      'speedMilesPerHour': speedMilesPerHour,
      'timeMs': timeMs
    };
  }

  static List<FleetVehicleLocation> listFromJson(List<dynamic> json) {
    return json == null ? new List<FleetVehicleLocation>() : json.map((value) => new FleetVehicleLocation.fromJson(value)).toList();
  }

  static Map<String, FleetVehicleLocation> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, FleetVehicleLocation>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new FleetVehicleLocation.fromJson(value));
    }
    return map;
  }
}

