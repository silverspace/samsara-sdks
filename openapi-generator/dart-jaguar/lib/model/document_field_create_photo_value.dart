import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'document_field_create_photo_value.jser.dart';

class DocumentFieldCreatePhotoValue {
   /* Photo URL for a JPG image */
  @Alias('url')
  final String url;
  

  DocumentFieldCreatePhotoValue(
      

{
     this.url = null 
    
    }
  );

  @override
  String toString() {
    return 'DocumentFieldCreatePhotoValue[url=$url, ]';
  }
}

@GenSerializer(nullableFields: true)
class DocumentFieldCreatePhotoValueSerializer extends Serializer<DocumentFieldCreatePhotoValue> with _$DocumentFieldCreatePhotoValueSerializer {

}
