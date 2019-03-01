part of openapi.api;

class CargoResponseSensors {
  /* Flag indicating whether the current cargo is empty or loaded. */
  bool cargoEmpty = null;
  /* Name of the sensor. */
  String name = null;
  /* ID of the sensor. */
  int id = null;
  CargoResponseSensors();

  @override
  String toString() {
    return 'CargoResponseSensors[cargoEmpty=$cargoEmpty, name=$name, id=$id, ]';
  }

  CargoResponseSensors.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['cargoEmpty'] == null) {
      cargoEmpty = null;
    } else {
          cargoEmpty = json['cargoEmpty'];
    }
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
      'cargoEmpty': cargoEmpty,
      'name': name,
      'id': id
    };
  }

  static List<CargoResponseSensors> listFromJson(List<dynamic> json) {
    return json == null ? new List<CargoResponseSensors>() : json.map((value) => new CargoResponseSensors.fromJson(value)).toList();
  }

  static Map<String, CargoResponseSensors> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, CargoResponseSensors>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new CargoResponseSensors.fromJson(value));
    }
    return map;
  }
}

