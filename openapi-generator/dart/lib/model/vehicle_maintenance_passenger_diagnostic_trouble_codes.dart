part of openapi.api;

class VehicleMaintenancePassengerDiagnosticTroubleCodes {
  
  String dtcShortCode = null;
  
  int dtcId = null;
  
  String dtcDescription = null;
  VehicleMaintenancePassengerDiagnosticTroubleCodes();

  @override
  String toString() {
    return 'VehicleMaintenancePassengerDiagnosticTroubleCodes[dtcShortCode=$dtcShortCode, dtcId=$dtcId, dtcDescription=$dtcDescription, ]';
  }

  VehicleMaintenancePassengerDiagnosticTroubleCodes.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['dtcShortCode'] == null) {
      dtcShortCode = null;
    } else {
          dtcShortCode = json['dtcShortCode'];
    }
    if (json['dtcId'] == null) {
      dtcId = null;
    } else {
          dtcId = json['dtcId'];
    }
    if (json['dtcDescription'] == null) {
      dtcDescription = null;
    } else {
          dtcDescription = json['dtcDescription'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'dtcShortCode': dtcShortCode,
      'dtcId': dtcId,
      'dtcDescription': dtcDescription
    };
  }

  static List<VehicleMaintenancePassengerDiagnosticTroubleCodes> listFromJson(List<dynamic> json) {
    return json == null ? new List<VehicleMaintenancePassengerDiagnosticTroubleCodes>() : json.map((value) => new VehicleMaintenancePassengerDiagnosticTroubleCodes.fromJson(value)).toList();
  }

  static Map<String, VehicleMaintenancePassengerDiagnosticTroubleCodes> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, VehicleMaintenancePassengerDiagnosticTroubleCodes>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new VehicleMaintenancePassengerDiagnosticTroubleCodes.fromJson(value));
    }
    return map;
  }
}

