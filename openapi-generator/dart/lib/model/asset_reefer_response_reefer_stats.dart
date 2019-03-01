part of openapi.api;

class AssetReeferResponseReeferStats {
  /* Fuel percentage of the reefer */
  List<AssetReeferResponseReeferStatsFuelPercentage> fuelPercentage = [];
  /* Power status of the reefer */
  List<AssetReeferResponseReeferStatsPowerStatus> powerStatus = [];
  /* Engine hours of the reefer */
  List<AssetReeferResponseReeferStatsEngineHours> engineHours = [];
  /* Set point temperature of the reefer */
  List<AssetReeferResponseReeferStatsSetPoint> setPoint = [];
  /* Return air temperature of the reefer */
  List<AssetReeferResponseReeferStatsReturnAirTemp> returnAirTemp = [];
  /* Reefer alarms */
  List<AssetReeferResponseReeferStatsAlarms1> alarms = [];
  AssetReeferResponseReeferStats();

  @override
  String toString() {
    return 'AssetReeferResponseReeferStats[fuelPercentage=$fuelPercentage, powerStatus=$powerStatus, engineHours=$engineHours, setPoint=$setPoint, returnAirTemp=$returnAirTemp, alarms=$alarms, ]';
  }

  AssetReeferResponseReeferStats.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['fuelPercentage'] == null) {
      fuelPercentage = null;
    } else {
      fuelPercentage = AssetReeferResponseReeferStatsFuelPercentage.listFromJson(json['fuelPercentage']);
    }
    if (json['powerStatus'] == null) {
      powerStatus = null;
    } else {
      powerStatus = AssetReeferResponseReeferStatsPowerStatus.listFromJson(json['powerStatus']);
    }
    if (json['engineHours'] == null) {
      engineHours = null;
    } else {
      engineHours = AssetReeferResponseReeferStatsEngineHours.listFromJson(json['engineHours']);
    }
    if (json['setPoint'] == null) {
      setPoint = null;
    } else {
      setPoint = AssetReeferResponseReeferStatsSetPoint.listFromJson(json['setPoint']);
    }
    if (json['returnAirTemp'] == null) {
      returnAirTemp = null;
    } else {
      returnAirTemp = AssetReeferResponseReeferStatsReturnAirTemp.listFromJson(json['returnAirTemp']);
    }
    if (json['alarms'] == null) {
      alarms = null;
    } else {
      alarms = AssetReeferResponseReeferStatsAlarms1.listFromJson(json['alarms']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'fuelPercentage': fuelPercentage,
      'powerStatus': powerStatus,
      'engineHours': engineHours,
      'setPoint': setPoint,
      'returnAirTemp': returnAirTemp,
      'alarms': alarms
    };
  }

  static List<AssetReeferResponseReeferStats> listFromJson(List<dynamic> json) {
    return json == null ? new List<AssetReeferResponseReeferStats>() : json.map((value) => new AssetReeferResponseReeferStats.fromJson(value)).toList();
  }

  static Map<String, AssetReeferResponseReeferStats> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, AssetReeferResponseReeferStats>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new AssetReeferResponseReeferStats.fromJson(value));
    }
    return map;
  }
}

