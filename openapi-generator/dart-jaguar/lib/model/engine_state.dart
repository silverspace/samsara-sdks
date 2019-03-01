import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/object.dart';
part 'engine_state.jser.dart';

class EngineState {
   /* Timestamp in Unix epoch milliseconds. */
  @Alias('timeMs')
  final Object timeMs;
  
  @Alias('value')
  final String value;
  //enum valueEnum {  Running,  Off,  Idle,  };

  EngineState(
      

{
    
     this.timeMs = null,  
     this.value = null 
    }
  );

  @override
  String toString() {
    return 'EngineState[timeMs=$timeMs, value=$value, ]';
  }
}

@GenSerializer(nullableFields: true)
class EngineStateSerializer extends Serializer<EngineState> with _$EngineStateSerializer {

}
