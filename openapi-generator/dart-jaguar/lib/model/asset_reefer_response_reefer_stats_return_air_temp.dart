import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'asset_reefer_response_reefer_stats_return_air_temp.jser.dart';

class AssetReeferResponseReeferStatsReturnAirTemp {
   /* Return air temperature in millidegree Celsius. */
  @Alias('tempInMilliC')
  final int tempInMilliC;
   /* Timestamp in Unix milliseconds since epoch. */
  @Alias('changedAtMs')
  final int changedAtMs;
  

  AssetReeferResponseReeferStatsReturnAirTemp(
      

{
     this.tempInMilliC = null,  
     this.changedAtMs = null 
    
    }
  );

  @override
  String toString() {
    return 'AssetReeferResponseReeferStatsReturnAirTemp[tempInMilliC=$tempInMilliC, changedAtMs=$changedAtMs, ]';
  }
}

@GenSerializer(nullableFields: true)
class AssetReeferResponseReeferStatsReturnAirTempSerializer extends Serializer<AssetReeferResponseReeferStatsReturnAirTemp> with _$AssetReeferResponseReeferStatsReturnAirTempSerializer {

}
