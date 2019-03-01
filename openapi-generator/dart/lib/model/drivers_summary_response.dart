part of openapi.api;

class DriversSummaryResponse {
  
  List<DriversSummaryResponseSummaries> summaries = [];
  DriversSummaryResponse();

  @override
  String toString() {
    return 'DriversSummaryResponse[summaries=$summaries, ]';
  }

  DriversSummaryResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['Summaries'] == null) {
      summaries = null;
    } else {
      summaries = DriversSummaryResponseSummaries.listFromJson(json['Summaries']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'Summaries': summaries
    };
  }

  static List<DriversSummaryResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<DriversSummaryResponse>() : json.map((value) => new DriversSummaryResponse.fromJson(value)).toList();
  }

  static Map<String, DriversSummaryResponse> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DriversSummaryResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DriversSummaryResponse.fromJson(value));
    }
    return map;
  }
}

