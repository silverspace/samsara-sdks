import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'tagged_driver_base.jser.dart';

class TaggedDriverBase {
   /* The ID of the Driver being tagged. */
  @Alias('id')
  final int id;
  

  TaggedDriverBase(
      

{
    
     this.id = null 
    }
  );

  @override
  String toString() {
    return 'TaggedDriverBase[id=$id, ]';
  }
}

@GenSerializer(nullableFields: true)
class TaggedDriverBaseSerializer extends Serializer<TaggedDriverBase> with _$TaggedDriverBaseSerializer {

}
