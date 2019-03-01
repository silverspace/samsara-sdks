part of openapi.api;

class AddressGeofencePolygon {
  /* The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40. */
  List<AddressGeofencePolygonVertices> vertices = [];
  AddressGeofencePolygon();

  @override
  String toString() {
    return 'AddressGeofencePolygon[vertices=$vertices, ]';
  }

  AddressGeofencePolygon.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['vertices'] == null) {
      vertices = null;
    } else {
      vertices = AddressGeofencePolygonVertices.listFromJson(json['vertices']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'vertices': vertices
    };
  }

  static List<AddressGeofencePolygon> listFromJson(List<dynamic> json) {
    return json == null ? new List<AddressGeofencePolygon>() : json.map((value) => new AddressGeofencePolygon.fromJson(value)).toList();
  }

  static Map<String, AddressGeofencePolygon> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, AddressGeofencePolygon>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new AddressGeofencePolygon.fromJson(value));
    }
    return map;
  }
}

