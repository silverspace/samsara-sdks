import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/tag.dart';
part 'inline_response2009.jser.dart';

class InlineResponse2009 {
  
  @Alias('tags')
  final List<Tag> tags;
  

  InlineResponse2009(
      

{
     this.tags = const [] 
    
    }
  );

  @override
  String toString() {
    return 'InlineResponse2009[tags=$tags, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineResponse2009Serializer extends Serializer<InlineResponse2009> with _$InlineResponse2009Serializer {

}
