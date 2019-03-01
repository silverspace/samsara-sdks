import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/tagged_vehicle_base.dart';
part 'tagged_vehicle.jser.dart';

class TaggedVehicle {
   /* The ID of the Vehicle being tagged. */
  @Alias('id')
  final int id;
   /* Name of the Vehicle being tagged. */
  @Alias('name')
  final String name;
  

  TaggedVehicle(
      

{
    
     this.id = null,   this.name = null 
    
    }
  );

  @override
  String toString() {
    return 'TaggedVehicle[id=$id, name=$name, ]';
  }
}

@GenSerializer(nullableFields: true)
class TaggedVehicleSerializer extends Serializer<TaggedVehicle> with _$TaggedVehicleSerializer {

}
