part of openapi.api;

class InlineObject6 {
  /* Driver ID to query. */
  int driverId = null;
  /* End of the time range, specified in milliseconds UNIX time. */
  int endMs = null;
  /* Group ID to query. */
  int groupId = null;
  /* Beginning of the time range, specified in milliseconds UNIX time. */
  int startMs = null;
  InlineObject6();

  @override
  String toString() {
    return 'InlineObject6[driverId=$driverId, endMs=$endMs, groupId=$groupId, startMs=$startMs, ]';
  }

  InlineObject6.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['driverId'] == null) {
      driverId = null;
    } else {
          driverId = json['driverId'];
    }
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
      'driverId': driverId,
      'endMs': endMs,
      'groupId': groupId,
      'startMs': startMs
    };
  }

  static List<InlineObject6> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject6>() : json.map((value) => new InlineObject6.fromJson(value)).toList();
  }

  static Map<String, InlineObject6> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject6>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject6.fromJson(value));
    }
    return map;
  }
}

