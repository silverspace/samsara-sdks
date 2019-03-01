import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/document_field_type.dart';
part 'document_type.jser.dart';

class DocumentType {
   /* The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have. */
  @Alias('fieldTypes')
  final List<List> fieldTypes;
   /* Name of the document type. */
  @Alias('name')
  final String name;
   /* ID for the organization this document belongs to. */
  @Alias('orgId')
  final int orgId;
   /* Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type. */
  @Alias('uuid')
  final String uuid;
  

  DocumentType(
      

{
     this.fieldTypes = const [],  
    
     this.name = null,  
     this.orgId = null,  
     this.uuid = null 
    }
  );

  @override
  String toString() {
    return 'DocumentType[fieldTypes=$fieldTypes, name=$name, orgId=$orgId, uuid=$uuid, ]';
  }
}

@GenSerializer(nullableFields: true)
class DocumentTypeSerializer extends Serializer<DocumentType> with _$DocumentTypeSerializer {

}
