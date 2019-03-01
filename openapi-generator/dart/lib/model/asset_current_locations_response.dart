part of openapi.api;

class AssetCurrentLocationsResponse {
  /* The cable connected to the asset */
  List<AssetCable> cable = [];
  /* Engine hours */
  int engineHours = null;
  /* Asset ID */
  int id = null;
  /* Current location of an asset */
  List<AssetCurrentLocation> location = [];
  /* Asset name */
  String name = null;
  AssetCurrentLocationsResponse();

  @override
  String toString() {
    return 'AssetCurrentLocationsResponse[cable=$cable, engineHours=$engineHours, id=$id, location=$location, name=$name, ]';
  }

  AssetCurrentLocationsResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
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
    if (json['location'] == null) {
      location = null;
    } else {
      location = AssetCurrentLocation.listFromJson(json['location']);
    }
    if (json['name'] == null) {
      name = null;
    } else {
          name = json['name'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'cable': cable,
      'engineHours': engineHours,
      'id': id,
      'location': location,
      'name': name
    };
  }

  static List<AssetCurrentLocationsResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<AssetCurrentLocationsResponse>() : json.map((value) => new AssetCurrentLocationsResponse.fromJson(value)).toList();
  }

  static Map<String, AssetCurrentLocationsResponse> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, AssetCurrentLocationsResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new AssetCurrentLocationsResponse.fromJson(value));
    }
    return map;
  }
}

