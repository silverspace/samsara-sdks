import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'cargo_response_sensors.jser.dart';

class CargoResponseSensors {
   /* Flag indicating whether the current cargo is empty or loaded. */
  @Alias('cargoEmpty')
  final bool cargoEmpty;
   /* Name of the sensor. */
  @Alias('name')
  final String name;
   /* ID of the sensor. */
  @Alias('id')
  final int id;
  

  CargoResponseSensors(
      

{
     this.cargoEmpty = null,  
     this.name = null,  
     this.id = null 
    
    }
  );

  @override
  String toString() {
    return 'CargoResponseSensors[cargoEmpty=$cargoEmpty, name=$name, id=$id, ]';
  }
}

@GenSerializer(nullableFields: true)
class CargoResponseSensorsSerializer extends Serializer<CargoResponseSensors> with _$CargoResponseSensorsSerializer {

}
