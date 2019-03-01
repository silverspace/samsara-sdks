import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/tagged_asset_base.dart';
part 'tagged_asset.jser.dart';

class TaggedAsset {
   /* The ID of the Asset being tagged. */
  @Alias('id')
  final int id;
   /* Name of the Asset being tagged. */
  @Alias('name')
  final String name;
  

  TaggedAsset(
      

{
    
     this.id = null,   this.name = null 
    
    }
  );

  @override
  String toString() {
    return 'TaggedAsset[id=$id, name=$name, ]';
  }
}

@GenSerializer(nullableFields: true)
class TaggedAssetSerializer extends Serializer<TaggedAsset> with _$TaggedAssetSerializer {

}
