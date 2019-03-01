import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/tagged_driver_base.dart';
part 'tagged_driver.jser.dart';

class TaggedDriver {
   /* The ID of the Driver being tagged. */
  @Alias('id')
  final int id;
   /* Name of the Driver being tagged. */
  @Alias('name')
  final String name;
  

  TaggedDriver(
      

{
    
     this.id = null,   this.name = null 
    
    }
  );

  @override
  String toString() {
    return 'TaggedDriver[id=$id, name=$name, ]';
  }
}

@GenSerializer(nullableFields: true)
class TaggedDriverSerializer extends Serializer<TaggedDriver> with _$TaggedDriverSerializer {

}
