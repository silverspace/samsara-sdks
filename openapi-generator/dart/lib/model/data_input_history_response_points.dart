part of openapi.api;

class DataInputHistoryResponsePoints {
  
  double value = null;
  
  int timeMs = null;
  DataInputHistoryResponsePoints();

  @override
  String toString() {
    return 'DataInputHistoryResponsePoints[value=$value, timeMs=$timeMs, ]';
  }

  DataInputHistoryResponsePoints.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['value'] == null) {
      value = null;
    } else {
          value = json['value'];
    }
    if (json['timeMs'] == null) {
      timeMs = null;
    } else {
          timeMs = json['timeMs'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'value': value,
      'timeMs': timeMs
    };
  }

  static List<DataInputHistoryResponsePoints> listFromJson(List<dynamic> json) {
    return json == null ? new List<DataInputHistoryResponsePoints>() : json.map((value) => new DataInputHistoryResponsePoints.fromJson(value)).toList();
  }

  static Map<String, DataInputHistoryResponsePoints> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DataInputHistoryResponsePoints>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DataInputHistoryResponsePoints.fromJson(value));
    }
    return map;
  }
}

