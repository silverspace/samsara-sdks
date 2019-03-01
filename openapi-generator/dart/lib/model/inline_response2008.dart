part of openapi.api;

class InlineResponse2008 {
  
  List<Sensor> sensors = [];
  InlineResponse2008();

  @override
  String toString() {
    return 'InlineResponse2008[sensors=$sensors, ]';
  }

  InlineResponse2008.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['sensors'] == null) {
      sensors = null;
    } else {
      sensors = Sensor.listFromJson(json['sensors']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'sensors': sensors
    };
  }

  static List<InlineResponse2008> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineResponse2008>() : json.map((value) => new InlineResponse2008.fromJson(value)).toList();
  }

  static Map<String, InlineResponse2008> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineResponse2008>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineResponse2008.fromJson(value));
    }
    return map;
  }
}

