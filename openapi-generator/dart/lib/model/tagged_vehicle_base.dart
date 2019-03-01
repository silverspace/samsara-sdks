part of openapi.api;

class TaggedVehicleBase {
  /* The ID of the Vehicle being tagged. */
  int id = null;
  TaggedVehicleBase();

  @override
  String toString() {
    return 'TaggedVehicleBase[id=$id, ]';
  }

  TaggedVehicleBase.fromJson(Map<String, dynamic> json) {
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

  static List<TaggedVehicleBase> listFromJson(List<dynamic> json) {
    return json == null ? new List<TaggedVehicleBase>() : json.map((value) => new TaggedVehicleBase.fromJson(value)).toList();
  }

  static Map<String, TaggedVehicleBase> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, TaggedVehicleBase>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new TaggedVehicleBase.fromJson(value));
    }
    return map;
  }
}

