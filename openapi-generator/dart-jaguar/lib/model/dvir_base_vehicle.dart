import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'dvir_base_vehicle.jser.dart';

class DvirBaseVehicle {
   /* The vehicle on which DVIR was done. */
  @Alias('name')
  final String name;
   /* The vehicle id on which DVIR was done. */
  @Alias('id')
  final int id;
  

  DvirBaseVehicle(
      

{
     this.name = null,  
     this.id = null 
    
    }
  );

  @override
  String toString() {
    return 'DvirBaseVehicle[name=$name, id=$id, ]';
  }
}

@GenSerializer(nullableFields: true)
class DvirBaseVehicleSerializer extends Serializer<DvirBaseVehicle> with _$DvirBaseVehicleSerializer {

}
