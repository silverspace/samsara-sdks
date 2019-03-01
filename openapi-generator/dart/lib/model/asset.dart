part of openapi.api;

class Asset {
  /* Serial number of the host asset */
  String assetSerialNumber = null;
  /* The cable connected to the asset */
  List<AssetCable> cable = [];
  /* Engine hours */
  int engineHours = null;
  /* Asset ID */
  int id = null;
  /* Asset name */
  String name = null;
  Asset();

  @override
  String toString() {
    return 'Asset[assetSerialNumber=$assetSerialNumber, cable=$cable, engineHours=$engineHours, id=$id, name=$name, ]';
  }

  Asset.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['assetSerialNumber'] == null) {
      assetSerialNumber = null;
    } else {
          assetSerialNumber = json['assetSerialNumber'];
    }
    if (json['cable'] == null) {
      cable = null;
    } else {
      cable = AssetCable.listFromJson(json['cable']);
    }
    if (json['engineHours'] == null) {
      engineHours = null;
    } else {
          engineHours = json['engineHours'];
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
  }

  Map<String, dynamic> toJson() {
    return {
      'assetSerialNumber': assetSerialNumber,
      'cable': cable,
      'engineHours': engineHours,
      'id': id,
      'name': name
    };
  }

  static List<Asset> listFromJson(List<dynamic> json) {
    return json == null ? new List<Asset>() : json.map((value) => new Asset.fromJson(value)).toList();
  }

  static Map<String, Asset> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, Asset>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new Asset.fromJson(value));
    }
    return map;
  }
}

