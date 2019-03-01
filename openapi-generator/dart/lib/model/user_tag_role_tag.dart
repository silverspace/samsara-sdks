part of openapi.api;

class UserTagRoleTag {
  /* The ID of this tag. */
  int parentTagId = null;
  /* Name of this tag. */
  String name = null;
  /* The ID of this tag. */
  int id = null;
  UserTagRoleTag();

  @override
  String toString() {
    return 'UserTagRoleTag[parentTagId=$parentTagId, name=$name, id=$id, ]';
  }

  UserTagRoleTag.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['parentTagId'] == null) {
      parentTagId = null;
    } else {
          parentTagId = json['parentTagId'];
    }
    if (json['name'] == null) {
      name = null;
    } else {
          name = json['name'];
    }
    if (json['id'] == null) {
      id = null;
    } else {
          id = json['id'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'parentTagId': parentTagId,
      'name': name,
      'id': id
    };
  }

  static List<UserTagRoleTag> listFromJson(List<dynamic> json) {
    return json == null ? new List<UserTagRoleTag>() : json.map((value) => new UserTagRoleTag.fromJson(value)).toList();
  }

  static Map<String, UserTagRoleTag> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, UserTagRoleTag>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new UserTagRoleTag.fromJson(value));
    }
    return map;
  }
}

