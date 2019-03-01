import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/vehicle_maintenance_passenger_check_engine_light.dart';
import 'package:openapi/model/vehicle_maintenance_passenger_diagnostic_trouble_codes.dart';
part 'vehicle_maintenance_passenger.jser.dart';

class VehicleMaintenancePassenger {
  
  @Alias('checkEngineLight')
  final VehicleMaintenancePassengerCheckEngineLight checkEngineLight;
   /* Passenger vehicle DTCs. */
  @Alias('diagnosticTroubleCodes')
  final List<VehicleMaintenancePassengerDiagnosticTroubleCodes> diagnosticTroubleCodes;
  

  VehicleMaintenancePassenger(
      

{
     this.checkEngineLight = null,  
     this.diagnosticTroubleCodes = const [] 
    
    }
  );

  @override
  String toString() {
    return 'VehicleMaintenancePassenger[checkEngineLight=$checkEngineLight, diagnosticTroubleCodes=$diagnosticTroubleCodes, ]';
  }
}

@GenSerializer(nullableFields: true)
class VehicleMaintenancePassengerSerializer extends Serializer<VehicleMaintenancePassenger> with _$VehicleMaintenancePassengerSerializer {

}
