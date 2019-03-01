part of openapi.api;

class AuxInputSeries {
  /* The name of the aux input. */
  String name = null;
  //enum nameEnum {  Emergency Lights,  Emergency Alarm,  Stop Paddle,  Power Take-Off,  Plow,  Sweeper,  Salter,  Boom,  };{
  
  List<AuxInput> values = [];
  AuxInputSeries();

  @override
  String toString() {
    return 'AuxInputSeries[name=$name, values=$values, ]';
  }

  AuxInputSeries.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['name'] == null) {
      name = null;
    } else {
          name = json['name'];
    }
    if (json['values'] == null) {
      values = null;
    } else {
      values = AuxInput.listFromJson(json['values']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'name': name,
      'values': values
    };
  }

  static List<AuxInputSeries> listFromJson(List<dynamic> json) {
    return json == null ? new List<AuxInputSeries>() : json.map((value) => new AuxInputSeries.fromJson(value)).toList();
  }

  static Map<String, AuxInputSeries> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, AuxInputSeries>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new AuxInputSeries.fromJson(value));
    }
    return map;
  }
}

