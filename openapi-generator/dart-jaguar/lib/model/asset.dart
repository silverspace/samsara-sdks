import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/asset_cable.dart';
part 'asset.jser.dart';

class Asset {
   /* Serial number of the host asset */
  @Alias('assetSerialNumber')
  final String assetSerialNumber;
   /* The cable connected to the asset */
  @Alias('cable')
  final List<AssetCable> cable;
   /* Engine hours */
  @Alias('engineHours')
  final int engineHours;
   /* Asset ID */
  @Alias('id')
  final int id;
   /* Asset name */
  @Alias('name')
  final String name;
  

  Asset(
      

{
     this.assetSerialNumber = null,  
     this.cable = const [],  
     this.engineHours = null,  
    
     this.id = null,   this.name = null 
    
    }
  );

  @override
  String toString() {
    return 'Asset[assetSerialNumber=$assetSerialNumber, cable=$cable, engineHours=$engineHours, id=$id, name=$name, ]';
  }
}

@GenSerializer(nullableFields: true)
class AssetSerializer extends Serializer<Asset> with _$AssetSerializer {

}
