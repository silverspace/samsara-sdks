part of openapi.api;

class AssetReeferResponseReeferStatsAlarms1 {
  
  List<AssetReeferResponseReeferStatsAlarms> alarms = [];
  /* Timestamp when the alarms were reported, in Unix milliseconds since epoch */
  int changedAtMs = null;
  AssetReeferResponseReeferStatsAlarms1();

  @override
  String toString() {
    return 'AssetReeferResponseReeferStatsAlarms1[alarms=$alarms, changedAtMs=$changedAtMs, ]';
  }

  AssetReeferResponseReeferStatsAlarms1.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['alarms'] == null) {
      alarms = null;
    } else {
      alarms = AssetReeferResponseReeferStatsAlarms.listFromJson(json['alarms']);
    }
    if (json['changedAtMs'] == null) {
      changedAtMs = null;
    } else {
          changedAtMs = json['changedAtMs'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'alarms': alarms,
      'changedAtMs': changedAtMs
    };
  }

  static List<AssetReeferResponseReeferStatsAlarms1> listFromJson(List<dynamic> json) {
    return json == null ? new List<AssetReeferResponseReeferStatsAlarms1>() : json.map((value) => new AssetReeferResponseReeferStatsAlarms1.fromJson(value)).toList();
  }

  static Map<String, AssetReeferResponseReeferStatsAlarms1> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, AssetReeferResponseReeferStatsAlarms1>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new AssetReeferResponseReeferStatsAlarms1.fromJson(value));
    }
    return map;
  }
}

