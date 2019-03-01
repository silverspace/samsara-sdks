part of openapi.api;

class UserBase {
  /* The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration. */
  String authType = null;
  //enum authTypeEnum {  default,  saml,  };{
  /* The email address of this user. */
  String email = null;
  /* The first and last name of the user. */
  String name = null;
  /* The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. */
  String organizationRoleId = null;
  UserBase();

  @override
  String toString() {
    return 'UserBase[authType=$authType, email=$email, name=$name, organizationRoleId=$organizationRoleId, ]';
  }

  UserBase.fromJson(Map<String, dynamic> json) {
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
  }

  Map<String, dynamic> toJson() {
    return {
      'authType': authType,
      'email': email,
      'name': name,
      'organizationRoleId': organizationRoleId
    };
  }

  static List<UserBase> listFromJson(List<dynamic> json) {
    return json == null ? new List<UserBase>() : json.map((value) => new UserBase.fromJson(value)).toList();
  }

  static Map<String, UserBase> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, UserBase>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new UserBase.fromJson(value));
    }
    return map;
  }
}

