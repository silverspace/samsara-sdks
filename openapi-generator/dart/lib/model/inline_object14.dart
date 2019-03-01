part of openapi.api;

class InlineObject14 {
  /* Group ID to query. */
  int groupId = null;
  
  List<Vehicle> vehicles = [];
  InlineObject14();

  @override
  String toString() {
    return 'InlineObject14[groupId=$groupId, vehicles=$vehicles, ]';
  }

  InlineObject14.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['groupId'] == null) {
      groupId = null;
    } else {
          groupId = json['groupId'];
    }
    if (json['vehicles'] == null) {
      vehicles = null;
    } else {
      vehicles = Vehicle.listFromJson(json['vehicles']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'groupId': groupId,
      'vehicles': vehicles
    };
  }

  static List<InlineObject14> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject14>() : json.map((value) => new InlineObject14.fromJson(value)).toList();
  }

  static Map<String, InlineObject14> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject14>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject14.fromJson(value));
    }
    return map;
  }
}

