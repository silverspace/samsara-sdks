part of openapi.api;

class AssetReeferResponseReeferStatsSetPoint {
  /* Set point temperature in millidegree Celsius. */
  int tempInMilliC = null;
  /* Timestamp in Unix milliseconds since epoch. */
  int changedAtMs = null;
  AssetReeferResponseReeferStatsSetPoint();

  @override
  String toString() {
    return 'AssetReeferResponseReeferStatsSetPoint[tempInMilliC=$tempInMilliC, changedAtMs=$changedAtMs, ]';
  }

  AssetReeferResponseReeferStatsSetPoint.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['tempInMilliC'] == null) {
      tempInMilliC = null;
    } else {
          tempInMilliC = json['tempInMilliC'];
    }
    if (json['changedAtMs'] == null) {
      changedAtMs = null;
    } else {
          changedAtMs = json['changedAtMs'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'tempInMilliC': tempInMilliC,
      'changedAtMs': changedAtMs
    };
  }

  static List<AssetReeferResponseReeferStatsSetPoint> listFromJson(List<dynamic> json) {
    return json == null ? new List<AssetReeferResponseReeferStatsSetPoint>() : json.map((value) => new AssetReeferResponseReeferStatsSetPoint.fromJson(value)).toList();
  }

  static Map<String, AssetReeferResponseReeferStatsSetPoint> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, AssetReeferResponseReeferStatsSetPoint>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new AssetReeferResponseReeferStatsSetPoint.fromJson(value));
    }
    return map;
  }
}

