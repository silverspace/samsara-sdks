import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'vehicle_maintenance_passenger_diagnostic_trouble_codes.jser.dart';

class VehicleMaintenancePassengerDiagnosticTroubleCodes {
  
  @Alias('dtcShortCode')
  final String dtcShortCode;
  
  @Alias('dtcId')
  final int dtcId;
  
  @Alias('dtcDescription')
  final String dtcDescription;
  

  VehicleMaintenancePassengerDiagnosticTroubleCodes(
      

{
     this.dtcShortCode = null,  
     this.dtcId = null,  
     this.dtcDescription = null 
    
    }
  );

  @override
  String toString() {
    return 'VehicleMaintenancePassengerDiagnosticTroubleCodes[dtcShortCode=$dtcShortCode, dtcId=$dtcId, dtcDescription=$dtcDescription, ]';
  }
}

@GenSerializer(nullableFields: true)
class VehicleMaintenancePassengerDiagnosticTroubleCodesSerializer extends Serializer<VehicleMaintenancePassengerDiagnosticTroubleCodes> with _$VehicleMaintenancePassengerDiagnosticTroubleCodesSerializer {

}
