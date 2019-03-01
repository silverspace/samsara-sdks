import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/data_input_history_response.dart';
part 'inline_response2006.jser.dart';

class InlineResponse2006 {
  
  @Alias('dataInputs')
  final List<DataInputHistoryResponse> dataInputs;
  

  InlineResponse2006(
      

{
     this.dataInputs = const [] 
    
    }
  );

  @override
  String toString() {
    return 'InlineResponse2006[dataInputs=$dataInputs, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineResponse2006Serializer extends Serializer<InlineResponse2006> with _$InlineResponse2006Serializer {

}
