part of openapi.api;

class TaggedVehicle {
  /* The ID of the Vehicle being tagged. */
  int id = null;
  /* Name of the Vehicle being tagged. */
  String name = null;
  TaggedVehicle();

  @override
  String toString() {
    return 'TaggedVehicle[id=$id, name=$name, ]';
  }

  TaggedVehicle.fromJson(Map<String, dynamic> json) {
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

  static List<TaggedVehicle> listFromJson(List<dynamic> json) {
    return json == null ? new List<TaggedVehicle>() : json.map((value) => new TaggedVehicle.fromJson(value)).toList();
  }

  static Map<String, TaggedVehicle> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, TaggedVehicle>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new TaggedVehicle.fromJson(value));
    }
    return map;
  }
}

