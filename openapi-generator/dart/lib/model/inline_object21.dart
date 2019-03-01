part of openapi.api;

class InlineObject21 {
  /* End of the time range, specified in milliseconds UNIX time. */
  int endMs = null;
  
  String fillMissing = "withNull";
  //enum fillMissingEnum {  withNull,  withPrevious,  };{
  /* Group ID to query. */
  int groupId = null;
  
  List<SensorsHistorySeries> series = [];
  /* Beginning of the time range, specified in milliseconds UNIX time. */
  int startMs = null;
  /* Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals. */
  int stepMs = null;
  InlineObject21();

  @override
  String toString() {
    return 'InlineObject21[endMs=$endMs, fillMissing=$fillMissing, groupId=$groupId, series=$series, startMs=$startMs, stepMs=$stepMs, ]';
  }

  InlineObject21.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['endMs'] == null) {
      endMs = null;
    } else {
          endMs = json['endMs'];
    }
    if (json['fillMissing'] == null) {
      fillMissing = null;
    } else {
          fillMissing = json['fillMissing'];
    }
    if (json['groupId'] == null) {
      groupId = null;
    } else {
          groupId = json['groupId'];
    }
    if (json['series'] == null) {
      series = null;
    } else {
      series = SensorsHistorySeries.listFromJson(json['series']);
    }
    if (json['startMs'] == null) {
      startMs = null;
    } else {
          startMs = json['startMs'];
    }
    if (json['stepMs'] == null) {
      stepMs = null;
    } else {
          stepMs = json['stepMs'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'endMs': endMs,
      'fillMissing': fillMissing,
      'groupId': groupId,
      'series': series,
      'startMs': startMs,
      'stepMs': stepMs
    };
  }

  static List<InlineObject21> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject21>() : json.map((value) => new InlineObject21.fromJson(value)).toList();
  }

  static Map<String, InlineObject21> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject21>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject21.fromJson(value));
    }
    return map;
  }
}

