part of openapi.api;

class CurrentDriver {
  CurrentDriver();

  @override
  String toString() {
    return 'CurrentDriver[]';
  }

  CurrentDriver.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
  }

  Map<String, dynamic> toJson() {
    return {
    };
  }

  static List<CurrentDriver> listFromJson(List<dynamic> json) {
    return json == null ? new List<CurrentDriver>() : json.map((value) => new CurrentDriver.fromJson(value)).toList();
  }

  static Map<String, CurrentDriver> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, CurrentDriver>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new CurrentDriver.fromJson(value));
    }
    return map;
  }
}

