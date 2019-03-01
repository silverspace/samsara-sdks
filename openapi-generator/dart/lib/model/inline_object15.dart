part of openapi.api;

class InlineObject15 {
  /* End of the time range, specified in milliseconds UNIX time. */
  int endMs = null;
  /* Group ID to query. */
  int groupId = null;
  /* Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs */
  int startMs = null;
  /* Vehicle ID to query. */
  int vehicleId = null;
  InlineObject15();

  @override
  String toString() {
    return 'InlineObject15[endMs=$endMs, groupId=$groupId, startMs=$startMs, vehicleId=$vehicleId, ]';
  }

  InlineObject15.fromJson(Map<String, dynamic> json) {
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
    if (json['vehicleId'] == null) {
      vehicleId = null;
    } else {
          vehicleId = json['vehicleId'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'endMs': endMs,
      'groupId': groupId,
      'startMs': startMs,
      'vehicleId': vehicleId
    };
  }

  static List<InlineObject15> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject15>() : json.map((value) => new InlineObject15.fromJson(value)).toList();
  }

  static Map<String, InlineObject15> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject15>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject15.fromJson(value));
    }
    return map;
  }
}

