part of openapi.api;

class SensorHistoryResponse {
  
  List<SensorHistoryResponseResults> results = [];
  SensorHistoryResponse();

  @override
  String toString() {
    return 'SensorHistoryResponse[results=$results, ]';
  }

  SensorHistoryResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['results'] == null) {
      results = null;
    } else {
      results = SensorHistoryResponseResults.listFromJson(json['results']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'results': results
    };
  }

  static List<SensorHistoryResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<SensorHistoryResponse>() : json.map((value) => new SensorHistoryResponse.fromJson(value)).toList();
  }

  static Map<String, SensorHistoryResponse> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, SensorHistoryResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new SensorHistoryResponse.fromJson(value));
    }
    return map;
  }
}

