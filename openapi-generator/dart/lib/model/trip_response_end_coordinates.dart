part of openapi.api;

class TripResponseEndCoordinates {
  
  double latitude = null;
  
  double longitude = null;
  TripResponseEndCoordinates();

  @override
  String toString() {
    return 'TripResponseEndCoordinates[latitude=$latitude, longitude=$longitude, ]';
  }

  TripResponseEndCoordinates.fromJson(Map<String, dynamic> json) {
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

  static List<TripResponseEndCoordinates> listFromJson(List<dynamic> json) {
    return json == null ? new List<TripResponseEndCoordinates>() : json.map((value) => new TripResponseEndCoordinates.fromJson(value)).toList();
  }

  static Map<String, TripResponseEndCoordinates> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, TripResponseEndCoordinates>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new TripResponseEndCoordinates.fromJson(value));
    }
    return map;
  }
}

