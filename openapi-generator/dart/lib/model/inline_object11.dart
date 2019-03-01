part of openapi.api;

class InlineObject11 {
  /* Group ID to query. */
  int groupId = null;
  InlineObject11();

  @override
  String toString() {
    return 'InlineObject11[groupId=$groupId, ]';
  }

  InlineObject11.fromJson(Map<String, dynamic> json) {
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

  static List<InlineObject11> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject11>() : json.map((value) => new InlineObject11.fromJson(value)).toList();
  }

  static Map<String, InlineObject11> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject11>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject11.fromJson(value));
    }
    return map;
  }
}

