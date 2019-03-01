part of openapi.api;

class AddressGeofenceCircle {
  /* The latitude of the center of the circular geofence */
  double latitude = null;
  /* The radius of the circular geofence */
  int radiusMeters = null;
  /* The longitude of the center of the circular geofence */
  double longitude = null;
  AddressGeofenceCircle();

  @override
  String toString() {
    return 'AddressGeofenceCircle[latitude=$latitude, radiusMeters=$radiusMeters, longitude=$longitude, ]';
  }

  AddressGeofenceCircle.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['latitude'] == null) {
      latitude = null;
    } else {
          latitude = json['latitude'];
    }
    if (json['radiusMeters'] == null) {
      radiusMeters = null;
    } else {
          radiusMeters = json['radiusMeters'];
    }
    if (json['longitude'] == null) {
      longitude = null;
    } else {
          longitude = json['longitude'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'latitude': latitude,
      'radiusMeters': radiusMeters,
      'longitude': longitude
    };
  }

  static List<AddressGeofenceCircle> listFromJson(List<dynamic> json) {
    return json == null ? new List<AddressGeofenceCircle>() : json.map((value) => new AddressGeofenceCircle.fromJson(value)).toList();
  }

  static Map<String, AddressGeofenceCircle> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, AddressGeofenceCircle>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new AddressGeofenceCircle.fromJson(value));
    }
    return map;
  }
}

