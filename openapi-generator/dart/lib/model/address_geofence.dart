part of openapi.api;

class AddressGeofence {
  
  AddressGeofenceCircle circle = null;
  
  AddressGeofencePolygon polygon = null;
  AddressGeofence();

  @override
  String toString() {
    return 'AddressGeofence[circle=$circle, polygon=$polygon, ]';
  }

  AddressGeofence.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['circle'] == null) {
      circle = null;
    } else {
      circle = new AddressGeofenceCircle.fromJson(json['circle']);
    }
    if (json['polygon'] == null) {
      polygon = null;
    } else {
      polygon = new AddressGeofencePolygon.fromJson(json['polygon']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'circle': circle,
      'polygon': polygon
    };
  }

  static List<AddressGeofence> listFromJson(List<dynamic> json) {
    return json == null ? new List<AddressGeofence>() : json.map((value) => new AddressGeofence.fromJson(value)).toList();
  }

  static Map<String, AddressGeofence> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, AddressGeofence>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new AddressGeofence.fromJson(value));
    }
    return map;
  }
}

