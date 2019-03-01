part of openapi.api;

class DriverDailyLogResponse {
  
  List<DriverDailyLogResponseDays> days = [];
  DriverDailyLogResponse();

  @override
  String toString() {
    return 'DriverDailyLogResponse[days=$days, ]';
  }

  DriverDailyLogResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['days'] == null) {
      days = null;
    } else {
      days = DriverDailyLogResponseDays.listFromJson(json['days']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'days': days
    };
  }

  static List<DriverDailyLogResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<DriverDailyLogResponse>() : json.map((value) => new DriverDailyLogResponse.fromJson(value)).toList();
  }

  static Map<String, DriverDailyLogResponse> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DriverDailyLogResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DriverDailyLogResponse.fromJson(value));
    }
    return map;
  }
}

