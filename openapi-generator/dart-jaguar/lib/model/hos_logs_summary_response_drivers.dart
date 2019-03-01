import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'hos_logs_summary_response_drivers.jser.dart';

class HosLogsSummaryResponseDrivers {
   /* The amount of time (in ms) remaining until the driver cannot drive without a rest break. */
  @Alias('timeUntilBreak')
  final int timeUntilBreak;
   /* Name of the vehicle. */
  @Alias('vehicleName')
  final String vehicleName;
   /* The amount of driving time in violation today (in ms). */
  @Alias('drivingInViolationToday')
  final int drivingInViolationToday;
   /* ID of the driver. */
  @Alias('driverId')
  final int driverId;
   /* The amount of remaining cycle time (in ms). */
  @Alias('cycleRemaining')
  final int cycleRemaining;
   /* Name of the driver. */
  @Alias('driverName')
  final String driverName;
   /* The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`. */
  @Alias('dutyStatus')
  final String dutyStatus;
   /* The amount of cycle time (in ms) available tomorrow. */
  @Alias('cycleTomorrow')
  final int cycleTomorrow;
   /* The amount of remaining shift drive time (in ms). */
  @Alias('shiftDriveRemaining')
  final int shiftDriveRemaining;
   /* The amount of time (in ms) that the driver has been in the current `dutyStatus`. */
  @Alias('timeInCurrentStatus')
  final int timeInCurrentStatus;
   /* The amount of driving time in violation in this cycle (in ms). */
  @Alias('drivingInViolationCycle')
  final int drivingInViolationCycle;
   /* The amount of remaining shift time (in ms). */
  @Alias('shiftRemaining')
  final int shiftRemaining;
  

  HosLogsSummaryResponseDrivers(
      

{
     this.timeUntilBreak = null,  
     this.vehicleName = null,  
     this.drivingInViolationToday = null,  
     this.driverId = null,  
     this.cycleRemaining = null,  
     this.driverName = null,  
     this.dutyStatus = null,  
     this.cycleTomorrow = null,  
     this.shiftDriveRemaining = null,  
     this.timeInCurrentStatus = null,  
     this.drivingInViolationCycle = null,  
     this.shiftRemaining = null 
    
    }
  );

  @override
  String toString() {
    return 'HosLogsSummaryResponseDrivers[timeUntilBreak=$timeUntilBreak, vehicleName=$vehicleName, drivingInViolationToday=$drivingInViolationToday, driverId=$driverId, cycleRemaining=$cycleRemaining, driverName=$driverName, dutyStatus=$dutyStatus, cycleTomorrow=$cycleTomorrow, shiftDriveRemaining=$shiftDriveRemaining, timeInCurrentStatus=$timeInCurrentStatus, drivingInViolationCycle=$drivingInViolationCycle, shiftRemaining=$shiftRemaining, ]';
  }
}

@GenSerializer(nullableFields: true)
class HosLogsSummaryResponseDriversSerializer extends Serializer<HosLogsSummaryResponseDrivers> with _$HosLogsSummaryResponseDriversSerializer {

}
