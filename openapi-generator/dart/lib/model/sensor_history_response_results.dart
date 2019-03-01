part of openapi.api;

class SensorHistoryResponseResults {
  /* List of datapoints, one for each requested (sensor, field) pair. */
  List<int> series = [];
  /* Timestamp in UNIX milliseconds. */
  int timeMs = null;
  SensorHistoryResponseResults();

  @override
  String toString() {
    return 'SensorHistoryResponseResults[series=$series, timeMs=$timeMs, ]';
  }

  SensorHistoryResponseResults.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['series'] == null) {
      series = null;
    } else {
      series = (json['series'] as List).cast<int>();
    }
    if (json['timeMs'] == null) {
      timeMs = null;
    } else {
          timeMs = json['timeMs'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'series': series,
      'timeMs': timeMs
    };
  }

  static List<SensorHistoryResponseResults> listFromJson(List<dynamic> json) {
    return json == null ? new List<SensorHistoryResponseResults>() : json.map((value) => new SensorHistoryResponseResults.fromJson(value)).toList();
  }

  static Map<String, SensorHistoryResponseResults> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, SensorHistoryResponseResults>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new SensorHistoryResponseResults.fromJson(value));
    }
    return map;
  }
}

