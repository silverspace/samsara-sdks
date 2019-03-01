part of openapi.api;

class InlineObject5 {
  /* End time (ms) of queried time period. */
  int endMs = null;
  /* Org ID to query. */
  int orgId = null;
  /* Start time (ms) of queried time period. */
  int startMs = null;
  InlineObject5();

  @override
  String toString() {
    return 'InlineObject5[endMs=$endMs, orgId=$orgId, startMs=$startMs, ]';
  }

  InlineObject5.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['endMs'] == null) {
      endMs = null;
    } else {
          endMs = json['endMs'];
    }
    if (json['orgId'] == null) {
      orgId = null;
    } else {
          orgId = json['orgId'];
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
      'orgId': orgId,
      'startMs': startMs
    };
  }

  static List<InlineObject5> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject5>() : json.map((value) => new InlineObject5.fromJson(value)).toList();
  }

  static Map<String, InlineObject5> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject5>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject5.fromJson(value));
    }
    return map;
  }
}

