part of openapi.api;

class AssetCable {
  /* Asset type */
  String assetType = null;
  AssetCable();

  @override
  String toString() {
    return 'AssetCable[assetType=$assetType, ]';
  }

  AssetCable.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['assetType'] == null) {
      assetType = null;
    } else {
          assetType = json['assetType'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'assetType': assetType
    };
  }

  static List<AssetCable> listFromJson(List<dynamic> json) {
    return json == null ? new List<AssetCable>() : json.map((value) => new AssetCable.fromJson(value)).toList();
  }

  static Map<String, AssetCable> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, AssetCable>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new AssetCable.fromJson(value));
    }
    return map;
  }
}

