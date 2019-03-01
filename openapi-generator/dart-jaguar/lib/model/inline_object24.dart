import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'inline_object24.jser.dart';

class InlineObject24 {
   /* Group ID to query. */
  @Alias('groupId')
  final int groupId;
   /* List of sensor IDs to query. */
  @Alias('sensors')
  final List<int> sensors;
  

  InlineObject24(
      

{
    
     this.groupId = null,  
     this.sensors = const [] 
    }
  );

  @override
  String toString() {
    return 'InlineObject24[groupId=$groupId, sensors=$sensors, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObject24Serializer extends Serializer<InlineObject24> with _$InlineObject24Serializer {

}
