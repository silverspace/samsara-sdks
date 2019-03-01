part of openapi.api;

class DataInputHistoryResponse {
  /* The ID of this data input */
  int id = null;
  /* Name of this data input */
  String name = null;
  /* Data points from this data input */
  List<DataInputHistoryResponsePoints> points = [];
  DataInputHistoryResponse();

  @override
  String toString() {
    return 'DataInputHistoryResponse[id=$id, name=$name, points=$points, ]';
  }

  DataInputHistoryResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
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
    if (json['points'] == null) {
      points = null;
    } else {
      points = DataInputHistoryResponsePoints.listFromJson(json['points']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id,
      'name': name,
      'points': points
    };
  }

  static List<DataInputHistoryResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<DataInputHistoryResponse>() : json.map((value) => new DataInputHistoryResponse.fromJson(value)).toList();
  }

  static Map<String, DataInputHistoryResponse> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DataInputHistoryResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DataInputHistoryResponse.fromJson(value));
    }
    return map;
  }
}

