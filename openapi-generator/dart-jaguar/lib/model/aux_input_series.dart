import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/aux_input.dart';
part 'aux_input_series.jser.dart';

class AuxInputSeries {
   /* The name of the aux input. */
  @Alias('name')
  final String name;
  //enum nameEnum {  Emergency Lights,  Emergency Alarm,  Stop Paddle,  Power Take-Off,  Plow,  Sweeper,  Salter,  Boom,  };
  @Alias('values')
  final List<AuxInput> values;
  

  AuxInputSeries(
      

{
    
     this.name = null,  
     this.values = const [] 
    }
  );

  @override
  String toString() {
    return 'AuxInputSeries[name=$name, values=$values, ]';
  }
}

@GenSerializer(nullableFields: true)
class AuxInputSeriesSerializer extends Serializer<AuxInputSeries> with _$AuxInputSeriesSerializer {

}
