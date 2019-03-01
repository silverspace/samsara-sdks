import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/humidity_response_sensors.dart';
part 'humidity_response.jser.dart';

class HumidityResponse {
  
  @Alias('groupId')
  final int groupId;
  
  @Alias('sensors')
  final List<HumidityResponseSensors> sensors;
  

  HumidityResponse(
      

{
     this.groupId = null,  
     this.sensors = const [] 
    
    }
  );

  @override
  String toString() {
    return 'HumidityResponse[groupId=$groupId, sensors=$sensors, ]';
  }
}

@GenSerializer(nullableFields: true)
class HumidityResponseSerializer extends Serializer<HumidityResponse> with _$HumidityResponseSerializer {

}
