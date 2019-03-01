import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/asset.dart';
part 'inline_response200.jser.dart';

class InlineResponse200 {
  
  @Alias('assets')
  final List<Asset> assets;
  

  InlineResponse200(
      

{
     this.assets = const [] 
    
    }
  );

  @override
  String toString() {
    return 'InlineResponse200[assets=$assets, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineResponse200Serializer extends Serializer<InlineResponse200> with _$InlineResponse200Serializer {

}
