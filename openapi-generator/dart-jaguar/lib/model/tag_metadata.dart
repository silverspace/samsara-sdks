import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'tag_metadata.jser.dart';

class TagMetadata {
   /* The ID of this tag. */
  @Alias('id')
  final int id;
   /* Name of this tag. */
  @Alias('name')
  final String name;
  

  TagMetadata(
      

{
    
     this.id = null,  
     this.name = null 
    }
  );

  @override
  String toString() {
    return 'TagMetadata[id=$id, name=$name, ]';
  }
}

@GenSerializer(nullableFields: true)
class TagMetadataSerializer extends Serializer<TagMetadata> with _$TagMetadataSerializer {

}
