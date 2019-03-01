import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/asset_current_locations_response.dart';
part 'inline_response2001.jser.dart';

class InlineResponse2001 {
  
  @Alias('assets')
  final List<AssetCurrentLocationsResponse> assets;
  

  InlineResponse2001(
      

{
     this.assets = const [] 
    
    }
  );

  @override
  String toString() {
    return 'InlineResponse2001[assets=$assets, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineResponse2001Serializer extends Serializer<InlineResponse2001> with _$InlineResponse2001Serializer {

}
