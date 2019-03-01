part of openapi.api;

class TaggedSensorBase {
  /* The ID of the Sensor being tagged. */
  int id = null;
  TaggedSensorBase();

  @override
  String toString() {
    return 'TaggedSensorBase[id=$id, ]';
  }

  TaggedSensorBase.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['id'] == null) {
      id = null;
    } else {
          id = json['id'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id
    };
  }

  static List<TaggedSensorBase> listFromJson(List<dynamic> json) {
    return json == null ? new List<TaggedSensorBase>() : json.map((value) => new TaggedSensorBase.fromJson(value)).toList();
  }

  static Map<String, TaggedSensorBase> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, TaggedSensorBase>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new TaggedSensorBase.fromJson(value));
    }
    return map;
  }
}

