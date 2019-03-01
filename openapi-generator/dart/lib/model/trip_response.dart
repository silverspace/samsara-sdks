part of openapi.api;

class TripResponse {
  
  List<TripResponseTrips> trips = [];
  TripResponse();

  @override
  String toString() {
    return 'TripResponse[trips=$trips, ]';
  }

  TripResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['trips'] == null) {
      trips = null;
    } else {
      trips = TripResponseTrips.listFromJson(json['trips']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'trips': trips
    };
  }

  static List<TripResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<TripResponse>() : json.map((value) => new TripResponse.fromJson(value)).toList();
  }

  static Map<String, TripResponse> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, TripResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new TripResponse.fromJson(value));
    }
    return map;
  }
}

