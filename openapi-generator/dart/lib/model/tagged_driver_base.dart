part of openapi.api;

class TaggedDriverBase {
  /* The ID of the Driver being tagged. */
  int id = null;
  TaggedDriverBase();

  @override
  String toString() {
    return 'TaggedDriverBase[id=$id, ]';
  }

  TaggedDriverBase.fromJson(Map<String, dynamic> json) {
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

  static List<TaggedDriverBase> listFromJson(List<dynamic> json) {
    return json == null ? new List<TaggedDriverBase>() : json.map((value) => new TaggedDriverBase.fromJson(value)).toList();
  }

  static Map<String, TaggedDriverBase> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, TaggedDriverBase>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new TaggedDriverBase.fromJson(value));
    }
    return map;
  }
}

