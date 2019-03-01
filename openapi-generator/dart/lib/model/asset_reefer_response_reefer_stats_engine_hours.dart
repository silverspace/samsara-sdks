part of openapi.api;

class AssetReeferResponseReeferStatsEngineHours {
  /* Engine hours of the reefer. */
  int engineHours = null;
  /* Timestamp in Unix milliseconds since epoch. */
  int changedAtMs = null;
  AssetReeferResponseReeferStatsEngineHours();

  @override
  String toString() {
    return 'AssetReeferResponseReeferStatsEngineHours[engineHours=$engineHours, changedAtMs=$changedAtMs, ]';
  }

  AssetReeferResponseReeferStatsEngineHours.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['engineHours'] == null) {
      engineHours = null;
    } else {
          engineHours = json['engineHours'];
    }
    if (json['changedAtMs'] == null) {
      changedAtMs = null;
    } else {
          changedAtMs = json['changedAtMs'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'engineHours': engineHours,
      'changedAtMs': changedAtMs
    };
  }

  static List<AssetReeferResponseReeferStatsEngineHours> listFromJson(List<dynamic> json) {
    return json == null ? new List<AssetReeferResponseReeferStatsEngineHours>() : json.map((value) => new AssetReeferResponseReeferStatsEngineHours.fromJson(value)).toList();
  }

  static Map<String, AssetReeferResponseReeferStatsEngineHours> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, AssetReeferResponseReeferStatsEngineHours>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new AssetReeferResponseReeferStatsEngineHours.fromJson(value));
    }
    return map;
  }
}

