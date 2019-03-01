part of openapi.api;

class VehicleHarshEventResponseLocation {
  /* Address of location where the harsh event occurred */
  String address = null;
  /* Latitude of location where the harsh event occurred */
  String latitude = null;
  /* Longitude of location where the harsh event occurred */
  String longitude = null;
  VehicleHarshEventResponseLocation();

  @override
  String toString() {
    return 'VehicleHarshEventResponseLocation[address=$address, latitude=$latitude, longitude=$longitude, ]';
  }

  VehicleHarshEventResponseLocation.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['address'] == null) {
      address = null;
    } else {
          address = json['address'];
    }
    if (json['latitude'] == null) {
      latitude = null;
    } else {
          latitude = json['latitude'];
    }
    if (json['longitude'] == null) {
      longitude = null;
    } else {
          longitude = json['longitude'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'address': address,
      'latitude': latitude,
      'longitude': longitude
    };
  }

  static List<VehicleHarshEventResponseLocation> listFromJson(List<dynamic> json) {
    return json == null ? new List<VehicleHarshEventResponseLocation>() : json.map((value) => new VehicleHarshEventResponseLocation.fromJson(value)).toList();
  }

  static Map<String, VehicleHarshEventResponseLocation> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, VehicleHarshEventResponseLocation>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new VehicleHarshEventResponseLocation.fromJson(value));
    }
    return map;
  }
}

