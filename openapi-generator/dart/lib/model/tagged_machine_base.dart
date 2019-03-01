part of openapi.api;

class TaggedMachineBase {
  /* The ID of the Machine being tagged. */
  int id = null;
  TaggedMachineBase();

  @override
  String toString() {
    return 'TaggedMachineBase[id=$id, ]';
  }

  TaggedMachineBase.fromJson(Map<String, dynamic> json) {
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

  static List<TaggedMachineBase> listFromJson(List<dynamic> json) {
    return json == null ? new List<TaggedMachineBase>() : json.map((value) => new TaggedMachineBase.fromJson(value)).toList();
  }

  static Map<String, TaggedMachineBase> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, TaggedMachineBase>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new TaggedMachineBase.fromJson(value));
    }
    return map;
  }
}

