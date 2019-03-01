import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'humidity_response_sensors.jser.dart';

class HumidityResponseSensors {
   /* Name of the sensor. */
  @Alias('name')
  final String name;
   /* Currently reported relative humidity in percent, from 0-100. */
  @Alias('humidity')
  final int humidity;
   /* ID of the sensor. */
  @Alias('id')
  final int id;
  

  HumidityResponseSensors(
      

{
     this.name = null,  
     this.humidity = null,  
     this.id = null 
    
    }
  );

  @override
  String toString() {
    return 'HumidityResponseSensors[name=$name, humidity=$humidity, id=$id, ]';
  }
}

@GenSerializer(nullableFields: true)
class HumidityResponseSensorsSerializer extends Serializer<HumidityResponseSensors> with _$HumidityResponseSensorsSerializer {

}
