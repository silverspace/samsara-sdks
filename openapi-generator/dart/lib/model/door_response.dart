part of openapi.api;

class DoorResponse {
  
  int groupId = null;
  
  List<DoorResponseSensors> sensors = [];
  DoorResponse();

  @override
  String toString() {
    return 'DoorResponse[groupId=$groupId, sensors=$sensors, ]';
  }

  DoorResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['groupId'] == null) {
      groupId = null;
    } else {
          groupId = json['groupId'];
    }
    if (json['sensors'] == null) {
      sensors = null;
    } else {
      sensors = DoorResponseSensors.listFromJson(json['sensors']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'groupId': groupId,
      'sensors': sensors
    };
  }

  static List<DoorResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<DoorResponse>() : json.map((value) => new DoorResponse.fromJson(value)).toList();
  }

  static Map<String, DoorResponse> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DoorResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DoorResponse.fromJson(value));
    }
    return map;
  }
}

