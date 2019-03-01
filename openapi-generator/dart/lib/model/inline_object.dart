part of openapi.api;

class InlineObject {
  
  List<AddressesAddresses> addresses = [];
  InlineObject();

  @override
  String toString() {
    return 'InlineObject[addresses=$addresses, ]';
  }

  InlineObject.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['addresses'] == null) {
      addresses = null;
    } else {
      addresses = AddressesAddresses.listFromJson(json['addresses']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'addresses': addresses
    };
  }

  static List<InlineObject> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject>() : json.map((value) => new InlineObject.fromJson(value)).toList();
  }

  static Map<String, InlineObject> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject.fromJson(value));
    }
    return map;
  }
}

