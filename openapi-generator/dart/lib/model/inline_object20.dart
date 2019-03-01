part of openapi.api;

class InlineObject20 {
  /* Group ID to query. */
  int groupId = null;
  /* List of sensor IDs to query. */
  List<int> sensors = [];
  InlineObject20();

  @override
  String toString() {
    return 'InlineObject20[groupId=$groupId, sensors=$sensors, ]';
  }

  InlineObject20.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['groupId'] == null) {
      groupId = null;
    } else {
          groupId = json['groupId'];
    }
    if (json['sensors'] == null) {
      sensors = null;
    } else {
      sensors = (json['sensors'] as List).cast<int>();
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'groupId': groupId,
      'sensors': sensors
    };
  }

  static List<InlineObject20> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject20>() : json.map((value) => new InlineObject20.fromJson(value)).toList();
  }

  static Map<String, InlineObject20> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject20>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject20.fromJson(value));
    }
    return map;
  }
}

