part of openapi.api;

class TaggedAsset {
  /* The ID of the Asset being tagged. */
  int id = null;
  /* Name of the Asset being tagged. */
  String name = null;
  TaggedAsset();

  @override
  String toString() {
    return 'TaggedAsset[id=$id, name=$name, ]';
  }

  TaggedAsset.fromJson(Map<String, dynamic> json) {
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

  static List<TaggedAsset> listFromJson(List<dynamic> json) {
    return json == null ? new List<TaggedAsset>() : json.map((value) => new TaggedAsset.fromJson(value)).toList();
  }

  static Map<String, TaggedAsset> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, TaggedAsset>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new TaggedAsset.fromJson(value));
    }
    return map;
  }
}

