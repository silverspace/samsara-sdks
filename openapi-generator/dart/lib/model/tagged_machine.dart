part of openapi.api;

class TaggedMachine {
  /* The ID of the Machine being tagged. */
  int id = null;
  /* Name of the Machine being tagged. */
  String name = null;
  TaggedMachine();

  @override
  String toString() {
    return 'TaggedMachine[id=$id, name=$name, ]';
  }

  TaggedMachine.fromJson(Map<String, dynamic> json) {
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

  static List<TaggedMachine> listFromJson(List<dynamic> json) {
    return json == null ? new List<TaggedMachine>() : json.map((value) => new TaggedMachine.fromJson(value)).toList();
  }

  static Map<String, TaggedMachine> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, TaggedMachine>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new TaggedMachine.fromJson(value));
    }
    return map;
  }
}

