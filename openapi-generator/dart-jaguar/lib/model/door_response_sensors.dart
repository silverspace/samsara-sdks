import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'door_response_sensors.jser.dart';

class DoorResponseSensors {
   /* Flag indicating whether the current door is closed or open. */
  @Alias('doorClosed')
  final bool doorClosed;
   /* Name of the sensor. */
  @Alias('name')
  final String name;
   /* ID of the sensor. */
  @Alias('id')
  final int id;
  

  DoorResponseSensors(
      

{
     this.doorClosed = null,  
     this.name = null,  
     this.id = null 
    
    }
  );

  @override
  String toString() {
    return 'DoorResponseSensors[doorClosed=$doorClosed, name=$name, id=$id, ]';
  }
}

@GenSerializer(nullableFields: true)
class DoorResponseSensorsSerializer extends Serializer<DoorResponseSensors> with _$DoorResponseSensorsSerializer {

}
