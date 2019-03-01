import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'inline_object8.jser.dart';

class InlineObject8 {
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
  

  InlineObject8(
      

{
    
     this.driverId = null,  
     this.endMs = null,  
     this.groupId = null,  
     this.startMs = null 
    }
  );

  @override
  String toString() {
    return 'InlineObject8[driverId=$driverId, endMs=$endMs, groupId=$groupId, startMs=$startMs, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObject8Serializer extends Serializer<InlineObject8> with _$InlineObject8Serializer {

}
