import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'vehicle_maintenance_j1939_check_engine_light.jser.dart';

class VehicleMaintenanceJ1939CheckEngineLight {
  
  @Alias('protectIsOn')
  final bool protectIsOn;
  
  @Alias('stopIsOn')
  final bool stopIsOn;
  
  @Alias('warningIsOn')
  final bool warningIsOn;
  
  @Alias('emissionsIsOn')
  final bool emissionsIsOn;
  

  VehicleMaintenanceJ1939CheckEngineLight(
      

{
     this.protectIsOn = null,  
     this.stopIsOn = null,  
     this.warningIsOn = null,  
     this.emissionsIsOn = null 
    
    }
  );

  @override
  String toString() {
    return 'VehicleMaintenanceJ1939CheckEngineLight[protectIsOn=$protectIsOn, stopIsOn=$stopIsOn, warningIsOn=$warningIsOn, emissionsIsOn=$emissionsIsOn, ]';
  }
}

@GenSerializer(nullableFields: true)
class VehicleMaintenanceJ1939CheckEngineLightSerializer extends Serializer<VehicleMaintenanceJ1939CheckEngineLight> with _$VehicleMaintenanceJ1939CheckEngineLightSerializer {

}
