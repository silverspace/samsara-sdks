part of openapi.api;

class InlineObject2 {
  /* The address of the entry to add, as it would be recognized if provided to maps.google.com. */
  String address = null;
  /* Group ID to query. */
  int groupId = null;
  /* Name of the location to add to the address book. */
  String name = null;
  /* Radius in meters of the address (used for matching vehicle trip stops to this location). */
  int radius = null;
  InlineObject2();

  @override
  String toString() {
    return 'InlineObject2[address=$address, groupId=$groupId, name=$name, radius=$radius, ]';
  }

  InlineObject2.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['address'] == null) {
      address = null;
    } else {
          address = json['address'];
    }
    if (json['groupId'] == null) {
      groupId = null;
    } else {
          groupId = json['groupId'];
    }
    if (json['name'] == null) {
      name = null;
    } else {
          name = json['name'];
    }
    if (json['radius'] == null) {
      radius = null;
    } else {
          radius = json['radius'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'address': address,
      'groupId': groupId,
      'name': name,
      'radius': radius
    };
  }

  static List<InlineObject2> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject2>() : json.map((value) => new InlineObject2.fromJson(value)).toList();
  }

  static Map<String, InlineObject2> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject2>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject2.fromJson(value));
    }
    return map;
  }
}

