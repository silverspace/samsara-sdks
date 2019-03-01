import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/fleet_vehicle_response_vehicle_info.dart';
part 'fleet_vehicle_response.jser.dart';

class FleetVehicleResponse {
  
  @Alias('externalIds')
  final Map<String, String> externalIds;
   /* Harsh event detection setting. */
  @Alias('harshAccelSetting')
  final String harshAccelSetting;
   /* ID of the vehicle. */
  @Alias('id')
  final int id;
   /* Name of the vehicle. */
  @Alias('name')
  final String name;
  
  @Alias('vehicleInfo')
  final FleetVehicleResponseVehicleInfo vehicleInfo;
  

  FleetVehicleResponse(
      

{
     this.externalIds = const {},  
     this.harshAccelSetting = null,  
    
     this.id = null,  
     this.name = null,   this.vehicleInfo = null 
    
    }
  );

  @override
  String toString() {
    return 'FleetVehicleResponse[externalIds=$externalIds, harshAccelSetting=$harshAccelSetting, id=$id, name=$name, vehicleInfo=$vehicleInfo, ]';
  }
}

@GenSerializer(nullableFields: true)
class FleetVehicleResponseSerializer extends Serializer<FleetVehicleResponse> with _$FleetVehicleResponseSerializer {

}
