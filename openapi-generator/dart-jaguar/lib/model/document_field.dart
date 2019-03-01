import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/document_field_create_photo_value.dart';
import 'package:openapi/model/document_field_create.dart';
import 'package:openapi/model/object.dart';
part 'document_field.jser.dart';

class DocumentField {
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
   /* Descriptive name of this field. */
  @Alias('label')
  final String label;
   /* DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string. */
  @Alias('value')
  final Object value;
  

  DocumentField(
      

{
     this.numberValue = null,  
     this.photoValue = const [],  
     this.stringValue = null,  
    
     this.valueType = null,  
     this.label = null,   this.value = null 
    
    }
  );

  @override
  String toString() {
    return 'DocumentField[numberValue=$numberValue, photoValue=$photoValue, stringValue=$stringValue, valueType=$valueType, label=$label, value=$value, ]';
  }
}

@GenSerializer(nullableFields: true)
class DocumentFieldSerializer extends Serializer<DocumentField> with _$DocumentFieldSerializer {

}
