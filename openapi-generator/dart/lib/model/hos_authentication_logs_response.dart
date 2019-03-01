part of openapi.api;

class HosAuthenticationLogsResponse {
  
  List<HosAuthenticationLogsResponseAuthenticationLogs> authenticationLogs = [];
  HosAuthenticationLogsResponse();

  @override
  String toString() {
    return 'HosAuthenticationLogsResponse[authenticationLogs=$authenticationLogs, ]';
  }

  HosAuthenticationLogsResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['authenticationLogs'] == null) {
      authenticationLogs = null;
    } else {
      authenticationLogs = HosAuthenticationLogsResponseAuthenticationLogs.listFromJson(json['authenticationLogs']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'authenticationLogs': authenticationLogs
    };
  }

  static List<HosAuthenticationLogsResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<HosAuthenticationLogsResponse>() : json.map((value) => new HosAuthenticationLogsResponse.fromJson(value)).toList();
  }

  static Map<String, HosAuthenticationLogsResponse> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, HosAuthenticationLogsResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new HosAuthenticationLogsResponse.fromJson(value));
    }
    return map;
  }
}

