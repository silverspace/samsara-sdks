import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'sensor.jser.dart';

class Sensor {
   /* ID of the sensor. */
  @Alias('id')
  final int id;
   /* MAC address of the sensor. */
  @Alias('macAddress')
  final String macAddress;
   /* Name of the sensor. */
  @Alias('name')
  final String name;
  

  Sensor(
      

{
    
     this.id = null,   this.macAddress = null,  
     this.name = null 
    
    }
  );

  @override
  String toString() {
    return 'Sensor[id=$id, macAddress=$macAddress, name=$name, ]';
  }
}

@GenSerializer(nullableFields: true)
class SensorSerializer extends Serializer<Sensor> with _$SensorSerializer {

}
