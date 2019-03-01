part of openapi.api;

class DocumentCreate {
  /* ID of the Samsara dispatch job for which the document is submitted */
  int dispatchJobId = null;
  /* Notes submitted with this document. */
  String notes = null;
  /* Universally unique identifier for the document type this document is being created for. */
  String documentTypeUuid = null;
  /* List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. */
  List<DocumentField> fields = [];
  DocumentCreate();

  @override
  String toString() {
    return 'DocumentCreate[dispatchJobId=$dispatchJobId, notes=$notes, documentTypeUuid=$documentTypeUuid, fields=$fields, ]';
  }

  DocumentCreate.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['dispatchJobId'] == null) {
      dispatchJobId = null;
    } else {
          dispatchJobId = json['dispatchJobId'];
    }
    if (json['notes'] == null) {
      notes = null;
    } else {
          notes = json['notes'];
    }
    if (json['documentTypeUuid'] == null) {
      documentTypeUuid = null;
    } else {
          documentTypeUuid = json['documentTypeUuid'];
    }
    if (json['fields'] == null) {
      fields = null;
    } else {
      fields = DocumentField.listFromJson(json['fields']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'dispatchJobId': dispatchJobId,
      'notes': notes,
      'documentTypeUuid': documentTypeUuid,
      'fields': fields
    };
  }

  static List<DocumentCreate> listFromJson(List<dynamic> json) {
    return json == null ? new List<DocumentCreate>() : json.map((value) => new DocumentCreate.fromJson(value)).toList();
  }

  static Map<String, DocumentCreate> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DocumentCreate>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DocumentCreate.fromJson(value));
    }
    return map;
  }
}

