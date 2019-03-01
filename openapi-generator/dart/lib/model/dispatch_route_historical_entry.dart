part of openapi.api;

class DispatchRouteHistoricalEntry {
  /* Timestamp that the route was updated, represented as Unix milliseconds since epoch. */
  int changedAtMs = null;
  
  DispatchRoute route = null;
  DispatchRouteHistoricalEntry();

  @override
  String toString() {
    return 'DispatchRouteHistoricalEntry[changedAtMs=$changedAtMs, route=$route, ]';
  }

  DispatchRouteHistoricalEntry.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['changed_at_ms'] == null) {
      changedAtMs = null;
    } else {
          changedAtMs = json['changed_at_ms'];
    }
    if (json['route'] == null) {
      route = null;
    } else {
      route = new DispatchRoute.fromJson(json['route']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'changed_at_ms': changedAtMs,
      'route': route
    };
  }

  static List<DispatchRouteHistoricalEntry> listFromJson(List<dynamic> json) {
    return json == null ? new List<DispatchRouteHistoricalEntry>() : json.map((value) => new DispatchRouteHistoricalEntry.fromJson(value)).toList();
  }

  static Map<String, DispatchRouteHistoricalEntry> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DispatchRouteHistoricalEntry>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DispatchRouteHistoricalEntry.fromJson(value));
    }
    return map;
  }
}

