part of openapi.api;

class DocumentBase {
  /* ID of the Samsara dispatch job for which the document is submitted */
  int dispatchJobId = null;
  /* Notes submitted with this document. */
  String notes = null;
  DocumentBase();

  @override
  String toString() {
    return 'DocumentBase[dispatchJobId=$dispatchJobId, notes=$notes, ]';
  }

  DocumentBase.fromJson(Map<String, dynamic> json) {
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
  }

  Map<String, dynamic> toJson() {
    return {
      'dispatchJobId': dispatchJobId,
      'notes': notes
    };
  }

  static List<DocumentBase> listFromJson(List<dynamic> json) {
    return json == null ? new List<DocumentBase>() : json.map((value) => new DocumentBase.fromJson(value)).toList();
  }

  static Map<String, DocumentBase> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DocumentBase>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DocumentBase.fromJson(value));
    }
    return map;
  }
}

