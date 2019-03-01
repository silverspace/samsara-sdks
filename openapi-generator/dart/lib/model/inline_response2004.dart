part of openapi.api;

class InlineResponse2004 {
  
  List<VehicleMaintenance> vehicles = [];
  InlineResponse2004();

  @override
  String toString() {
    return 'InlineResponse2004[vehicles=$vehicles, ]';
  }

  InlineResponse2004.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['vehicles'] == null) {
      vehicles = null;
    } else {
      vehicles = VehicleMaintenance.listFromJson(json['vehicles']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'vehicles': vehicles
    };
  }

  static List<InlineResponse2004> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineResponse2004>() : json.map((value) => new InlineResponse2004.fromJson(value)).toList();
  }

  static Map<String, InlineResponse2004> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineResponse2004>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineResponse2004.fromJson(value));
    }
    return map;
  }
}

