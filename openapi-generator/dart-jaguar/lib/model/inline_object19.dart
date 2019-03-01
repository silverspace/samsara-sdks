import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'inline_object19.jser.dart';

class InlineObject19 {
   /* Group ID to query. */
  @Alias('groupId')
  final int groupId;
   /* List of sensor IDs to query. */
  @Alias('sensors')
  final List<int> sensors;
  

  InlineObject19(
      

{
    
     this.groupId = null,  
     this.sensors = const [] 
    }
  );

  @override
  String toString() {
    return 'InlineObject19[groupId=$groupId, sensors=$sensors, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObject19Serializer extends Serializer<InlineObject19> with _$InlineObject19Serializer {

}
