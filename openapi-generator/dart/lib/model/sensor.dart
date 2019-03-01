part of openapi.api;

class Sensor {
  /* ID of the sensor. */
  int id = null;
  /* MAC address of the sensor. */
  String macAddress = null;
  /* Name of the sensor. */
  String name = null;
  Sensor();

  @override
  String toString() {
    return 'Sensor[id=$id, macAddress=$macAddress, name=$name, ]';
  }

  Sensor.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['id'] == null) {
      id = null;
    } else {
          id = json['id'];
    }
    if (json['macAddress'] == null) {
      macAddress = null;
    } else {
          macAddress = json['macAddress'];
    }
    if (json['name'] == null) {
      name = null;
    } else {
          name = json['name'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id,
      'macAddress': macAddress,
      'name': name
    };
  }

  static List<Sensor> listFromJson(List<dynamic> json) {
    return json == null ? new List<Sensor>() : json.map((value) => new Sensor.fromJson(value)).toList();
  }

  static Map<String, Sensor> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, Sensor>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new Sensor.fromJson(value));
    }
    return map;
  }
}

