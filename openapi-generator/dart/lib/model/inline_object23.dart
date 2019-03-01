part of openapi.api;

class InlineObject23 {
  /* Group ID to query. */
  int groupId = null;
  InlineObject23();

  @override
  String toString() {
    return 'InlineObject23[groupId=$groupId, ]';
  }

  InlineObject23.fromJson(Map<String, dynamic> json) {
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

  static List<InlineObject23> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject23>() : json.map((value) => new InlineObject23.fromJson(value)).toList();
  }

  static Map<String, InlineObject23> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject23>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject23.fromJson(value));
    }
    return map;
  }
}

