import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'asset_reefer_response_reefer_stats_engine_hours.jser.dart';

class AssetReeferResponseReeferStatsEngineHours {
   /* Engine hours of the reefer. */
  @Alias('engineHours')
  final int engineHours;
   /* Timestamp in Unix milliseconds since epoch. */
  @Alias('changedAtMs')
  final int changedAtMs;
  

  AssetReeferResponseReeferStatsEngineHours(
      

{
     this.engineHours = null,  
     this.changedAtMs = null 
    
    }
  );

  @override
  String toString() {
    return 'AssetReeferResponseReeferStatsEngineHours[engineHours=$engineHours, changedAtMs=$changedAtMs, ]';
  }
}

@GenSerializer(nullableFields: true)
class AssetReeferResponseReeferStatsEngineHoursSerializer extends Serializer<AssetReeferResponseReeferStatsEngineHours> with _$AssetReeferResponseReeferStatsEngineHoursSerializer {

}
