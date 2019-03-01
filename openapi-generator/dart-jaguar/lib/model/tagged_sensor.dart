import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/tagged_sensor_base.dart';
part 'tagged_sensor.jser.dart';

class TaggedSensor {
   /* The ID of the Sensor being tagged. */
  @Alias('id')
  final int id;
   /* Name of the Sensor being tagged. */
  @Alias('name')
  final String name;
  

  TaggedSensor(
      

{
    
     this.id = null,   this.name = null 
    
    }
  );

  @override
  String toString() {
    return 'TaggedSensor[id=$id, name=$name, ]';
  }
}

@GenSerializer(nullableFields: true)
class TaggedSensorSerializer extends Serializer<TaggedSensor> with _$TaggedSensorSerializer {

}
