part of openapi.api;

class VehicleMaintenanceJ1939CheckEngineLight {
  
  bool protectIsOn = null;
  
  bool stopIsOn = null;
  
  bool warningIsOn = null;
  
  bool emissionsIsOn = null;
  VehicleMaintenanceJ1939CheckEngineLight();

  @override
  String toString() {
    return 'VehicleMaintenanceJ1939CheckEngineLight[protectIsOn=$protectIsOn, stopIsOn=$stopIsOn, warningIsOn=$warningIsOn, emissionsIsOn=$emissionsIsOn, ]';
  }

  VehicleMaintenanceJ1939CheckEngineLight.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['protectIsOn'] == null) {
      protectIsOn = null;
    } else {
          protectIsOn = json['protectIsOn'];
    }
    if (json['stopIsOn'] == null) {
      stopIsOn = null;
    } else {
          stopIsOn = json['stopIsOn'];
    }
    if (json['warningIsOn'] == null) {
      warningIsOn = null;
    } else {
          warningIsOn = json['warningIsOn'];
    }
    if (json['emissionsIsOn'] == null) {
      emissionsIsOn = null;
    } else {
          emissionsIsOn = json['emissionsIsOn'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'protectIsOn': protectIsOn,
      'stopIsOn': stopIsOn,
      'warningIsOn': warningIsOn,
      'emissionsIsOn': emissionsIsOn
    };
  }

  static List<VehicleMaintenanceJ1939CheckEngineLight> listFromJson(List<dynamic> json) {
    return json == null ? new List<VehicleMaintenanceJ1939CheckEngineLight>() : json.map((value) => new VehicleMaintenanceJ1939CheckEngineLight.fromJson(value)).toList();
  }

  static Map<String, VehicleMaintenanceJ1939CheckEngineLight> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, VehicleMaintenanceJ1939CheckEngineLight>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new VehicleMaintenanceJ1939CheckEngineLight.fromJson(value));
    }
    return map;
  }
}

