import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'tagged_sensor_base.jser.dart';

class TaggedSensorBase {
   /* The ID of the Sensor being tagged. */
  @Alias('id')
  final int id;
  

  TaggedSensorBase(
      

{
    
     this.id = null 
    }
  );

  @override
  String toString() {
    return 'TaggedSensorBase[id=$id, ]';
  }
}

@GenSerializer(nullableFields: true)
class TaggedSensorBaseSerializer extends Serializer<TaggedSensorBase> with _$TaggedSensorBaseSerializer {

}
