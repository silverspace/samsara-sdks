import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/object.dart';
part 'aux_input.jser.dart';

class AuxInput {
   /* Timestamp in Unix epoch milliseconds. */
  @Alias('timeMs')
  final Object timeMs;
   /* Boolean representing the digital value of the aux input. */
  @Alias('value')
  final bool value;
  

  AuxInput(
      

{
    
     this.timeMs = null,  
     this.value = null 
    }
  );

  @override
  String toString() {
    return 'AuxInput[timeMs=$timeMs, value=$value, ]';
  }
}

@GenSerializer(nullableFields: true)
class AuxInputSerializer extends Serializer<AuxInput> with _$AuxInputSerializer {

}
