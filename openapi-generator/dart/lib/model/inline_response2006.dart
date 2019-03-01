part of openapi.api;

class InlineResponse2006 {
  
  List<DataInputHistoryResponse> dataInputs = [];
  InlineResponse2006();

  @override
  String toString() {
    return 'InlineResponse2006[dataInputs=$dataInputs, ]';
  }

  InlineResponse2006.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['dataInputs'] == null) {
      dataInputs = null;
    } else {
      dataInputs = DataInputHistoryResponse.listFromJson(json['dataInputs']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'dataInputs': dataInputs
    };
  }

  static List<InlineResponse2006> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineResponse2006>() : json.map((value) => new InlineResponse2006.fromJson(value)).toList();
  }

  static Map<String, InlineResponse2006> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineResponse2006>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineResponse2006.fromJson(value));
    }
    return map;
  }
}

