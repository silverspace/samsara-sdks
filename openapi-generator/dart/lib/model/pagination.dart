part of openapi.api;

class Pagination {
  /* Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request's 'starting_after' query parameter. */
  String endCursor = null;
  /* True if there are more pages of results after this response. */
  bool hasNextPage = null;
  /* True if there are more pages of results before this response. */
  bool hasPrevPage = null;
  /* Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request's 'ending_before' query parameter. */
  String startCursor = null;
  Pagination();

  @override
  String toString() {
    return 'Pagination[endCursor=$endCursor, hasNextPage=$hasNextPage, hasPrevPage=$hasPrevPage, startCursor=$startCursor, ]';
  }

  Pagination.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['endCursor'] == null) {
      endCursor = null;
    } else {
          endCursor = json['endCursor'];
    }
    if (json['hasNextPage'] == null) {
      hasNextPage = null;
    } else {
          hasNextPage = json['hasNextPage'];
    }
    if (json['hasPrevPage'] == null) {
      hasPrevPage = null;
    } else {
          hasPrevPage = json['hasPrevPage'];
    }
    if (json['startCursor'] == null) {
      startCursor = null;
    } else {
          startCursor = json['startCursor'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'endCursor': endCursor,
      'hasNextPage': hasNextPage,
      'hasPrevPage': hasPrevPage,
      'startCursor': startCursor
    };
  }

  static List<Pagination> listFromJson(List<dynamic> json) {
    return json == null ? new List<Pagination>() : json.map((value) => new Pagination.fromJson(value)).toList();
  }

  static Map<String, Pagination> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, Pagination>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new Pagination.fromJson(value));
    }
    return map;
  }
}

