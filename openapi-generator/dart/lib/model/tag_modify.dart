part of openapi.api;

class TagModify {
  
  TagModifyAdd add = null;
  
  TagModifyDelete delete = null;
  /* Updated name of this tag. */
  String name = null;
  /* If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag. */
  int parentTagId = null;
  TagModify();

  @override
  String toString() {
    return 'TagModify[add=$add, delete=$delete, name=$name, parentTagId=$parentTagId, ]';
  }

  TagModify.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['add'] == null) {
      add = null;
    } else {
      add = new TagModifyAdd.fromJson(json['add']);
    }
    if (json['delete'] == null) {
      delete = null;
    } else {
      delete = new TagModifyDelete.fromJson(json['delete']);
    }
    if (json['name'] == null) {
      name = null;
    } else {
          name = json['name'];
    }
    if (json['parentTagId'] == null) {
      parentTagId = null;
    } else {
          parentTagId = json['parentTagId'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'add': add,
      'delete': delete,
      'name': name,
      'parentTagId': parentTagId
    };
  }

  static List<TagModify> listFromJson(List<dynamic> json) {
    return json == null ? new List<TagModify>() : json.map((value) => new TagModify.fromJson(value)).toList();
  }

  static Map<String, TagModify> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, TagModify>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new TagModify.fromJson(value));
    }
    return map;
  }
}

