part of openapi.api;

class InlineResponse2003 {
  /* Group ID to query. */
  int groupId = null;
  
  List<VehicleLocation> vehicles = [];
  InlineResponse2003();

  @override
  String toString() {
    return 'InlineResponse2003[groupId=$groupId, vehicles=$vehicles, ]';
  }

  InlineResponse2003.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['groupId'] == null) {
      groupId = null;
    } else {
          groupId = json['groupId'];
    }
    if (json['vehicles'] == null) {
      vehicles = null;
    } else {
      vehicles = VehicleLocation.listFromJson(json['vehicles']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'groupId': groupId,
      'vehicles': vehicles
    };
  }

  static List<InlineResponse2003> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineResponse2003>() : json.map((value) => new InlineResponse2003.fromJson(value)).toList();
  }

  static Map<String, InlineResponse2003> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineResponse2003>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineResponse2003.fromJson(value));
    }
    return map;
  }
}

