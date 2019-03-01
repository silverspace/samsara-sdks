import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/cargo_response_sensors.dart';
part 'cargo_response.jser.dart';

class CargoResponse {
  
  @Alias('groupId')
  final int groupId;
  
  @Alias('sensors')
  final List<CargoResponseSensors> sensors;
  

  CargoResponse(
      

{
     this.groupId = null,  
     this.sensors = const [] 
    
    }
  );

  @override
  String toString() {
    return 'CargoResponse[groupId=$groupId, sensors=$sensors, ]';
  }
}

@GenSerializer(nullableFields: true)
class CargoResponseSerializer extends Serializer<CargoResponse> with _$CargoResponseSerializer {

}
