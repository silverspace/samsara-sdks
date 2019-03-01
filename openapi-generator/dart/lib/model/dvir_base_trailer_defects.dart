part of openapi.api;

class DvirBaseTrailerDefects {
  /* The comment describing the type of DVIR defect */
  String comment = null;
  /* The type of DVIR defect */
  String defectType = null;
  DvirBaseTrailerDefects();

  @override
  String toString() {
    return 'DvirBaseTrailerDefects[comment=$comment, defectType=$defectType, ]';
  }

  DvirBaseTrailerDefects.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['comment'] == null) {
      comment = null;
    } else {
          comment = json['comment'];
    }
    if (json['defectType'] == null) {
      defectType = null;
    } else {
          defectType = json['defectType'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'comment': comment,
      'defectType': defectType
    };
  }

  static List<DvirBaseTrailerDefects> listFromJson(List<dynamic> json) {
    return json == null ? new List<DvirBaseTrailerDefects>() : json.map((value) => new DvirBaseTrailerDefects.fromJson(value)).toList();
  }

  static Map<String, DvirBaseTrailerDefects> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DvirBaseTrailerDefects>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DvirBaseTrailerDefects.fromJson(value));
    }
    return map;
  }
}

