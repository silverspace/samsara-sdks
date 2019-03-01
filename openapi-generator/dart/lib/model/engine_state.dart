part of openapi.api;

class EngineState {
  /* Timestamp in Unix epoch milliseconds. */
  Object timeMs = null;
  
  String value = null;
  //enum valueEnum {  Running,  Off,  Idle,  };{
  EngineState();

  @override
  String toString() {
    return 'EngineState[timeMs=$timeMs, value=$value, ]';
  }

  EngineState.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['timeMs'] == null) {
      timeMs = null;
    } else {
      timeMs = new Object.fromJson(json['timeMs']);
    }
    if (json['value'] == null) {
      value = null;
    } else {
          value = json['value'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'timeMs': timeMs,
      'value': value
    };
  }

  static List<EngineState> listFromJson(List<dynamic> json) {
    return json == null ? new List<EngineState>() : json.map((value) => new EngineState.fromJson(value)).toList();
  }

  static Map<String, EngineState> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, EngineState>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new EngineState.fromJson(value));
    }
    return map;
  }
}

