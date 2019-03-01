part of openapi.api;

class DocumentFieldTypeNumberValueTypeMetadata {
  /* Number of decimal places that values for this field type can have. */
  int numDecimalPlaces = null;
  DocumentFieldTypeNumberValueTypeMetadata();

  @override
  String toString() {
    return 'DocumentFieldTypeNumberValueTypeMetadata[numDecimalPlaces=$numDecimalPlaces, ]';
  }

  DocumentFieldTypeNumberValueTypeMetadata.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['numDecimalPlaces'] == null) {
      numDecimalPlaces = null;
    } else {
          numDecimalPlaces = json['numDecimalPlaces'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'numDecimalPlaces': numDecimalPlaces
    };
  }

  static List<DocumentFieldTypeNumberValueTypeMetadata> listFromJson(List<dynamic> json) {
    return json == null ? new List<DocumentFieldTypeNumberValueTypeMetadata>() : json.map((value) => new DocumentFieldTypeNumberValueTypeMetadata.fromJson(value)).toList();
  }

  static Map<String, DocumentFieldTypeNumberValueTypeMetadata> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DocumentFieldTypeNumberValueTypeMetadata>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DocumentFieldTypeNumberValueTypeMetadata.fromJson(value));
    }
    return map;
  }
}

