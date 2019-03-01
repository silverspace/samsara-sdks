part of openapi.api;

class AssetCurrentLocation {
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
  AssetCurrentLocation();

  @override
  String toString() {
    return 'AssetCurrentLocation[latitude=$latitude, location=$location, longitude=$longitude, speedMilesPerHour=$speedMilesPerHour, timeMs=$timeMs, ]';
  }

  AssetCurrentLocation.fromJson(Map<String, dynamic> json) {
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

  static List<AssetCurrentLocation> listFromJson(List<dynamic> json) {
    return json == null ? new List<AssetCurrentLocation>() : json.map((value) => new AssetCurrentLocation.fromJson(value)).toList();
  }

  static Map<String, AssetCurrentLocation> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, AssetCurrentLocation>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new AssetCurrentLocation.fromJson(value));
    }
    return map;
  }
}

