part of openapi.api;

class VehicleMaintenance {
  /* ID of the vehicle. */
  int id = null;
  
  VehicleMaintenanceJ1939 j1939 = null;
  
  VehicleMaintenancePassenger passenger = null;
  VehicleMaintenance();

  @override
  String toString() {
    return 'VehicleMaintenance[id=$id, j1939=$j1939, passenger=$passenger, ]';
  }

  VehicleMaintenance.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['id'] == null) {
      id = null;
    } else {
          id = json['id'];
    }
    if (json['j1939'] == null) {
      j1939 = null;
    } else {
      j1939 = new VehicleMaintenanceJ1939.fromJson(json['j1939']);
    }
    if (json['passenger'] == null) {
      passenger = null;
    } else {
      passenger = new VehicleMaintenancePassenger.fromJson(json['passenger']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id,
      'j1939': j1939,
      'passenger': passenger
    };
  }

  static List<VehicleMaintenance> listFromJson(List<dynamic> json) {
    return json == null ? new List<VehicleMaintenance>() : json.map((value) => new VehicleMaintenance.fromJson(value)).toList();
  }

  static Map<String, VehicleMaintenance> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, VehicleMaintenance>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new VehicleMaintenance.fromJson(value));
    }
    return map;
  }
}

