import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'tagged_address_base.jser.dart';

class TaggedAddressBase {
   /* The ID of the address being tagged. */
  @Alias('id')
  final int id;
  

  TaggedAddressBase(
      

{
    
     this.id = null 
    }
  );

  @override
  String toString() {
    return 'TaggedAddressBase[id=$id, ]';
  }
}

@GenSerializer(nullableFields: true)
class TaggedAddressBaseSerializer extends Serializer<TaggedAddressBase> with _$TaggedAddressBaseSerializer {

}
