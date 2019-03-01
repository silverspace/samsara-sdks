import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/tagged_machine_base.dart';
part 'tagged_machine.jser.dart';

class TaggedMachine {
   /* The ID of the Machine being tagged. */
  @Alias('id')
  final int id;
   /* Name of the Machine being tagged. */
  @Alias('name')
  final String name;
  

  TaggedMachine(
      

{
    
     this.id = null,   this.name = null 
    
    }
  );

  @override
  String toString() {
    return 'TaggedMachine[id=$id, name=$name, ]';
  }
}

@GenSerializer(nullableFields: true)
class TaggedMachineSerializer extends Serializer<TaggedMachine> with _$TaggedMachineSerializer {

}
