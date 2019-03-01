part of openapi.api;

class InlineObject10 {
  /* Group ID to query. */
  int groupId = null;
  InlineObject10();

  @override
  String toString() {
    return 'InlineObject10[groupId=$groupId, ]';
  }

  InlineObject10.fromJson(Map<String, dynamic> json) {
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

  static List<InlineObject10> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject10>() : json.map((value) => new InlineObject10.fromJson(value)).toList();
  }

  static Map<String, InlineObject10> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject10>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject10.fromJson(value));
    }
    return map;
  }
}

