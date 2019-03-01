part of openapi.api;

class UserTagRole {
  /* The name of the role the user has been granted on this tag. */
  String role = null;
  /* The id of the role the user has been granted on this tag. */
  String roleId = null;
  
  UserTagRoleTag tag = null;
  UserTagRole();

  @override
  String toString() {
    return 'UserTagRole[role=$role, roleId=$roleId, tag=$tag, ]';
  }

  UserTagRole.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['role'] == null) {
      role = null;
    } else {
          role = json['role'];
    }
    if (json['roleId'] == null) {
      roleId = null;
    } else {
          roleId = json['roleId'];
    }
    if (json['tag'] == null) {
      tag = null;
    } else {
      tag = new UserTagRoleTag.fromJson(json['tag']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'role': role,
      'roleId': roleId,
      'tag': tag
    };
  }

  static List<UserTagRole> listFromJson(List<dynamic> json) {
    return json == null ? new List<UserTagRole>() : json.map((value) => new UserTagRole.fromJson(value)).toList();
  }

  static Map<String, UserTagRole> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, UserTagRole>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new UserTagRole.fromJson(value));
    }
    return map;
  }
}

