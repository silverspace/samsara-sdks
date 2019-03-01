part of openapi.api;

class DispatchRouteHistory {
  /* History of the route's state changes. */
  List<DispatchRouteHistoricalEntry> history = [];
  DispatchRouteHistory();

  @override
  String toString() {
    return 'DispatchRouteHistory[history=$history, ]';
  }

  DispatchRouteHistory.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['history'] == null) {
      history = null;
    } else {
      history = DispatchRouteHistoricalEntry.listFromJson(json['history']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'history': history
    };
  }

  static List<DispatchRouteHistory> listFromJson(List<dynamic> json) {
    return json == null ? new List<DispatchRouteHistory>() : json.map((value) => new DispatchRouteHistory.fromJson(value)).toList();
  }

  static Map<String, DispatchRouteHistory> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DispatchRouteHistory>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DispatchRouteHistory.fromJson(value));
    }
    return map;
  }
}

