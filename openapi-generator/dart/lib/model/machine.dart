part of openapi.api;

class Machine {
  /* ID of the machine. */
  int id = null;
  /* Name of the machine. */
  String name = null;
  /* Notes about the machine */
  String notes = null;
  Machine();

  @override
  String toString() {
    return 'Machine[id=$id, name=$name, notes=$notes, ]';
  }

  Machine.fromJson(Map<String, dynamic> json) {
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
    if (json['notes'] == null) {
      notes = null;
    } else {
          notes = json['notes'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id,
      'name': name,
      'notes': notes
    };
  }

  static List<Machine> listFromJson(List<dynamic> json) {
    return json == null ? new List<Machine>() : json.map((value) => new Machine.fromJson(value)).toList();
  }

  static Map<String, Machine> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, Machine>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new Machine.fromJson(value));
    }
    return map;
  }
}

