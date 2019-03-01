part of openapi.api;

class AddressGeofencePolygonVertices {
  /* The longitude of a geofence vertex */
  double latitude = null;
  /* The longitude of a geofence vertex */
  double longitude = null;
  AddressGeofencePolygonVertices();

  @override
  String toString() {
    return 'AddressGeofencePolygonVertices[latitude=$latitude, longitude=$longitude, ]';
  }

  AddressGeofencePolygonVertices.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['latitude'] == null) {
      latitude = null;
    } else {
          latitude = json['latitude'];
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
      'longitude': longitude
    };
  }

  static List<AddressGeofencePolygonVertices> listFromJson(List<dynamic> json) {
    return json == null ? new List<AddressGeofencePolygonVertices>() : json.map((value) => new AddressGeofencePolygonVertices.fromJson(value)).toList();
  }

  static Map<String, AddressGeofencePolygonVertices> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, AddressGeofencePolygonVertices>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new AddressGeofencePolygonVertices.fromJson(value));
    }
    return map;
  }
}

