part of openapi.api;

class TemperatureResponseSensors {
  /* Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported. */
  int probeTemperature = null;
  /* Name of the sensor. */
  String name = null;
  /* ID of the sensor. */
  int id = null;
  /* Currently reported ambient temperature in millidegrees celsius. */
  int ambientTemperature = null;
  TemperatureResponseSensors();

  @override
  String toString() {
    return 'TemperatureResponseSensors[probeTemperature=$probeTemperature, name=$name, id=$id, ambientTemperature=$ambientTemperature, ]';
  }

  TemperatureResponseSensors.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['probeTemperature'] == null) {
      probeTemperature = null;
    } else {
          probeTemperature = json['probeTemperature'];
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
    if (json['ambientTemperature'] == null) {
      ambientTemperature = null;
    } else {
          ambientTemperature = json['ambientTemperature'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'probeTemperature': probeTemperature,
      'name': name,
      'id': id,
      'ambientTemperature': ambientTemperature
    };
  }

  static List<TemperatureResponseSensors> listFromJson(List<dynamic> json) {
    return json == null ? new List<TemperatureResponseSensors>() : json.map((value) => new TemperatureResponseSensors.fromJson(value)).toList();
  }

  static Map<String, TemperatureResponseSensors> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, TemperatureResponseSensors>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new TemperatureResponseSensors.fromJson(value));
    }
    return map;
  }
}

