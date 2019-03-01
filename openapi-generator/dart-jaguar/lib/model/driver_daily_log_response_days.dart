import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/object.dart';
part 'driver_daily_log_response_days.jser.dart';

class DriverDailyLogResponseDays {
   /* Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0. */
  @Alias('certifiedAtMs')
  final int certifiedAtMs;
   /* End of the HOS day, specified in milliseconds UNIX time. */
  @Alias('endMs')
  final int endMs;
   /* End of the HOS day, specified in milliseconds UNIX time. */
  @Alias('startMs')
  final int startMs;
   /* List of trailer ID's associated with the driver for the day. */
  @Alias('trailerIds')
  final Object trailerIds;
   /* Hours spent on duty or driving, rounded to two decimal places. */
  @Alias('activeHours')
  final double activeHours;
   /* Distance driven in miles, rounded to two decimal places. */
  @Alias('distanceMiles')
  final double distanceMiles;
   /* Milliseconds spent on duty or driving. */
  @Alias('activeMs')
  final int activeMs;
   /* Whether this HOS day chart was certified by the driver. */
  @Alias('certified')
  final bool certified;
   /* List of vehicle ID's associated with the driver for the day. */
  @Alias('vehicleIds')
  final Object vehicleIds;
  

  DriverDailyLogResponseDays(
      

{
     this.certifiedAtMs = null,  
     this.endMs = null,  
     this.startMs = null,  
     this.trailerIds = null,  
     this.activeHours = null,  
     this.distanceMiles = null,  
     this.activeMs = null,  
     this.certified = null,  
     this.vehicleIds = null 
    
    }
  );

  @override
  String toString() {
    return 'DriverDailyLogResponseDays[certifiedAtMs=$certifiedAtMs, endMs=$endMs, startMs=$startMs, trailerIds=$trailerIds, activeHours=$activeHours, distanceMiles=$distanceMiles, activeMs=$activeMs, certified=$certified, vehicleIds=$vehicleIds, ]';
  }
}

@GenSerializer(nullableFields: true)
class DriverDailyLogResponseDaysSerializer extends Serializer<DriverDailyLogResponseDays> with _$DriverDailyLogResponseDaysSerializer {

}
