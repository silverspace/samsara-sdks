part of openapi.api;

class TaggedDriver {
  /* The ID of the Driver being tagged. */
  int id = null;
  /* Name of the Driver being tagged. */
  String name = null;
  TaggedDriver();

  @override
  String toString() {
    return 'TaggedDriver[id=$id, name=$name, ]';
  }

  TaggedDriver.fromJson(Map<String, dynamic> json) {
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

  static List<TaggedDriver> listFromJson(List<dynamic> json) {
    return json == null ? new List<TaggedDriver>() : json.map((value) => new TaggedDriver.fromJson(value)).toList();
  }

  static Map<String, TaggedDriver> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, TaggedDriver>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new TaggedDriver.fromJson(value));
    }
    return map;
  }
}

