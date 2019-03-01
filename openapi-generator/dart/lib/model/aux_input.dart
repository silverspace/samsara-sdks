part of openapi.api;

class AuxInput {
  /* Timestamp in Unix epoch milliseconds. */
  Object timeMs = null;
  /* Boolean representing the digital value of the aux input. */
  bool value = null;
  AuxInput();

  @override
  String toString() {
    return 'AuxInput[timeMs=$timeMs, value=$value, ]';
  }

  AuxInput.fromJson(Map<String, dynamic> json) {
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

  static List<AuxInput> listFromJson(List<dynamic> json) {
    return json == null ? new List<AuxInput>() : json.map((value) => new AuxInput.fromJson(value)).toList();
  }

  static Map<String, AuxInput> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, AuxInput>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new AuxInput.fromJson(value));
    }
    return map;
  }
}

