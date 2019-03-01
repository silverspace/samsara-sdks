import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'tagged_machine_base.jser.dart';

class TaggedMachineBase {
   /* The ID of the Machine being tagged. */
  @Alias('id')
  final int id;
  

  TaggedMachineBase(
      

{
    
     this.id = null 
    }
  );

  @override
  String toString() {
    return 'TaggedMachineBase[id=$id, ]';
  }
}

@GenSerializer(nullableFields: true)
class TaggedMachineBaseSerializer extends Serializer<TaggedMachineBase> with _$TaggedMachineBaseSerializer {

}
