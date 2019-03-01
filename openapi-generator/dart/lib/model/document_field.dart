part of openapi.api;

class DocumentField {
  /* Value of this field if this document field has valueType: ValueType_Number. */
  double numberValue = null;
  /* Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo. */
  List<DocumentFieldCreatePhotoValue> photoValue = [];
  /* Value of this field if this document field has valueType: ValueType_String. */
  String stringValue = null;
  /* Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo. */
  String valueType = null;
  /* Descriptive name of this field. */
  String label = null;
  /* DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string. */
  Object value = null;
  DocumentField();

  @override
  String toString() {
    return 'DocumentField[numberValue=$numberValue, photoValue=$photoValue, stringValue=$stringValue, valueType=$valueType, label=$label, value=$value, ]';
  }

  DocumentField.fromJson(Map<String, dynamic> json) {
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
    if (json['label'] == null) {
      label = null;
    } else {
          label = json['label'];
    }
    if (json['value'] == null) {
      value = null;
    } else {
          value = json['value'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'numberValue': numberValue,
      'photoValue': photoValue,
      'stringValue': stringValue,
      'valueType': valueType,
      'label': label,
      'value': value
    };
  }

  static List<DocumentField> listFromJson(List<dynamic> json) {
    return json == null ? new List<DocumentField>() : json.map((value) => new DocumentField.fromJson(value)).toList();
  }

  static Map<String, DocumentField> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DocumentField>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DocumentField.fromJson(value));
    }
    return map;
  }
}

