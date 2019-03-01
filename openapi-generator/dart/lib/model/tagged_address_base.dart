part of openapi.api;

class TaggedAddressBase {
  /* The ID of the address being tagged. */
  int id = null;
  TaggedAddressBase();

  @override
  String toString() {
    return 'TaggedAddressBase[id=$id, ]';
  }

  TaggedAddressBase.fromJson(Map<String, dynamic> json) {
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

  static List<TaggedAddressBase> listFromJson(List<dynamic> json) {
    return json == null ? new List<TaggedAddressBase>() : json.map((value) => new TaggedAddressBase.fromJson(value)).toList();
  }

  static Map<String, TaggedAddressBase> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, TaggedAddressBase>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new TaggedAddressBase.fromJson(value));
    }
    return map;
  }
}

