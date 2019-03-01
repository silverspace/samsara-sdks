import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'tagged_asset_base.jser.dart';

class TaggedAssetBase {
   /* The ID of the Asset being tagged. */
  @Alias('id')
  final int id;
  

  TaggedAssetBase(
      

{
    
     this.id = null 
    }
  );

  @override
  String toString() {
    return 'TaggedAssetBase[id=$id, ]';
  }
}

@GenSerializer(nullableFields: true)
class TaggedAssetBaseSerializer extends Serializer<TaggedAssetBase> with _$TaggedAssetBaseSerializer {

}
