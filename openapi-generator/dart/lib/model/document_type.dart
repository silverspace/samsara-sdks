part of openapi.api;

class DocumentType {
  /* The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have. */
  List<List> fieldTypes = [];
  /* Name of the document type. */
  String name = null;
  /* ID for the organization this document belongs to. */
  int orgId = null;
  /* Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type. */
  String uuid = null;
  DocumentType();

  @override
  String toString() {
    return 'DocumentType[fieldTypes=$fieldTypes, name=$name, orgId=$orgId, uuid=$uuid, ]';
  }

  DocumentType.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['fieldTypes'] == null) {
      fieldTypes = null;
    } else {
      fieldTypes = List.listFromJson(json['fieldTypes']);
    }
    if (json['name'] == null) {
      name = null;
    } else {
          name = json['name'];
    }
    if (json['orgId'] == null) {
      orgId = null;
    } else {
          orgId = json['orgId'];
    }
    if (json['uuid'] == null) {
      uuid = null;
    } else {
          uuid = json['uuid'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'fieldTypes': fieldTypes,
      'name': name,
      'orgId': orgId,
      'uuid': uuid
    };
  }

  static List<DocumentType> listFromJson(List<dynamic> json) {
    return json == null ? new List<DocumentType>() : json.map((value) => new DocumentType.fromJson(value)).toList();
  }

  static Map<String, DocumentType> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DocumentType>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DocumentType.fromJson(value));
    }
    return map;
  }
}

