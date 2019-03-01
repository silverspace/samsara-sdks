part of openapi.api;

class Document {
  /* ID of the Samsara dispatch job for which the document is submitted */
  int dispatchJobId = null;
  /* Notes submitted with this document. */
  String notes = null;
  /* Descriptive name of this type of document. */
  String documentType = null;
  /* The time in Unix epoch milliseconds that the document is created. */
  int driverCreatedAtMs = null;
  /* ID of the driver for whom the document is submitted */
  int driverId = null;
  /* The fields associated with this document. */
  List<DocumentField> fields = [];
  /* VehicleID of the driver at document creation. */
  int vehicleId = null;
  Document();

  @override
  String toString() {
    return 'Document[dispatchJobId=$dispatchJobId, notes=$notes, documentType=$documentType, driverCreatedAtMs=$driverCreatedAtMs, driverId=$driverId, fields=$fields, vehicleId=$vehicleId, ]';
  }

  Document.fromJson(Map<String, dynamic> json) {
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
    if (json['documentType'] == null) {
      documentType = null;
    } else {
          documentType = json['documentType'];
    }
    if (json['driverCreatedAtMs'] == null) {
      driverCreatedAtMs = null;
    } else {
          driverCreatedAtMs = json['driverCreatedAtMs'];
    }
    if (json['driverId'] == null) {
      driverId = null;
    } else {
          driverId = json['driverId'];
    }
    if (json['fields'] == null) {
      fields = null;
    } else {
      fields = DocumentField.listFromJson(json['fields']);
    }
    if (json['vehicleId'] == null) {
      vehicleId = null;
    } else {
          vehicleId = json['vehicleId'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'dispatchJobId': dispatchJobId,
      'notes': notes,
      'documentType': documentType,
      'driverCreatedAtMs': driverCreatedAtMs,
      'driverId': driverId,
      'fields': fields,
      'vehicleId': vehicleId
    };
  }

  static List<Document> listFromJson(List<dynamic> json) {
    return json == null ? new List<Document>() : json.map((value) => new Document.fromJson(value)).toList();
  }

  static Map<String, Document> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, Document>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new Document.fromJson(value));
    }
    return map;
  }
}

