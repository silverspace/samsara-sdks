import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/sensor.dart';
part 'inline_response2008.jser.dart';

class InlineResponse2008 {
  
  @Alias('sensors')
  final List<Sensor> sensors;
  

  InlineResponse2008(
      

{
     this.sensors = const [] 
    
    }
  );

  @override
  String toString() {
    return 'InlineResponse2008[sensors=$sensors, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineResponse2008Serializer extends Serializer<InlineResponse2008> with _$InlineResponse2008Serializer {

}
