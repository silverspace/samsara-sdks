part of openapi.api;

class InlineResponse2001 {
  
  List<AssetCurrentLocationsResponse> assets = [];
  InlineResponse2001();

  @override
  String toString() {
    return 'InlineResponse2001[assets=$assets, ]';
  }

  InlineResponse2001.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['assets'] == null) {
      assets = null;
    } else {
      assets = AssetCurrentLocationsResponse.listFromJson(json['assets']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'assets': assets
    };
  }

  static List<InlineResponse2001> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineResponse2001>() : json.map((value) => new InlineResponse2001.fromJson(value)).toList();
  }

  static Map<String, InlineResponse2001> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineResponse2001>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineResponse2001.fromJson(value));
    }
    return map;
  }
}

