part of openapi.api;

class Vehicle {
  /* Total engine hours for the vehicle. */
  int engineHours = null;
  /* The fuel level of the vehicle as a percentage. (0.0 to 1.0) */
  double fuelLevelPercent = null;
  /* ID of the vehicle. */
  int id = null;
  /* Name of the vehicle. */
  String name = null;
  
  String note = null;
  /* The number of meters reported by the odometer. */
  int odometerMeters = null;
  /* Vehicle Identification Number. */
  String vin = null;
  Vehicle();

  @override
  String toString() {
    return 'Vehicle[engineHours=$engineHours, fuelLevelPercent=$fuelLevelPercent, id=$id, name=$name, note=$note, odometerMeters=$odometerMeters, vin=$vin, ]';
  }

  Vehicle.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['engineHours'] == null) {
      engineHours = null;
    } else {
          engineHours = json['engineHours'];
    }
    if (json['fuelLevelPercent'] == null) {
      fuelLevelPercent = null;
    } else {
          fuelLevelPercent = json['fuelLevelPercent'];
    }
    if (json['id'] == null) {
      id = null;
    } else {
          id = json['id'];
    }
    if (json['name'] == null) {
      name = null;
    } else {
          name = json['name'];
    }
    if (json['note'] == null) {
      note = null;
    } else {
          note = json['note'];
    }
    if (json['odometerMeters'] == null) {
      odometerMeters = null;
    } else {
          odometerMeters = json['odometerMeters'];
    }
    if (json['vin'] == null) {
      vin = null;
    } else {
          vin = json['vin'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'engineHours': engineHours,
      'fuelLevelPercent': fuelLevelPercent,
      'id': id,
      'name': name,
      'note': note,
      'odometerMeters': odometerMeters,
      'vin': vin
    };
  }

  static List<Vehicle> listFromJson(List<dynamic> json) {
    return json == null ? new List<Vehicle>() : json.map((value) => new Vehicle.fromJson(value)).toList();
  }

  static Map<String, Vehicle> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, Vehicle>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new Vehicle.fromJson(value));
    }
    return map;
  }
}

