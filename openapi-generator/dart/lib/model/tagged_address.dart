part of openapi.api;

class TaggedAddress {
  /* The ID of the address being tagged. */
  int id = null;
  /* Name of the address being tagged. */
  String name = null;
  TaggedAddress();

  @override
  String toString() {
    return 'TaggedAddress[id=$id, name=$name, ]';
  }

  TaggedAddress.fromJson(Map<String, dynamic> json) {
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

  static List<TaggedAddress> listFromJson(List<dynamic> json) {
    return json == null ? new List<TaggedAddress>() : json.map((value) => new TaggedAddress.fromJson(value)).toList();
  }

  static Map<String, TaggedAddress> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, TaggedAddress>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new TaggedAddress.fromJson(value));
    }
    return map;
  }
}

