part of openapi.api;

class InlineObject16 {
  
  Map<String, String> externalIds = {};
  /* Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic */
  int harshAccelSetting = null;
  /* Name */
  String name = null;
  InlineObject16();

  @override
  String toString() {
    return 'InlineObject16[externalIds=$externalIds, harshAccelSetting=$harshAccelSetting, name=$name, ]';
  }

  InlineObject16.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['externalIds'] == null) {
      externalIds = null;
    } else {
          externalIds = (json['externalIds'] as Map).cast<String, String>();
    }
    if (json['harsh_accel_setting'] == null) {
      harshAccelSetting = null;
    } else {
          harshAccelSetting = json['harsh_accel_setting'];
    }
    if (json['name'] == null) {
      name = null;
    } else {
          name = json['name'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'externalIds': externalIds,
      'harsh_accel_setting': harshAccelSetting,
      'name': name
    };
  }

  static List<InlineObject16> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject16>() : json.map((value) => new InlineObject16.fromJson(value)).toList();
  }

  static Map<String, InlineObject16> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject16>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject16.fromJson(value));
    }
    return map;
  }
}

