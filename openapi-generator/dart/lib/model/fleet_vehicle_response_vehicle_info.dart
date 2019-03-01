part of openapi.api;

class FleetVehicleResponseVehicleInfo {
  /* Year of the vehicle. */
  int year = null;
  /* Model of the Vehicle. */
  String model = null;
  /* Vehicle Identification Number. */
  String vin = null;
  /* Make of the vehicle. */
  String make = null;
  FleetVehicleResponseVehicleInfo();

  @override
  String toString() {
    return 'FleetVehicleResponseVehicleInfo[year=$year, model=$model, vin=$vin, make=$make, ]';
  }

  FleetVehicleResponseVehicleInfo.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['year'] == null) {
      year = null;
    } else {
          year = json['year'];
    }
    if (json['model'] == null) {
      model = null;
    } else {
          model = json['model'];
    }
    if (json['vin'] == null) {
      vin = null;
    } else {
          vin = json['vin'];
    }
    if (json['make'] == null) {
      make = null;
    } else {
          make = json['make'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'year': year,
      'model': model,
      'vin': vin,
      'make': make
    };
  }

  static List<FleetVehicleResponseVehicleInfo> listFromJson(List<dynamic> json) {
    return json == null ? new List<FleetVehicleResponseVehicleInfo>() : json.map((value) => new FleetVehicleResponseVehicleInfo.fromJson(value)).toList();
  }

  static Map<String, FleetVehicleResponseVehicleInfo> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, FleetVehicleResponseVehicleInfo>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new FleetVehicleResponseVehicleInfo.fromJson(value));
    }
    return map;
  }
}

