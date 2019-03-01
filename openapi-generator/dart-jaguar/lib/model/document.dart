import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/document_field.dart';
import 'package:openapi/model/document_base.dart';
part 'document.jser.dart';

class Document {
   /* ID of the Samsara dispatch job for which the document is submitted */
  @Alias('dispatchJobId')
  final int dispatchJobId;
   /* Notes submitted with this document. */
  @Alias('notes')
  final String notes;
   /* Descriptive name of this type of document. */
  @Alias('documentType')
  final String documentType;
   /* The time in Unix epoch milliseconds that the document is created. */
  @Alias('driverCreatedAtMs')
  final int driverCreatedAtMs;
   /* ID of the driver for whom the document is submitted */
  @Alias('driverId')
  final int driverId;
   /* The fields associated with this document. */
  @Alias('fields')
  final List<DocumentField> fields;
   /* VehicleID of the driver at document creation. */
  @Alias('vehicleId')
  final int vehicleId;
  

  Document(
      

{
     this.dispatchJobId = null,  
     this.notes = null,  
    
     this.documentType = null,  
     this.driverCreatedAtMs = null,  
     this.driverId = null,  
     this.fields = const [],   this.vehicleId = null 
    
    }
  );

  @override
  String toString() {
    return 'Document[dispatchJobId=$dispatchJobId, notes=$notes, documentType=$documentType, driverCreatedAtMs=$driverCreatedAtMs, driverId=$driverId, fields=$fields, vehicleId=$vehicleId, ]';
  }
}

@GenSerializer(nullableFields: true)
class DocumentSerializer extends Serializer<Document> with _$DocumentSerializer {

}
