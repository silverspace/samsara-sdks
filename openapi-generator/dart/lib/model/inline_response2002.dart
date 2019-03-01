part of openapi.api;

class InlineResponse2002 {
  
  Pagination pagination = null;
  /* Group ID to query. */
  int groupId = null;
  
  List<Vehicle> vehicles = [];
  InlineResponse2002();

  @override
  String toString() {
    return 'InlineResponse2002[pagination=$pagination, groupId=$groupId, vehicles=$vehicles, ]';
  }

  InlineResponse2002.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['pagination'] == null) {
      pagination = null;
    } else {
      pagination = new Pagination.fromJson(json['pagination']);
    }
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
      'pagination': pagination,
      'groupId': groupId,
      'vehicles': vehicles
    };
  }

  static List<InlineResponse2002> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineResponse2002>() : json.map((value) => new InlineResponse2002.fromJson(value)).toList();
  }

  static Map<String, InlineResponse2002> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineResponse2002>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineResponse2002.fromJson(value));
    }
    return map;
  }
}

