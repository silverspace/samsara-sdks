part of openapi.api;

class VehicleMaintenanceJ1939 {
  
  VehicleMaintenanceJ1939CheckEngineLight checkEngineLight = null;
  /* J1939 DTCs. */
  List<VehicleMaintenanceJ1939DiagnosticTroubleCodes> diagnosticTroubleCodes = [];
  VehicleMaintenanceJ1939();

  @override
  String toString() {
    return 'VehicleMaintenanceJ1939[checkEngineLight=$checkEngineLight, diagnosticTroubleCodes=$diagnosticTroubleCodes, ]';
  }

  VehicleMaintenanceJ1939.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['checkEngineLight'] == null) {
      checkEngineLight = null;
    } else {
      checkEngineLight = new VehicleMaintenanceJ1939CheckEngineLight.fromJson(json['checkEngineLight']);
    }
    if (json['diagnosticTroubleCodes'] == null) {
      diagnosticTroubleCodes = null;
    } else {
      diagnosticTroubleCodes = VehicleMaintenanceJ1939DiagnosticTroubleCodes.listFromJson(json['diagnosticTroubleCodes']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'checkEngineLight': checkEngineLight,
      'diagnosticTroubleCodes': diagnosticTroubleCodes
    };
  }

  static List<VehicleMaintenanceJ1939> listFromJson(List<dynamic> json) {
    return json == null ? new List<VehicleMaintenanceJ1939>() : json.map((value) => new VehicleMaintenanceJ1939.fromJson(value)).toList();
  }

  static Map<String, VehicleMaintenanceJ1939> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, VehicleMaintenanceJ1939>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new VehicleMaintenanceJ1939.fromJson(value));
    }
    return map;
  }
}

