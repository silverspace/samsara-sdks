import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'hos_logs_response_logs.jser.dart';

class HosLogsResponseLogs {
   /* Longitude at which the log was recorded. */
  @Alias('locLng')
  final double locLng;
   /* The time at which the log/HOS status started in UNIX milliseconds. */
  @Alias('logStartMs')
  final int logStartMs;
   /* ID of the driver. */
  @Alias('driverId')
  final int driverId;
   /* The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`. */
  @Alias('statusType')
  final String statusType;
   /* City in which the log was recorded. */
  @Alias('locCity')
  final String locCity;
   /* ID of the group. */
  @Alias('groupId')
  final int groupId;
   /* Name of location at which the log was recorded. */
  @Alias('locName')
  final String locName;
   /* Latitude at which the log was recorded. */
  @Alias('locLat')
  final double locLat;
   /* Remark associated with the log entry. */
  @Alias('remark')
  final String remark;
   /* State in which the log was recorded. */
  @Alias('locState')
  final String locState;
   /* ID of the vehicle. */
  @Alias('vehicleId')
  final int vehicleId;
  
  @Alias('codriverIds')
  final List<int> codriverIds;
  

  HosLogsResponseLogs(
      

{
     this.locLng = null,  
     this.logStartMs = null,  
     this.driverId = null,  
     this.statusType = null,  
     this.locCity = null,  
     this.groupId = null,  
     this.locName = null,  
     this.locLat = null,  
     this.remark = null,  
     this.locState = null,  
     this.vehicleId = null,  
     this.codriverIds = const [] 
    
    }
  );

  @override
  String toString() {
    return 'HosLogsResponseLogs[locLng=$locLng, logStartMs=$logStartMs, driverId=$driverId, statusType=$statusType, locCity=$locCity, groupId=$groupId, locName=$locName, locLat=$locLat, remark=$remark, locState=$locState, vehicleId=$vehicleId, codriverIds=$codriverIds, ]';
  }
}

@GenSerializer(nullableFields: true)
class HosLogsResponseLogsSerializer extends Serializer<HosLogsResponseLogs> with _$HosLogsResponseLogsSerializer {

}
