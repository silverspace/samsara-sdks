import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'asset_reefer_response_reefer_stats_fuel_percentage.jser.dart';

class AssetReeferResponseReeferStatsFuelPercentage {
   /* Fuel percentage of the reefer. */
  @Alias('fuelPercentage')
  final int fuelPercentage;
   /* Timestamp in Unix milliseconds since epoch. */
  @Alias('changedAtMs')
  final int changedAtMs;
  

  AssetReeferResponseReeferStatsFuelPercentage(
      

{
     this.fuelPercentage = null,  
     this.changedAtMs = null 
    
    }
  );

  @override
  String toString() {
    return 'AssetReeferResponseReeferStatsFuelPercentage[fuelPercentage=$fuelPercentage, changedAtMs=$changedAtMs, ]';
  }
}

@GenSerializer(nullableFields: true)
class AssetReeferResponseReeferStatsFuelPercentageSerializer extends Serializer<AssetReeferResponseReeferStatsFuelPercentage> with _$AssetReeferResponseReeferStatsFuelPercentageSerializer {

}
