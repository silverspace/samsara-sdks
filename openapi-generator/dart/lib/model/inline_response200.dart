part of openapi.api;

class InlineResponse200 {
  
  List<Asset> assets = [];
  InlineResponse200();

  @override
  String toString() {
    return 'InlineResponse200[assets=$assets, ]';
  }

  InlineResponse200.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['assets'] == null) {
      assets = null;
    } else {
      assets = Asset.listFromJson(json['assets']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'assets': assets
    };
  }

  static List<InlineResponse200> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineResponse200>() : json.map((value) => new InlineResponse200.fromJson(value)).toList();
  }

  static Map<String, InlineResponse200> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineResponse200>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineResponse200.fromJson(value));
    }
    return map;
  }
}

