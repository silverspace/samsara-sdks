import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'vehicle_maintenance_j1939_diagnostic_trouble_codes.jser.dart';

class VehicleMaintenanceJ1939DiagnosticTroubleCodes {
  
  @Alias('spnDescription')
  final String spnDescription;
  
  @Alias('fmiText')
  final String fmiText;
  
  @Alias('spnId')
  final int spnId;
  
  @Alias('occurrenceCount')
  final int occurrenceCount;
  
  @Alias('txId')
  final int txId;
  
  @Alias('fmiId')
  final int fmiId;
  

  VehicleMaintenanceJ1939DiagnosticTroubleCodes(
      

{
     this.spnDescription = null,  
     this.fmiText = null,  
     this.spnId = null,  
     this.occurrenceCount = null,  
     this.txId = null,  
     this.fmiId = null 
    
    }
  );

  @override
  String toString() {
    return 'VehicleMaintenanceJ1939DiagnosticTroubleCodes[spnDescription=$spnDescription, fmiText=$fmiText, spnId=$spnId, occurrenceCount=$occurrenceCount, txId=$txId, fmiId=$fmiId, ]';
  }
}

@GenSerializer(nullableFields: true)
class VehicleMaintenanceJ1939DiagnosticTroubleCodesSerializer extends Serializer<VehicleMaintenanceJ1939DiagnosticTroubleCodes> with _$VehicleMaintenanceJ1939DiagnosticTroubleCodesSerializer {

}
