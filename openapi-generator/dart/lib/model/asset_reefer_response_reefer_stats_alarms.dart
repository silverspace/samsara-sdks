part of openapi.api;

class AssetReeferResponseReeferStatsAlarms {
  /* Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action */
  int severity = null;
  /* Recommended operator action */
  String operatorAction = null;
  /* Description of the alarm */
  String description = null;
  /* ID of the alarm */
  int alarmCode = null;
  AssetReeferResponseReeferStatsAlarms();

  @override
  String toString() {
    return 'AssetReeferResponseReeferStatsAlarms[severity=$severity, operatorAction=$operatorAction, description=$description, alarmCode=$alarmCode, ]';
  }

  AssetReeferResponseReeferStatsAlarms.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['severity'] == null) {
      severity = null;
    } else {
          severity = json['severity'];
    }
    if (json['operatorAction'] == null) {
      operatorAction = null;
    } else {
          operatorAction = json['operatorAction'];
    }
    if (json['description'] == null) {
      description = null;
    } else {
          description = json['description'];
    }
    if (json['alarmCode'] == null) {
      alarmCode = null;
    } else {
          alarmCode = json['alarmCode'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'severity': severity,
      'operatorAction': operatorAction,
      'description': description,
      'alarmCode': alarmCode
    };
  }

  static List<AssetReeferResponseReeferStatsAlarms> listFromJson(List<dynamic> json) {
    return json == null ? new List<AssetReeferResponseReeferStatsAlarms>() : json.map((value) => new AssetReeferResponseReeferStatsAlarms.fromJson(value)).toList();
  }

  static Map<String, AssetReeferResponseReeferStatsAlarms> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, AssetReeferResponseReeferStatsAlarms>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new AssetReeferResponseReeferStatsAlarms.fromJson(value));
    }
    return map;
  }
}

