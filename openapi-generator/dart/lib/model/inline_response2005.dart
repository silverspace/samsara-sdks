part of openapi.api;

class InlineResponse2005 {
  
  Pagination pagination = null;
  
  List<InlineResponse2005VehicleStats> vehicleStats = [];
  InlineResponse2005();

  @override
  String toString() {
    return 'InlineResponse2005[pagination=$pagination, vehicleStats=$vehicleStats, ]';
  }

  InlineResponse2005.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['pagination'] == null) {
      pagination = null;
    } else {
      pagination = new Pagination.fromJson(json['pagination']);
    }
    if (json['vehicleStats'] == null) {
      vehicleStats = null;
    } else {
      vehicleStats = InlineResponse2005VehicleStats.listFromJson(json['vehicleStats']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'pagination': pagination,
      'vehicleStats': vehicleStats
    };
  }

  static List<InlineResponse2005> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineResponse2005>() : json.map((value) => new InlineResponse2005.fromJson(value)).toList();
  }

  static Map<String, InlineResponse2005> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineResponse2005>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineResponse2005.fromJson(value));
    }
    return map;
  }
}

