part of openapi.api;

class InlineObject3 {
  /* Group ID to query. */
  int groupId = null;
  InlineObject3();

  @override
  String toString() {
    return 'InlineObject3[groupId=$groupId, ]';
  }

  InlineObject3.fromJson(Map<String, dynamic> json) {
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

  static List<InlineObject3> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject3>() : json.map((value) => new InlineObject3.fromJson(value)).toList();
  }

  static Map<String, InlineObject3> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject3>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject3.fromJson(value));
    }
    return map;
  }
}

