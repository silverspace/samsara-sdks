import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'document_field_type_number_value_type_metadata.jser.dart';

class DocumentFieldTypeNumberValueTypeMetadata {
   /* Number of decimal places that values for this field type can have. */
  @Alias('numDecimalPlaces')
  final int numDecimalPlaces;
  

  DocumentFieldTypeNumberValueTypeMetadata(
      

{
     this.numDecimalPlaces = null 
    
    }
  );

  @override
  String toString() {
    return 'DocumentFieldTypeNumberValueTypeMetadata[numDecimalPlaces=$numDecimalPlaces, ]';
  }
}

@GenSerializer(nullableFields: true)
class DocumentFieldTypeNumberValueTypeMetadataSerializer extends Serializer<DocumentFieldTypeNumberValueTypeMetadata> with _$DocumentFieldTypeNumberValueTypeMetadataSerializer {

}
