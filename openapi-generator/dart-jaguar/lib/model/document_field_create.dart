import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/document_field_create_photo_value.dart';
part 'document_field_create.jser.dart';

class DocumentFieldCreate {
   /* Value of this field if this document field has valueType: ValueType_Number. */
  @Alias('numberValue')
  final double numberValue;
   /* Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo. */
  @Alias('photoValue')
  final List<DocumentFieldCreatePhotoValue> photoValue;
   /* Value of this field if this document field has valueType: ValueType_String. */
  @Alias('stringValue')
  final String stringValue;
   /* Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo. */
  @Alias('valueType')
  final String valueType;
  

  DocumentFieldCreate(
      

{
     this.numberValue = null,  
     this.photoValue = const [],  
     this.stringValue = null,  
    
     this.valueType = null 
    }
  );

  @override
  String toString() {
    return 'DocumentFieldCreate[numberValue=$numberValue, photoValue=$photoValue, stringValue=$stringValue, valueType=$valueType, ]';
  }
}

@GenSerializer(nullableFields: true)
class DocumentFieldCreateSerializer extends Serializer<DocumentFieldCreate> with _$DocumentFieldCreateSerializer {

}
