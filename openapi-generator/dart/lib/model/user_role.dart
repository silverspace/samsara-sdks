part of openapi.api;

class UserRole {
  
  String id = null;
  
  String name = null;
  UserRole();

  @override
  String toString() {
    return 'UserRole[id=$id, name=$name, ]';
  }

  UserRole.fromJson(Map<String, dynamic> json) {
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

  static List<UserRole> listFromJson(List<dynamic> json) {
    return json == null ? new List<UserRole>() : json.map((value) => new UserRole.fromJson(value)).toList();
  }

  static Map<String, UserRole> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, UserRole>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new UserRole.fromJson(value));
    }
    return map;
  }
}

