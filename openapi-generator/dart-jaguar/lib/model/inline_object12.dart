import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'inline_object12.jser.dart';

class InlineObject12 {
   /* Only type 'mechanic' is currently accepted. */
  @Alias('inspectionType')
  final String inspectionType;
  //enum inspectionTypeEnum {  mechanic,  }; /* Any notes from the mechanic. */
  @Alias('mechanicNotes')
  final String mechanicNotes;
   /* The current odometer of the vehicle. */
  @Alias('odometerMiles')
  final int odometerMiles;
   /* Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. */
  @Alias('previousDefectsCorrected')
  final bool previousDefectsCorrected;
   /* Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. */
  @Alias('previousDefectsIgnored')
  final bool previousDefectsIgnored;
   /* Whether or not this vehicle or trailer is safe to drive. */
  @Alias('safe')
  final String safe;
  //enum safeEnum {  safe,  unsafe,  }; /* Id of trailer being inspected. Either vehicleId or trailerId must be provided. */
  @Alias('trailerId')
  final int trailerId;
   /* The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email. */
  @Alias('userEmail')
  final String userEmail;
   /* Id of vehicle being inspected. Either vehicleId or trailerId must be provided. */
  @Alias('vehicleId')
  final int vehicleId;
  

  InlineObject12(
      

{
    
     this.inspectionType = null,   this.mechanicNotes = null,  
     this.odometerMiles = null,  
     this.previousDefectsCorrected = null,  
     this.previousDefectsIgnored = null,  
    
     this.safe = null,   this.trailerId = null,  
    
     this.userEmail = null,   this.vehicleId = null 
    
    }
  );

  @override
  String toString() {
    return 'InlineObject12[inspectionType=$inspectionType, mechanicNotes=$mechanicNotes, odometerMiles=$odometerMiles, previousDefectsCorrected=$previousDefectsCorrected, previousDefectsIgnored=$previousDefectsIgnored, safe=$safe, trailerId=$trailerId, userEmail=$userEmail, vehicleId=$vehicleId, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObject12Serializer extends Serializer<InlineObject12> with _$InlineObject12Serializer {

}
