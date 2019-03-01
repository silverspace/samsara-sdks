import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'tagged_vehicle_base.jser.dart';

class TaggedVehicleBase {
   /* The ID of the Vehicle being tagged. */
  @Alias('id')
  final int id;
  

  TaggedVehicleBase(
      

{
    
     this.id = null 
    }
  );

  @override
  String toString() {
    return 'TaggedVehicleBase[id=$id, ]';
  }
}

@GenSerializer(nullableFields: true)
class TaggedVehicleBaseSerializer extends Serializer<TaggedVehicleBase> with _$TaggedVehicleBaseSerializer {

}
