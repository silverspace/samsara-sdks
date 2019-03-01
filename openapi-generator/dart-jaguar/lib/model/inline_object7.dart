import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'inline_object7.jser.dart';

class InlineObject7 {
   /* Driver ID to query. */
  @Alias('driverId')
  final int driverId;
   /* End of the time range, specified in milliseconds UNIX time. */
  @Alias('endMs')
  final int endMs;
   /* Group ID to query. */
  @Alias('groupId')
  final int groupId;
   /* Beginning of the time range, specified in milliseconds UNIX time. */
  @Alias('startMs')
  final int startMs;
  

  InlineObject7(
      

{
    
     this.driverId = null,  
     this.endMs = null,  
     this.groupId = null,  
     this.startMs = null 
    }
  );

  @override
  String toString() {
    return 'InlineObject7[driverId=$driverId, endMs=$endMs, groupId=$groupId, startMs=$startMs, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObject7Serializer extends Serializer<InlineObject7> with _$InlineObject7Serializer {

}
