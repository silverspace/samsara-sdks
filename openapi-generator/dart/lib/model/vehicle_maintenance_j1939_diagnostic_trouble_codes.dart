part of openapi.api;

class VehicleMaintenanceJ1939DiagnosticTroubleCodes {
  
  String spnDescription = null;
  
  String fmiText = null;
  
  int spnId = null;
  
  int occurrenceCount = null;
  
  int txId = null;
  
  int fmiId = null;
  VehicleMaintenanceJ1939DiagnosticTroubleCodes();

  @override
  String toString() {
    return 'VehicleMaintenanceJ1939DiagnosticTroubleCodes[spnDescription=$spnDescription, fmiText=$fmiText, spnId=$spnId, occurrenceCount=$occurrenceCount, txId=$txId, fmiId=$fmiId, ]';
  }

  VehicleMaintenanceJ1939DiagnosticTroubleCodes.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['spnDescription'] == null) {
      spnDescription = null;
    } else {
          spnDescription = json['spnDescription'];
    }
    if (json['fmiText'] == null) {
      fmiText = null;
    } else {
          fmiText = json['fmiText'];
    }
    if (json['spnId'] == null) {
      spnId = null;
    } else {
          spnId = json['spnId'];
    }
    if (json['occurrenceCount'] == null) {
      occurrenceCount = null;
    } else {
          occurrenceCount = json['occurrenceCount'];
    }
    if (json['txId'] == null) {
      txId = null;
    } else {
          txId = json['txId'];
    }
    if (json['fmiId'] == null) {
      fmiId = null;
    } else {
          fmiId = json['fmiId'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'spnDescription': spnDescription,
      'fmiText': fmiText,
      'spnId': spnId,
      'occurrenceCount': occurrenceCount,
      'txId': txId,
      'fmiId': fmiId
    };
  }

  static List<VehicleMaintenanceJ1939DiagnosticTroubleCodes> listFromJson(List<dynamic> json) {
    return json == null ? new List<VehicleMaintenanceJ1939DiagnosticTroubleCodes>() : json.map((value) => new VehicleMaintenanceJ1939DiagnosticTroubleCodes.fromJson(value)).toList();
  }

  static Map<String, VehicleMaintenanceJ1939DiagnosticTroubleCodes> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, VehicleMaintenanceJ1939DiagnosticTroubleCodes>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new VehicleMaintenanceJ1939DiagnosticTroubleCodes.fromJson(value));
    }
    return map;
  }
}

