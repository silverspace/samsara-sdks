part of openapi.api;

class InlineObject13 {
  /* Group ID to query. */
  int groupId = null;
  InlineObject13();

  @override
  String toString() {
    return 'InlineObject13[groupId=$groupId, ]';
  }

  InlineObject13.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['groupId'] == null) {
      groupId = null;
    } else {
          groupId = json['groupId'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'groupId': groupId
    };
  }

  static List<InlineObject13> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject13>() : json.map((value) => new InlineObject13.fromJson(value)).toList();
  }

  static Map<String, InlineObject13> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject13>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject13.fromJson(value));
    }
    return map;
  }
}

