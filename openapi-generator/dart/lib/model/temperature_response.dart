part of openapi.api;

class TemperatureResponse {
  
  int groupId = null;
  
  List<TemperatureResponseSensors> sensors = [];
  TemperatureResponse();

  @override
  String toString() {
    return 'TemperatureResponse[groupId=$groupId, sensors=$sensors, ]';
  }

  TemperatureResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['groupId'] == null) {
      groupId = null;
    } else {
          groupId = json['groupId'];
    }
    if (json['sensors'] == null) {
      sensors = null;
    } else {
      sensors = TemperatureResponseSensors.listFromJson(json['sensors']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'groupId': groupId,
      'sensors': sensors
    };
  }

  static List<TemperatureResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<TemperatureResponse>() : json.map((value) => new TemperatureResponse.fromJson(value)).toList();
  }

  static Map<String, TemperatureResponse> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, TemperatureResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new TemperatureResponse.fromJson(value));
    }
    return map;
  }
}

