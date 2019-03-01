part of openapi.api;

class HosLogsResponse {
  
  List<HosLogsResponseLogs> logs = [];
  HosLogsResponse();

  @override
  String toString() {
    return 'HosLogsResponse[logs=$logs, ]';
  }

  HosLogsResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['logs'] == null) {
      logs = null;
    } else {
      logs = HosLogsResponseLogs.listFromJson(json['logs']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'logs': logs
    };
  }

  static List<HosLogsResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<HosLogsResponse>() : json.map((value) => new HosLogsResponse.fromJson(value)).toList();
  }

  static Map<String, HosLogsResponse> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, HosLogsResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new HosLogsResponse.fromJson(value));
    }
    return map;
  }
}

