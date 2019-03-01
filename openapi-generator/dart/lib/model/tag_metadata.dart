part of openapi.api;

class TagMetadata {
  /* The ID of this tag. */
  int id = null;
  /* Name of this tag. */
  String name = null;
  TagMetadata();

  @override
  String toString() {
    return 'TagMetadata[id=$id, name=$name, ]';
  }

  TagMetadata.fromJson(Map<String, dynamic> json) {
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

  static List<TagMetadata> listFromJson(List<dynamic> json) {
    return json == null ? new List<TagMetadata>() : json.map((value) => new TagMetadata.fromJson(value)).toList();
  }

  static Map<String, TagMetadata> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, TagMetadata>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new TagMetadata.fromJson(value));
    }
    return map;
  }
}

