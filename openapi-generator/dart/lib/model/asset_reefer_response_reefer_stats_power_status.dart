part of openapi.api;

class AssetReeferResponseReeferStatsPowerStatus {
  /* Timestamp in Unix milliseconds since epoch. */
  int changedAtMs = null;
  /* Power status of the reefer. */
  String status = null;
  AssetReeferResponseReeferStatsPowerStatus();

  @override
  String toString() {
    return 'AssetReeferResponseReeferStatsPowerStatus[changedAtMs=$changedAtMs, status=$status, ]';
  }

  AssetReeferResponseReeferStatsPowerStatus.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['changedAtMs'] == null) {
      changedAtMs = null;
    } else {
          changedAtMs = json['changedAtMs'];
    }
    if (json['status'] == null) {
      status = null;
    } else {
          status = json['status'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'changedAtMs': changedAtMs,
      'status': status
    };
  }

  static List<AssetReeferResponseReeferStatsPowerStatus> listFromJson(List<dynamic> json) {
    return json == null ? new List<AssetReeferResponseReeferStatsPowerStatus>() : json.map((value) => new AssetReeferResponseReeferStatsPowerStatus.fromJson(value)).toList();
  }

  static Map<String, AssetReeferResponseReeferStatsPowerStatus> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, AssetReeferResponseReeferStatsPowerStatus>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new AssetReeferResponseReeferStatsPowerStatus.fromJson(value));
    }
    return map;
  }
}

