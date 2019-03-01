part of openapi.api;

class HumidityResponseSensors {
  /* Name of the sensor. */
  String name = null;
  /* Currently reported relative humidity in percent, from 0-100. */
  int humidity = null;
  /* ID of the sensor. */
  int id = null;
  HumidityResponseSensors();

  @override
  String toString() {
    return 'HumidityResponseSensors[name=$name, humidity=$humidity, id=$id, ]';
  }

  HumidityResponseSensors.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['name'] == null) {
      name = null;
    } else {
          name = json['name'];
    }
    if (json['humidity'] == null) {
      humidity = null;
    } else {
          humidity = json['humidity'];
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
      'humidity': humidity,
      'id': id
    };
  }

  static List<HumidityResponseSensors> listFromJson(List<dynamic> json) {
    return json == null ? new List<HumidityResponseSensors>() : json.map((value) => new HumidityResponseSensors.fromJson(value)).toList();
  }

  static Map<String, HumidityResponseSensors> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, HumidityResponseSensors>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new HumidityResponseSensors.fromJson(value));
    }
    return map;
  }
}

