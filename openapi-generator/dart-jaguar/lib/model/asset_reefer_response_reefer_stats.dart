import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/asset_reefer_response_reefer_stats_set_point.dart';
import 'package:openapi/model/asset_reefer_response_reefer_stats_engine_hours.dart';
import 'package:openapi/model/asset_reefer_response_reefer_stats_return_air_temp.dart';
import 'package:openapi/model/asset_reefer_response_reefer_stats_fuel_percentage.dart';
import 'package:openapi/model/asset_reefer_response_reefer_stats_alarms1.dart';
import 'package:openapi/model/asset_reefer_response_reefer_stats_power_status.dart';
part 'asset_reefer_response_reefer_stats.jser.dart';

class AssetReeferResponseReeferStats {
   /* Fuel percentage of the reefer */
  @Alias('fuelPercentage')
  final List<AssetReeferResponseReeferStatsFuelPercentage> fuelPercentage;
   /* Power status of the reefer */
  @Alias('powerStatus')
  final List<AssetReeferResponseReeferStatsPowerStatus> powerStatus;
   /* Engine hours of the reefer */
  @Alias('engineHours')
  final List<AssetReeferResponseReeferStatsEngineHours> engineHours;
   /* Set point temperature of the reefer */
  @Alias('setPoint')
  final List<AssetReeferResponseReeferStatsSetPoint> setPoint;
   /* Return air temperature of the reefer */
  @Alias('returnAirTemp')
  final List<AssetReeferResponseReeferStatsReturnAirTemp> returnAirTemp;
   /* Reefer alarms */
  @Alias('alarms')
  final List<AssetReeferResponseReeferStatsAlarms1> alarms;
  

  AssetReeferResponseReeferStats(
      

{
     this.fuelPercentage = const [],  
     this.powerStatus = const [],  
     this.engineHours = const [],  
     this.setPoint = const [],  
     this.returnAirTemp = const [],  
     this.alarms = const [] 
    
    }
  );

  @override
  String toString() {
    return 'AssetReeferResponseReeferStats[fuelPercentage=$fuelPercentage, powerStatus=$powerStatus, engineHours=$engineHours, setPoint=$setPoint, returnAirTemp=$returnAirTemp, alarms=$alarms, ]';
  }
}

@GenSerializer(nullableFields: true)
class AssetReeferResponseReeferStatsSerializer extends Serializer<AssetReeferResponseReeferStats> with _$AssetReeferResponseReeferStatsSerializer {

}
