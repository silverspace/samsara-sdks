import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'asset_reefer_response_reefer_stats_alarms.jser.dart';

class AssetReeferResponseReeferStatsAlarms {
   /* Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action */
  @Alias('severity')
  final int severity;
   /* Recommended operator action */
  @Alias('operatorAction')
  final String operatorAction;
   /* Description of the alarm */
  @Alias('description')
  final String description;
   /* ID of the alarm */
  @Alias('alarmCode')
  final int alarmCode;
  

  AssetReeferResponseReeferStatsAlarms(
      

{
     this.severity = null,  
     this.operatorAction = null,  
     this.description = null,  
     this.alarmCode = null 
    
    }
  );

  @override
  String toString() {
    return 'AssetReeferResponseReeferStatsAlarms[severity=$severity, operatorAction=$operatorAction, description=$description, alarmCode=$alarmCode, ]';
  }
}

@GenSerializer(nullableFields: true)
class AssetReeferResponseReeferStatsAlarmsSerializer extends Serializer<AssetReeferResponseReeferStatsAlarms> with _$AssetReeferResponseReeferStatsAlarmsSerializer {

}
