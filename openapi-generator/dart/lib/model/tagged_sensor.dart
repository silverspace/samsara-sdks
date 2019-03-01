part of openapi.api;

class TaggedSensor {
  /* The ID of the Sensor being tagged. */
  int id = null;
  /* Name of the Sensor being tagged. */
  String name = null;
  TaggedSensor();

  @override
  String toString() {
    return 'TaggedSensor[id=$id, name=$name, ]';
  }

  TaggedSensor.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
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
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id,
      'name': name
    };
  }

  static List<TaggedSensor> listFromJson(List<dynamic> json) {
    return json == null ? new List<TaggedSensor>() : json.map((value) => new TaggedSensor.fromJson(value)).toList();
  }

  static Map<String, TaggedSensor> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, TaggedSensor>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new TaggedSensor.fromJson(value));
    }
    return map;
  }
}

