import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/machine.dart';
part 'inline_response2007.jser.dart';

class InlineResponse2007 {
  
  @Alias('machines')
  final List<Machine> machines;
  

  InlineResponse2007(
      

{
     this.machines = const [] 
    
    }
  );

  @override
  String toString() {
    return 'InlineResponse2007[machines=$machines, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineResponse2007Serializer extends Serializer<InlineResponse2007> with _$InlineResponse2007Serializer {

}
