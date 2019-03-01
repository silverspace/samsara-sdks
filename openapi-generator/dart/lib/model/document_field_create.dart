part of openapi.api;

class DocumentFieldCreate {
  /* Value of this field if this document field has valueType: ValueType_Number. */
  double numberValue = null;
  /* Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo. */
  List<DocumentFieldCreatePhotoValue> photoValue = [];
  /* Value of this field if this document field has valueType: ValueType_String. */
  String stringValue = null;
  /* Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo. */
  String valueType = null;
  DocumentFieldCreate();

  @override
  String toString() {
    return 'DocumentFieldCreate[numberValue=$numberValue, photoValue=$photoValue, stringValue=$stringValue, valueType=$valueType, ]';
  }

  DocumentFieldCreate.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['numberValue'] == null) {
      numberValue = null;
    } else {
          numberValue = json['numberValue'];
    }
    if (json['photoValue'] == null) {
      photoValue = null;
    } else {
      photoValue = DocumentFieldCreatePhotoValue.listFromJson(json['photoValue']);
    }
    if (json['stringValue'] == null) {
      stringValue = null;
    } else {
          stringValue = json['stringValue'];
    }
    if (json['valueType'] == null) {
      valueType = null;
    } else {
          valueType = json['valueType'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'numberValue': numberValue,
      'photoValue': photoValue,
      'stringValue': stringValue,
      'valueType': valueType
    };
  }

  static List<DocumentFieldCreate> listFromJson(List<dynamic> json) {
    return json == null ? new List<DocumentFieldCreate>() : json.map((value) => new DocumentFieldCreate.fromJson(value)).toList();
  }

  static Map<String, DocumentFieldCreate> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DocumentFieldCreate>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DocumentFieldCreate.fromJson(value));
    }
    return map;
  }
}

