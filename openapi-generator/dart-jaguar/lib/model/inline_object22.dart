import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'inline_object22.jser.dart';

class InlineObject22 {
   /* Group ID to query. */
  @Alias('groupId')
  final int groupId;
   /* List of sensor IDs to query. */
  @Alias('sensors')
  final List<int> sensors;
  

  InlineObject22(
      

{
    
     this.groupId = null,  
     this.sensors = const [] 
    }
  );

  @override
  String toString() {
    return 'InlineObject22[groupId=$groupId, sensors=$sensors, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObject22Serializer extends Serializer<InlineObject22> with _$InlineObject22Serializer {

}
