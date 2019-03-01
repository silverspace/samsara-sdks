part of openapi.api;

class HosLogsSummaryResponse {
  
  List<HosLogsSummaryResponseDrivers> drivers = [];
  HosLogsSummaryResponse();

  @override
  String toString() {
    return 'HosLogsSummaryResponse[drivers=$drivers, ]';
  }

  HosLogsSummaryResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['drivers'] == null) {
      drivers = null;
    } else {
      drivers = HosLogsSummaryResponseDrivers.listFromJson(json['drivers']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'drivers': drivers
    };
  }

  static List<HosLogsSummaryResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<HosLogsSummaryResponse>() : json.map((value) => new HosLogsSummaryResponse.fromJson(value)).toList();
  }

  static Map<String, HosLogsSummaryResponse> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, HosLogsSummaryResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new HosLogsSummaryResponse.fromJson(value));
    }
    return map;
  }
}

