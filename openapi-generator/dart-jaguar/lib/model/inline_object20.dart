import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'inline_object20.jser.dart';

class InlineObject20 {
   /* Group ID to query. */
  @Alias('groupId')
  final int groupId;
   /* List of sensor IDs to query. */
  @Alias('sensors')
  final List<int> sensors;
  

  InlineObject20(
      

{
    
     this.groupId = null,  
     this.sensors = const [] 
    }
  );

  @override
  String toString() {
    return 'InlineObject20[groupId=$groupId, sensors=$sensors, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObject20Serializer extends Serializer<InlineObject20> with _$InlineObject20Serializer {

}
