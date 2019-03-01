part of openapi.api;

class InlineObject18 {
  /* Group ID to query. */
  int groupId = null;
  InlineObject18();

  @override
  String toString() {
    return 'InlineObject18[groupId=$groupId, ]';
  }

  InlineObject18.fromJson(Map<String, dynamic> json) {
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

  static List<InlineObject18> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject18>() : json.map((value) => new InlineObject18.fromJson(value)).toList();
  }

  static Map<String, InlineObject18> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject18>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject18.fromJson(value));
    }
    return map;
  }
}

