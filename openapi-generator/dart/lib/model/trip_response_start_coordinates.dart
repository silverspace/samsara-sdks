part of openapi.api;

class TripResponseStartCoordinates {
  
  double latitude = null;
  
  double longitude = null;
  TripResponseStartCoordinates();

  @override
  String toString() {
    return 'TripResponseStartCoordinates[latitude=$latitude, longitude=$longitude, ]';
  }

  TripResponseStartCoordinates.fromJson(Map<String, dynamic> json) {
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

  static List<TripResponseStartCoordinates> listFromJson(List<dynamic> json) {
    return json == null ? new List<TripResponseStartCoordinates>() : json.map((value) => new TripResponseStartCoordinates.fromJson(value)).toList();
  }

  static Map<String, TripResponseStartCoordinates> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, TripResponseStartCoordinates>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new TripResponseStartCoordinates.fromJson(value));
    }
    return map;
  }
}

