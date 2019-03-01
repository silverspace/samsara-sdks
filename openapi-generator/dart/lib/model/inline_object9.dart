part of openapi.api;

class InlineObject9 {
  /* Group ID to query. */
  int groupId = null;
  InlineObject9();

  @override
  String toString() {
    return 'InlineObject9[groupId=$groupId, ]';
  }

  InlineObject9.fromJson(Map<String, dynamic> json) {
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

  static List<InlineObject9> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject9>() : json.map((value) => new InlineObject9.fromJson(value)).toList();
  }

  static Map<String, InlineObject9> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject9>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject9.fromJson(value));
    }
    return map;
  }
}

