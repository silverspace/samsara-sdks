part of openapi.api;

class DriversResponse {
  
  List<Driver> drivers = [];
  DriversResponse();

  @override
  String toString() {
    return 'DriversResponse[drivers=$drivers, ]';
  }

  DriversResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['drivers'] == null) {
      drivers = null;
    } else {
      drivers = Driver.listFromJson(json['drivers']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'drivers': drivers
    };
  }

  static List<DriversResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<DriversResponse>() : json.map((value) => new DriversResponse.fromJson(value)).toList();
  }

  static Map<String, DriversResponse> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DriversResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DriversResponse.fromJson(value));
    }
    return map;
  }
}

