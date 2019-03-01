import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'asset_reefer_response_reefer_stats_power_status.jser.dart';

class AssetReeferResponseReeferStatsPowerStatus {
   /* Timestamp in Unix milliseconds since epoch. */
  @Alias('changedAtMs')
  final int changedAtMs;
   /* Power status of the reefer. */
  @Alias('status')
  final String status;
  

  AssetReeferResponseReeferStatsPowerStatus(
      

{
     this.changedAtMs = null,  
     this.status = null 
    
    }
  );

  @override
  String toString() {
    return 'AssetReeferResponseReeferStatsPowerStatus[changedAtMs=$changedAtMs, status=$status, ]';
  }
}

@GenSerializer(nullableFields: true)
class AssetReeferResponseReeferStatsPowerStatusSerializer extends Serializer<AssetReeferResponseReeferStatsPowerStatus> with _$AssetReeferResponseReeferStatsPowerStatusSerializer {

}
