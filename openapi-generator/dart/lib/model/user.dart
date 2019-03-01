part of openapi.api;

class User {
  /* The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration. */
  String authType = null;
  //enum authTypeEnum {  default,  saml,  };{
  /* The email address of this user. */
  String email = null;
  /* The first and last name of the user. */
  String name = null;
  /* The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. */
  String organizationRoleId = null;
  /* The ID of the User record. */
  int id = null;
  /* The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. */
  String organizationRole = null;
  /* The specific tags this user has access to. This will be blank for users that have full access to the organization. */
  List<UserTagRole> tagRoles = [];
  User();

  @override
  String toString() {
    return 'User[authType=$authType, email=$email, name=$name, organizationRoleId=$organizationRoleId, id=$id, organizationRole=$organizationRole, tagRoles=$tagRoles, ]';
  }

  User.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['authType'] == null) {
      authType = null;
    } else {
          authType = json['authType'];
    }
    if (json['email'] == null) {
      email = null;
    } else {
          email = json['email'];
    }
    if (json['name'] == null) {
      name = null;
    } else {
          name = json['name'];
    }
    if (json['organizationRoleId'] == null) {
      organizationRoleId = null;
    } else {
          organizationRoleId = json['organizationRoleId'];
    }
    if (json['id'] == null) {
      id = null;
    } else {
          id = json['id'];
    }
    if (json['organizationRole'] == null) {
      organizationRole = null;
    } else {
          organizationRole = json['organizationRole'];
    }
    if (json['tagRoles'] == null) {
      tagRoles = null;
    } else {
      tagRoles = UserTagRole.listFromJson(json['tagRoles']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'authType': authType,
      'email': email,
      'name': name,
      'organizationRoleId': organizationRoleId,
      'id': id,
      'organizationRole': organizationRole,
      'tagRoles': tagRoles
    };
  }

  static List<User> listFromJson(List<dynamic> json) {
    return json == null ? new List<User>() : json.map((value) => new User.fromJson(value)).toList();
  }

  static Map<String, User> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, User>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new User.fromJson(value));
    }
    return map;
  }
}

