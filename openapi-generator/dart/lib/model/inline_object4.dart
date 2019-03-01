part of openapi.api;

class InlineObject4 {
  /* True indicates that this driver should be reactivated. */
  bool reactivate = null;
  InlineObject4();

  @override
  String toString() {
    return 'InlineObject4[reactivate=$reactivate, ]';
  }

  InlineObject4.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['reactivate'] == null) {
      reactivate = null;
    } else {
          reactivate = json['reactivate'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'reactivate': reactivate
    };
  }

  static List<InlineObject4> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject4>() : json.map((value) => new InlineObject4.fromJson(value)).toList();
  }

  static Map<String, InlineObject4> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject4>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject4.fromJson(value));
    }
    return map;
  }
}

