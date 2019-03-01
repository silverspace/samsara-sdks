part of openapi.api;

class InlineObject22 {
  /* Group ID to query. */
  int groupId = null;
  /* List of sensor IDs to query. */
  List<int> sensors = [];
  InlineObject22();

  @override
  String toString() {
    return 'InlineObject22[groupId=$groupId, sensors=$sensors, ]';
  }

  InlineObject22.fromJson(Map<String, dynamic> json) {
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

  static List<InlineObject22> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject22>() : json.map((value) => new InlineObject22.fromJson(value)).toList();
  }

  static Map<String, InlineObject22> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject22>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject22.fromJson(value));
    }
    return map;
  }
}

