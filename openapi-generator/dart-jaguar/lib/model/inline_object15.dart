import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'inline_object15.jser.dart';

class InlineObject15 {
   /* End of the time range, specified in milliseconds UNIX time. */
  @Alias('endMs')
  final int endMs;
   /* Group ID to query. */
  @Alias('groupId')
  final int groupId;
   /* Beginning of the time range, specified in milliseconds UNIX time. Limited to a 90 day window with respect to startMs and endMs */
  @Alias('startMs')
  final int startMs;
   /* Vehicle ID to query. */
  @Alias('vehicleId')
  final int vehicleId;
  

  InlineObject15(
      

{
    
     this.endMs = null,  
     this.groupId = null,  
     this.startMs = null,  
     this.vehicleId = null 
    }
  );

  @override
  String toString() {
    return 'InlineObject15[endMs=$endMs, groupId=$groupId, startMs=$startMs, vehicleId=$vehicleId, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObject15Serializer extends Serializer<InlineObject15> with _$InlineObject15Serializer {

}
