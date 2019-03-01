import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/dvir_base_vehicle.dart';
import 'package:openapi/model/dvir_base_next_driver_signature.dart';
import 'package:openapi/model/dvir_base_author_signature.dart';
import 'package:openapi/model/dvir_base_trailer_defects.dart';
import 'package:openapi/model/dvir_base_mechanic_or_agent_signature.dart';
part 'dvir_base.jser.dart';

class DvirBase {
  
  @Alias('authorSignature')
  final DvirBaseAuthorSignature authorSignature;
   /* Signifies if the defects on the vehicle corrected after the DVIR is done. */
  @Alias('defectsCorrected')
  final bool defectsCorrected;
   /* Signifies if the defects on this vehicle can be ignored. */
  @Alias('defectsNeedNotBeCorrected')
  final bool defectsNeedNotBeCorrected;
   /* The id of this DVIR record. */
  @Alias('id')
  final int id;
   /* Inspection type of the DVIR. */
  @Alias('inspectionType')
  final String inspectionType;
   /* The mechanics notes on the DVIR. */
  @Alias('mechanicNotes')
  final String mechanicNotes;
  
  @Alias('mechanicOrAgentSignature')
  final DvirBaseMechanicOrAgentSignature mechanicOrAgentSignature;
  
  @Alias('nextDriverSignature')
  final DvirBaseNextDriverSignature nextDriverSignature;
   /* The odometer reading in miles for the vehicle when the DVIR was done. */
  @Alias('odometerMiles')
  final int odometerMiles;
   /* Timestamp of this DVIR in UNIX milliseconds. */
  @Alias('timeMs')
  final int timeMs;
   /* Defects registered for the trailer which was part of the DVIR. */
  @Alias('trailerDefects')
  final List<DvirBaseTrailerDefects> trailerDefects;
   /* The id of the trailer which was part of the DVIR. */
  @Alias('trailerId')
  final int trailerId;
   /* The name of the trailer which was part of the DVIR. */
  @Alias('trailerName')
  final String trailerName;
  
  @Alias('vehicle')
  final DvirBaseVehicle vehicle;
   /* The condition of vechile on which DVIR was done. */
  @Alias('vehicleCondition')
  final String vehicleCondition;
   /* Defects registered for the vehicle which was part of the DVIR. */
  @Alias('vehicleDefects')
  final List<DvirBaseTrailerDefects> vehicleDefects;
  

  DvirBase(
      

{
     this.authorSignature = null,  
     this.defectsCorrected = null,  
     this.defectsNeedNotBeCorrected = null,  
     this.id = null,  
     this.inspectionType = null,  
     this.mechanicNotes = null,  
     this.mechanicOrAgentSignature = null,  
     this.nextDriverSignature = null,  
     this.odometerMiles = null,  
     this.timeMs = null,  
     this.trailerDefects = const [],  
     this.trailerId = null,  
     this.trailerName = null,  
     this.vehicle = null,  
     this.vehicleCondition = null,  
     this.vehicleDefects = const [] 
    
    }
  );

  @override
  String toString() {
    return 'DvirBase[authorSignature=$authorSignature, defectsCorrected=$defectsCorrected, defectsNeedNotBeCorrected=$defectsNeedNotBeCorrected, id=$id, inspectionType=$inspectionType, mechanicNotes=$mechanicNotes, mechanicOrAgentSignature=$mechanicOrAgentSignature, nextDriverSignature=$nextDriverSignature, odometerMiles=$odometerMiles, timeMs=$timeMs, trailerDefects=$trailerDefects, trailerId=$trailerId, trailerName=$trailerName, vehicle=$vehicle, vehicleCondition=$vehicleCondition, vehicleDefects=$vehicleDefects, ]';
  }
}

@GenSerializer(nullableFields: true)
class DvirBaseSerializer extends Serializer<DvirBase> with _$DvirBaseSerializer {

}
