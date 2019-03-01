part of openapi.api;

class DvirBaseVehicle {
  /* The vehicle on which DVIR was done. */
  String name = null;
  /* The vehicle id on which DVIR was done. */
  int id = null;
  DvirBaseVehicle();

  @override
  String toString() {
    return 'DvirBaseVehicle[name=$name, id=$id, ]';
  }

  DvirBaseVehicle.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['name'] == null) {
      name = null;
    } else {
          name = json['name'];
    }
    if (json['id'] == null) {
      id = null;
    } else {
          id = json['id'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'name': name,
      'id': id
    };
  }

  static List<DvirBaseVehicle> listFromJson(List<dynamic> json) {
    return json == null ? new List<DvirBaseVehicle>() : json.map((value) => new DvirBaseVehicle.fromJson(value)).toList();
  }

  static Map<String, DvirBaseVehicle> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DvirBaseVehicle>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DvirBaseVehicle.fromJson(value));
    }
    return map;
  }
}

