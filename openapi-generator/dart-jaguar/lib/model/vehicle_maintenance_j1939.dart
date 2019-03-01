import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/vehicle_maintenance_j1939_check_engine_light.dart';
import 'package:openapi/model/vehicle_maintenance_j1939_diagnostic_trouble_codes.dart';
part 'vehicle_maintenance_j1939.jser.dart';

class VehicleMaintenanceJ1939 {
  
  @Alias('checkEngineLight')
  final VehicleMaintenanceJ1939CheckEngineLight checkEngineLight;
   /* J1939 DTCs. */
  @Alias('diagnosticTroubleCodes')
  final List<VehicleMaintenanceJ1939DiagnosticTroubleCodes> diagnosticTroubleCodes;
  

  VehicleMaintenanceJ1939(
      

{
     this.checkEngineLight = null,  
     this.diagnosticTroubleCodes = const [] 
    
    }
  );

  @override
  String toString() {
    return 'VehicleMaintenanceJ1939[checkEngineLight=$checkEngineLight, diagnosticTroubleCodes=$diagnosticTroubleCodes, ]';
  }
}

@GenSerializer(nullableFields: true)
class VehicleMaintenanceJ1939Serializer extends Serializer<VehicleMaintenanceJ1939> with _$VehicleMaintenanceJ1939Serializer {

}
