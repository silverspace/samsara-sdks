part of openapi.api;

class InlineObject24 {
  /* Group ID to query. */
  int groupId = null;
  /* List of sensor IDs to query. */
  List<int> sensors = [];
  InlineObject24();

  @override
  String toString() {
    return 'InlineObject24[groupId=$groupId, sensors=$sensors, ]';
  }

  InlineObject24.fromJson(Map<String, dynamic> json) {
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

  static List<InlineObject24> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject24>() : json.map((value) => new InlineObject24.fromJson(value)).toList();
  }

  static Map<String, InlineObject24> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject24>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject24.fromJson(value));
    }
    return map;
  }
}

