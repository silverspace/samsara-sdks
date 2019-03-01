part of openapi.api;

class InlineObject19 {
  /* Group ID to query. */
  int groupId = null;
  /* List of sensor IDs to query. */
  List<int> sensors = [];
  InlineObject19();

  @override
  String toString() {
    return 'InlineObject19[groupId=$groupId, sensors=$sensors, ]';
  }

  InlineObject19.fromJson(Map<String, dynamic> json) {
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

  static List<InlineObject19> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject19>() : json.map((value) => new InlineObject19.fromJson(value)).toList();
  }

  static Map<String, InlineObject19> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject19>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject19.fromJson(value));
    }
    return map;
  }
}

