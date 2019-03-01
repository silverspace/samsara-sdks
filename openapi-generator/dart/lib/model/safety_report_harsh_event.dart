part of openapi.api;

class SafetyReportHarshEvent {
  /* Type of the harsh event */
  String harshEventType = null;
  /* Timestamp that the harsh event occurred in Unix milliseconds since epoch */
  int timestampMs = null;
  /* Vehicle associated with the harsh event */
  int vehicleId = null;
  SafetyReportHarshEvent();

  @override
  String toString() {
    return 'SafetyReportHarshEvent[harshEventType=$harshEventType, timestampMs=$timestampMs, vehicleId=$vehicleId, ]';
  }

  SafetyReportHarshEvent.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['harshEventType'] == null) {
      harshEventType = null;
    } else {
          harshEventType = json['harshEventType'];
    }
    if (json['timestampMs'] == null) {
      timestampMs = null;
    } else {
          timestampMs = json['timestampMs'];
    }
    if (json['vehicleId'] == null) {
      vehicleId = null;
    } else {
          vehicleId = json['vehicleId'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'harshEventType': harshEventType,
      'timestampMs': timestampMs,
      'vehicleId': vehicleId
    };
  }

  static List<SafetyReportHarshEvent> listFromJson(List<dynamic> json) {
    return json == null ? new List<SafetyReportHarshEvent>() : json.map((value) => new SafetyReportHarshEvent.fromJson(value)).toList();
  }

  static Map<String, SafetyReportHarshEvent> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, SafetyReportHarshEvent>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new SafetyReportHarshEvent.fromJson(value));
    }
    return map;
  }
}

