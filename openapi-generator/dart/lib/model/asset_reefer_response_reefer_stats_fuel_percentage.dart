part of openapi.api;

class AssetReeferResponseReeferStatsFuelPercentage {
  /* Fuel percentage of the reefer. */
  int fuelPercentage = null;
  /* Timestamp in Unix milliseconds since epoch. */
  int changedAtMs = null;
  AssetReeferResponseReeferStatsFuelPercentage();

  @override
  String toString() {
    return 'AssetReeferResponseReeferStatsFuelPercentage[fuelPercentage=$fuelPercentage, changedAtMs=$changedAtMs, ]';
  }

  AssetReeferResponseReeferStatsFuelPercentage.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['fuelPercentage'] == null) {
      fuelPercentage = null;
    } else {
          fuelPercentage = json['fuelPercentage'];
    }
    if (json['changedAtMs'] == null) {
      changedAtMs = null;
    } else {
          changedAtMs = json['changedAtMs'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'fuelPercentage': fuelPercentage,
      'changedAtMs': changedAtMs
    };
  }

  static List<AssetReeferResponseReeferStatsFuelPercentage> listFromJson(List<dynamic> json) {
    return json == null ? new List<AssetReeferResponseReeferStatsFuelPercentage>() : json.map((value) => new AssetReeferResponseReeferStatsFuelPercentage.fromJson(value)).toList();
  }

  static Map<String, AssetReeferResponseReeferStatsFuelPercentage> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, AssetReeferResponseReeferStatsFuelPercentage>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new AssetReeferResponseReeferStatsFuelPercentage.fromJson(value));
    }
    return map;
  }
}

