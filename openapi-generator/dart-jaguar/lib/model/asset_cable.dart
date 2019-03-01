import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'asset_cable.jser.dart';

class AssetCable {
   /* Asset type */
  @Alias('assetType')
  final String assetType;
  

  AssetCable(
      

{
     this.assetType = null 
    
    }
  );

  @override
  String toString() {
    return 'AssetCable[assetType=$assetType, ]';
  }
}

@GenSerializer(nullableFields: true)
class AssetCableSerializer extends Serializer<AssetCable> with _$AssetCableSerializer {

}
