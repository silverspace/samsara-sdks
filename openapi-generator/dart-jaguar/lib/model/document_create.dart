import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/document_field.dart';
import 'package:openapi/model/document_base.dart';
part 'document_create.jser.dart';

class DocumentCreate {
   /* ID of the Samsara dispatch job for which the document is submitted */
  @Alias('dispatchJobId')
  final int dispatchJobId;
   /* Notes submitted with this document. */
  @Alias('notes')
  final String notes;
   /* Universally unique identifier for the document type this document is being created for. */
  @Alias('documentTypeUuid')
  final String documentTypeUuid;
   /* List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. */
  @Alias('fields')
  final List<DocumentField> fields;
  

  DocumentCreate(
      

{
     this.dispatchJobId = null,  
     this.notes = null,  
    
     this.documentTypeUuid = null,  
     this.fields = const [] 
    }
  );

  @override
  String toString() {
    return 'DocumentCreate[dispatchJobId=$dispatchJobId, notes=$notes, documentTypeUuid=$documentTypeUuid, fields=$fields, ]';
  }
}

@GenSerializer(nullableFields: true)
class DocumentCreateSerializer extends Serializer<DocumentCreate> with _$DocumentCreateSerializer {

}
