part of openapi.api;

class VehicleMaintenancePassengerCheckEngineLight {
  
  bool isOn = null;
  VehicleMaintenancePassengerCheckEngineLight();

  @override
  String toString() {
    return 'VehicleMaintenancePassengerCheckEngineLight[isOn=$isOn, ]';
  }

  VehicleMaintenancePassengerCheckEngineLight.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['isOn'] == null) {
      isOn = null;
    } else {
          isOn = json['isOn'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'isOn': isOn
    };
  }

  static List<VehicleMaintenancePassengerCheckEngineLight> listFromJson(List<dynamic> json) {
    return json == null ? new List<VehicleMaintenancePassengerCheckEngineLight>() : json.map((value) => new VehicleMaintenancePassengerCheckEngineLight.fromJson(value)).toList();
  }

  static Map<String, VehicleMaintenancePassengerCheckEngineLight> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, VehicleMaintenancePassengerCheckEngineLight>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new VehicleMaintenancePassengerCheckEngineLight.fromJson(value));
    }
    return map;
  }
}

