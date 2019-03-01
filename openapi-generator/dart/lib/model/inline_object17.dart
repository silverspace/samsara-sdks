part of openapi.api;

class InlineObject17 {
  /* End of the time range, specified in milliseconds UNIX time. */
  int endMs = null;
  /* Group ID to query. */
  int groupId = null;
  /* Beginning of the time range, specified in milliseconds UNIX time. */
  int startMs = null;
  InlineObject17();

  @override
  String toString() {
    return 'InlineObject17[endMs=$endMs, groupId=$groupId, startMs=$startMs, ]';
  }

  InlineObject17.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['endMs'] == null) {
      endMs = null;
    } else {
          endMs = json['endMs'];
    }
    if (json['groupId'] == null) {
      groupId = null;
    } else {
          groupId = json['groupId'];
    }
    if (json['startMs'] == null) {
      startMs = null;
    } else {
          startMs = json['startMs'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'endMs': endMs,
      'groupId': groupId,
      'startMs': startMs
    };
  }

  static List<InlineObject17> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject17>() : json.map((value) => new InlineObject17.fromJson(value)).toList();
  }

  static Map<String, InlineObject17> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject17>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject17.fromJson(value));
    }
    return map;
  }
}

