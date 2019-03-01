part of openapi.api;

class HumidityResponse {
  
  int groupId = null;
  
  List<HumidityResponseSensors> sensors = [];
  HumidityResponse();

  @override
  String toString() {
    return 'HumidityResponse[groupId=$groupId, sensors=$sensors, ]';
  }

  HumidityResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['groupId'] == null) {
      groupId = null;
    } else {
          groupId = json['groupId'];
    }
    if (json['sensors'] == null) {
      sensors = null;
    } else {
      sensors = HumidityResponseSensors.listFromJson(json['sensors']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'groupId': groupId,
      'sensors': sensors
    };
  }

  static List<HumidityResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<HumidityResponse>() : json.map((value) => new HumidityResponse.fromJson(value)).toList();
  }

  static Map<String, HumidityResponse> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, HumidityResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new HumidityResponse.fromJson(value));
    }
    return map;
  }
}

