import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'asset_reefer_response_reefer_stats_set_point.jser.dart';

class AssetReeferResponseReeferStatsSetPoint {
   /* Set point temperature in millidegree Celsius. */
  @Alias('tempInMilliC')
  final int tempInMilliC;
   /* Timestamp in Unix milliseconds since epoch. */
  @Alias('changedAtMs')
  final int changedAtMs;
  

  AssetReeferResponseReeferStatsSetPoint(
      

{
     this.tempInMilliC = null,  
     this.changedAtMs = null 
    
    }
  );

  @override
  String toString() {
    return 'AssetReeferResponseReeferStatsSetPoint[tempInMilliC=$tempInMilliC, changedAtMs=$changedAtMs, ]';
  }
}

@GenSerializer(nullableFields: true)
class AssetReeferResponseReeferStatsSetPointSerializer extends Serializer<AssetReeferResponseReeferStatsSetPoint> with _$AssetReeferResponseReeferStatsSetPointSerializer {

}
