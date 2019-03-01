part of openapi.api;

class AssetReeferResponse {
  /* Asset type */
  String assetType = null;
  /* Asset ID */
  int id = null;
  /* Asset name */
  String name = null;
  
  AssetReeferResponseReeferStats reeferStats = null;
  AssetReeferResponse();

  @override
  String toString() {
    return 'AssetReeferResponse[assetType=$assetType, id=$id, name=$name, reeferStats=$reeferStats, ]';
  }

  AssetReeferResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['assetType'] == null) {
      assetType = null;
    } else {
          assetType = json['assetType'];
    }
    if (json['id'] == null) {
      id = null;
    } else {
          id = json['id'];
    }
    if (json['name'] == null) {
      name = null;
    } else {
          name = json['name'];
    }
    if (json['reeferStats'] == null) {
      reeferStats = null;
    } else {
      reeferStats = new AssetReeferResponseReeferStats.fromJson(json['reeferStats']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'assetType': assetType,
      'id': id,
      'name': name,
      'reeferStats': reeferStats
    };
  }

  static List<AssetReeferResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<AssetReeferResponse>() : json.map((value) => new AssetReeferResponse.fromJson(value)).toList();
  }

  static Map<String, AssetReeferResponse> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, AssetReeferResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new AssetReeferResponse.fromJson(value));
    }
    return map;
  }
}

