part of openapi.api;

class CargoResponse {
  
  int groupId = null;
  
  List<CargoResponseSensors> sensors = [];
  CargoResponse();

  @override
  String toString() {
    return 'CargoResponse[groupId=$groupId, sensors=$sensors, ]';
  }

  CargoResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['groupId'] == null) {
      groupId = null;
    } else {
          groupId = json['groupId'];
    }
    if (json['sensors'] == null) {
      sensors = null;
    } else {
      sensors = CargoResponseSensors.listFromJson(json['sensors']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'groupId': groupId,
      'sensors': sensors
    };
  }

  static List<CargoResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<CargoResponse>() : json.map((value) => new CargoResponse.fromJson(value)).toList();
  }

  static Map<String, CargoResponse> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, CargoResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new CargoResponse.fromJson(value));
    }
    return map;
  }
}

