import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/tagged_address_base.dart';
part 'tagged_address.jser.dart';

class TaggedAddress {
   /* The ID of the address being tagged. */
  @Alias('id')
  final int id;
   /* Name of the address being tagged. */
  @Alias('name')
  final String name;
  

  TaggedAddress(
      

{
    
     this.id = null,   this.name = null 
    
    }
  );

  @override
  String toString() {
    return 'TaggedAddress[id=$id, name=$name, ]';
  }
}

@GenSerializer(nullableFields: true)
class TaggedAddressSerializer extends Serializer<TaggedAddress> with _$TaggedAddressSerializer {

}
