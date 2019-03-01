import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/document_field_type_number_value_type_metadata.dart';
part 'document_field_type.jser.dart';

class DocumentFieldType {
   /* Descriptive name of this field type. */
  @Alias('label')
  final String label;
  
  @Alias('numberValueTypeMetadata')
  final DocumentFieldTypeNumberValueTypeMetadata numberValueTypeMetadata;
   /* The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo. */
  @Alias('valueType')
  final String valueType;
  

  DocumentFieldType(
      

{
    
     this.label = null,   this.numberValueTypeMetadata = null,  
    
     this.valueType = null 
    }
  );

  @override
  String toString() {
    return 'DocumentFieldType[label=$label, numberValueTypeMetadata=$numberValueTypeMetadata, valueType=$valueType, ]';
  }
}

@GenSerializer(nullableFields: true)
class DocumentFieldTypeSerializer extends Serializer<DocumentFieldType> with _$DocumentFieldTypeSerializer {

}
