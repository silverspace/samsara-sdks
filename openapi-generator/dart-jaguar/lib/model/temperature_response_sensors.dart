import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'temperature_response_sensors.jser.dart';

class TemperatureResponseSensors {
   /* Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported. */
  @Alias('probeTemperature')
  final int probeTemperature;
   /* Name of the sensor. */
  @Alias('name')
  final String name;
   /* ID of the sensor. */
  @Alias('id')
  final int id;
   /* Currently reported ambient temperature in millidegrees celsius. */
  @Alias('ambientTemperature')
  final int ambientTemperature;
  

  TemperatureResponseSensors(
      

{
     this.probeTemperature = null,  
     this.name = null,  
     this.id = null,  
     this.ambientTemperature = null 
    
    }
  );

  @override
  String toString() {
    return 'TemperatureResponseSensors[probeTemperature=$probeTemperature, name=$name, id=$id, ambientTemperature=$ambientTemperature, ]';
  }
}

@GenSerializer(nullableFields: true)
class TemperatureResponseSensorsSerializer extends Serializer<TemperatureResponseSensors> with _$TemperatureResponseSensorsSerializer {

}
