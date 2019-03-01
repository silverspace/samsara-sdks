part of openapi.api;

class AssetReeferResponseReeferStatsReturnAirTemp {
  /* Return air temperature in millidegree Celsius. */
  int tempInMilliC = null;
  /* Timestamp in Unix milliseconds since epoch. */
  int changedAtMs = null;
  AssetReeferResponseReeferStatsReturnAirTemp();

  @override
  String toString() {
    return 'AssetReeferResponseReeferStatsReturnAirTemp[tempInMilliC=$tempInMilliC, changedAtMs=$changedAtMs, ]';
  }

  AssetReeferResponseReeferStatsReturnAirTemp.fromJson(Map<String, dynamic> json) {
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

  static List<AssetReeferResponseReeferStatsReturnAirTemp> listFromJson(List<dynamic> json) {
    return json == null ? new List<AssetReeferResponseReeferStatsReturnAirTemp>() : json.map((value) => new AssetReeferResponseReeferStatsReturnAirTemp.fromJson(value)).toList();
  }

  static Map<String, AssetReeferResponseReeferStatsReturnAirTemp> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, AssetReeferResponseReeferStatsReturnAirTemp>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new AssetReeferResponseReeferStatsReturnAirTemp.fromJson(value));
    }
    return map;
  }
}

