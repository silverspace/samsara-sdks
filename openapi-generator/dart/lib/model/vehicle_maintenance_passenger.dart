part of openapi.api;

class VehicleMaintenancePassenger {
  
  VehicleMaintenancePassengerCheckEngineLight checkEngineLight = null;
  /* Passenger vehicle DTCs. */
  List<VehicleMaintenancePassengerDiagnosticTroubleCodes> diagnosticTroubleCodes = [];
  VehicleMaintenancePassenger();

  @override
  String toString() {
    return 'VehicleMaintenancePassenger[checkEngineLight=$checkEngineLight, diagnosticTroubleCodes=$diagnosticTroubleCodes, ]';
  }

  VehicleMaintenancePassenger.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['checkEngineLight'] == null) {
      checkEngineLight = null;
    } else {
      checkEngineLight = new VehicleMaintenancePassengerCheckEngineLight.fromJson(json['checkEngineLight']);
    }
    if (json['diagnosticTroubleCodes'] == null) {
      diagnosticTroubleCodes = null;
    } else {
      diagnosticTroubleCodes = VehicleMaintenancePassengerDiagnosticTroubleCodes.listFromJson(json['diagnosticTroubleCodes']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'checkEngineLight': checkEngineLight,
      'diagnosticTroubleCodes': diagnosticTroubleCodes
    };
  }

  static List<VehicleMaintenancePassenger> listFromJson(List<dynamic> json) {
    return json == null ? new List<VehicleMaintenancePassenger>() : json.map((value) => new VehicleMaintenancePassenger.fromJson(value)).toList();
  }

  static Map<String, VehicleMaintenancePassenger> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, VehicleMaintenancePassenger>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new VehicleMaintenancePassenger.fromJson(value));
    }
    return map;
  }
}

