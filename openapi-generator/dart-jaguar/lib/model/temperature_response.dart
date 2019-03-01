import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/temperature_response_sensors.dart';
part 'temperature_response.jser.dart';

class TemperatureResponse {
  
  @Alias('groupId')
  final int groupId;
  
  @Alias('sensors')
  final List<TemperatureResponseSensors> sensors;
  

  TemperatureResponse(
      

{
     this.groupId = null,  
     this.sensors = const [] 
    
    }
  );

  @override
  String toString() {
    return 'TemperatureResponse[groupId=$groupId, sensors=$sensors, ]';
  }
}

@GenSerializer(nullableFields: true)
class TemperatureResponseSerializer extends Serializer<TemperatureResponse> with _$TemperatureResponseSerializer {

}
