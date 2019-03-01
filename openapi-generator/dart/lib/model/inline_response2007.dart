part of openapi.api;

class InlineResponse2007 {
  
  List<Machine> machines = [];
  InlineResponse2007();

  @override
  String toString() {
    return 'InlineResponse2007[machines=$machines, ]';
  }

  InlineResponse2007.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['machines'] == null) {
      machines = null;
    } else {
      machines = Machine.listFromJson(json['machines']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'machines': machines
    };
  }

  static List<InlineResponse2007> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineResponse2007>() : json.map((value) => new InlineResponse2007.fromJson(value)).toList();
  }

  static Map<String, InlineResponse2007> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineResponse2007>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineResponse2007.fromJson(value));
    }
    return map;
  }
}

