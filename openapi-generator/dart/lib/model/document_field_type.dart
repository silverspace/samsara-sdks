part of openapi.api;

class DocumentFieldType {
  /* Descriptive name of this field type. */
  String label = null;
  
  DocumentFieldTypeNumberValueTypeMetadata numberValueTypeMetadata = null;
  /* The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo. */
  String valueType = null;
  DocumentFieldType();

  @override
  String toString() {
    return 'DocumentFieldType[label=$label, numberValueTypeMetadata=$numberValueTypeMetadata, valueType=$valueType, ]';
  }

  DocumentFieldType.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['label'] == null) {
      label = null;
    } else {
          label = json['label'];
    }
    if (json['numberValueTypeMetadata'] == null) {
      numberValueTypeMetadata = null;
    } else {
      numberValueTypeMetadata = new DocumentFieldTypeNumberValueTypeMetadata.fromJson(json['numberValueTypeMetadata']);
    }
    if (json['valueType'] == null) {
      valueType = null;
    } else {
          valueType = json['valueType'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'label': label,
      'numberValueTypeMetadata': numberValueTypeMetadata,
      'valueType': valueType
    };
  }

  static List<DocumentFieldType> listFromJson(List<dynamic> json) {
    return json == null ? new List<DocumentFieldType>() : json.map((value) => new DocumentFieldType.fromJson(value)).toList();
  }

  static Map<String, DocumentFieldType> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DocumentFieldType>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DocumentFieldType.fromJson(value));
    }
    return map;
  }
}

