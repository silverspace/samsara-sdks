import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/asset_reefer_response_reefer_stats.dart';
part 'asset_reefer_response.jser.dart';

class AssetReeferResponse {
   /* Asset type */
  @Alias('assetType')
  final String assetType;
   /* Asset ID */
  @Alias('id')
  final int id;
   /* Asset name */
  @Alias('name')
  final String name;
  
  @Alias('reeferStats')
  final AssetReeferResponseReeferStats reeferStats;
  

  AssetReeferResponse(
      

{
     this.assetType = null,  
     this.id = null,  
     this.name = null,  
     this.reeferStats = null 
    
    }
  );

  @override
  String toString() {
    return 'AssetReeferResponse[assetType=$assetType, id=$id, name=$name, reeferStats=$reeferStats, ]';
  }
}

@GenSerializer(nullableFields: true)
class AssetReeferResponseSerializer extends Serializer<AssetReeferResponse> with _$AssetReeferResponseSerializer {

}
