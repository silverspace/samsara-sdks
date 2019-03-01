import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'drivers_summary_response_summaries.jser.dart';

class DriversSummaryResponseSummaries {
   /* ID of the driver. */
  @Alias('driverId')
  final int driverId;
   /* Distance driven in miles, rounded to two decimal places. */
  @Alias('distanceMiles')
  final double distanceMiles;
   /* Duration in milliseconds that driver was driving during the requested time range */
  @Alias('driveMs')
  final int driveMs;
   /* Duration in milliseconds that driver was on duty or driving during the requested time range */
  @Alias('activeMs')
  final int activeMs;
   /* Username of the driver. */
  @Alias('driverUsername')
  final String driverUsername;
   /* Group of the driver. */
  @Alias('groupId')
  final int groupId;
   /* Name of the driver. */
  @Alias('driverName')
  final String driverName;
   /* Duration in milliseconds that driver was on duty during the requested time range */
  @Alias('onDutyMs')
  final int onDutyMs;
  

  DriversSummaryResponseSummaries(
      

{
     this.driverId = null,  
     this.distanceMiles = null,  
     this.driveMs = null,  
     this.activeMs = null,  
     this.driverUsername = null,  
     this.groupId = null,  
     this.driverName = null,  
     this.onDutyMs = null 
    
    }
  );

  @override
  String toString() {
    return 'DriversSummaryResponseSummaries[driverId=$driverId, distanceMiles=$distanceMiles, driveMs=$driveMs, activeMs=$activeMs, driverUsername=$driverUsername, groupId=$groupId, driverName=$driverName, onDutyMs=$onDutyMs, ]';
  }
}

@GenSerializer(nullableFields: true)
class DriversSummaryResponseSummariesSerializer extends Serializer<DriversSummaryResponseSummaries> with _$DriversSummaryResponseSummariesSerializer {

}
