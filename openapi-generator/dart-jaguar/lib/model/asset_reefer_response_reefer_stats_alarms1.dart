import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/asset_reefer_response_reefer_stats_alarms.dart';
part 'asset_reefer_response_reefer_stats_alarms1.jser.dart';

class AssetReeferResponseReeferStatsAlarms1 {
  
  @Alias('alarms')
  final List<AssetReeferResponseReeferStatsAlarms> alarms;
   /* Timestamp when the alarms were reported, in Unix milliseconds since epoch */
  @Alias('changedAtMs')
  final int changedAtMs;
  

  AssetReeferResponseReeferStatsAlarms1(
      

{
     this.alarms = const [],  
     this.changedAtMs = null 
    
    }
  );

  @override
  String toString() {
    return 'AssetReeferResponseReeferStatsAlarms1[alarms=$alarms, changedAtMs=$changedAtMs, ]';
  }
}

@GenSerializer(nullableFields: true)
class AssetReeferResponseReeferStatsAlarms1Serializer extends Serializer<AssetReeferResponseReeferStatsAlarms1> with _$AssetReeferResponseReeferStatsAlarms1Serializer {

}
