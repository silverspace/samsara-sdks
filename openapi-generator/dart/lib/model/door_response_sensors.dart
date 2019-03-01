part of openapi.api;

class DoorResponseSensors {
  /* Flag indicating whether the current door is closed or open. */
  bool doorClosed = null;
  /* Name of the sensor. */
  String name = null;
  /* ID of the sensor. */
  int id = null;
  DoorResponseSensors();

  @override
  String toString() {
    return 'DoorResponseSensors[doorClosed=$doorClosed, name=$name, id=$id, ]';
  }

  DoorResponseSensors.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['doorClosed'] == null) {
      doorClosed = null;
    } else {
          doorClosed = json['doorClosed'];
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
      'doorClosed': doorClosed,
      'name': name,
      'id': id
    };
  }

  static List<DoorResponseSensors> listFromJson(List<dynamic> json) {
    return json == null ? new List<DoorResponseSensors>() : json.map((value) => new DoorResponseSensors.fromJson(value)).toList();
  }

  static Map<String, DoorResponseSensors> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DoorResponseSensors>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DoorResponseSensors.fromJson(value));
    }
    return map;
  }
}

