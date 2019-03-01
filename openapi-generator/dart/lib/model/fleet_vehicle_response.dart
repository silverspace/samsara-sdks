part of openapi.api;

class FleetVehicleResponse {
  
  Map<String, String> externalIds = {};
  /* Harsh event detection setting. */
  String harshAccelSetting = null;
  /* ID of the vehicle. */
  int id = null;
  /* Name of the vehicle. */
  String name = null;
  
  FleetVehicleResponseVehicleInfo vehicleInfo = null;
  FleetVehicleResponse();

  @override
  String toString() {
    return 'FleetVehicleResponse[externalIds=$externalIds, harshAccelSetting=$harshAccelSetting, id=$id, name=$name, vehicleInfo=$vehicleInfo, ]';
  }

  FleetVehicleResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['externalIds'] == null) {
      externalIds = null;
    } else {
          externalIds = (json['externalIds'] as Map).cast<String, String>();
    }
    if (json['harshAccelSetting'] == null) {
      harshAccelSetting = null;
    } else {
          harshAccelSetting = json['harshAccelSetting'];
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
    if (json['vehicleInfo'] == null) {
      vehicleInfo = null;
    } else {
      vehicleInfo = new FleetVehicleResponseVehicleInfo.fromJson(json['vehicleInfo']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'externalIds': externalIds,
      'harshAccelSetting': harshAccelSetting,
      'id': id,
      'name': name,
      'vehicleInfo': vehicleInfo
    };
  }

  static List<FleetVehicleResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<FleetVehicleResponse>() : json.map((value) => new FleetVehicleResponse.fromJson(value)).toList();
  }

  static Map<String, FleetVehicleResponse> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, FleetVehicleResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new FleetVehicleResponse.fromJson(value));
    }
    return map;
  }
}

