part of openapi.api;

class InlineResponse2009 {
  
  List<Tag> tags = [];
  InlineResponse2009();

  @override
  String toString() {
    return 'InlineResponse2009[tags=$tags, ]';
  }

  InlineResponse2009.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['tags'] == null) {
      tags = null;
    } else {
      tags = Tag.listFromJson(json['tags']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'tags': tags
    };
  }

  static List<InlineResponse2009> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineResponse2009>() : json.map((value) => new InlineResponse2009.fromJson(value)).toList();
  }

  static Map<String, InlineResponse2009> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineResponse2009>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineResponse2009.fromJson(value));
    }
    return map;
  }
}

