import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/door_response_sensors.dart';
part 'door_response.jser.dart';

class DoorResponse {
  
  @Alias('groupId')
  final int groupId;
  
  @Alias('sensors')
  final List<DoorResponseSensors> sensors;
  

  DoorResponse(
      

{
     this.groupId = null,  
     this.sensors = const [] 
    
    }
  );

  @override
  String toString() {
    return 'DoorResponse[groupId=$groupId, sensors=$sensors, ]';
  }
}

@GenSerializer(nullableFields: true)
class DoorResponseSerializer extends Serializer<DoorResponse> with _$DoorResponseSerializer {

}
