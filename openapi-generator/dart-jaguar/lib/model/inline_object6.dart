import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'inline_object6.jser.dart';

class InlineObject6 {
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
  

  InlineObject6(
      

{
    
     this.driverId = null,  
     this.endMs = null,  
     this.groupId = null,  
     this.startMs = null 
    }
  );

  @override
  String toString() {
    return 'InlineObject6[driverId=$driverId, endMs=$endMs, groupId=$groupId, startMs=$startMs, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObject6Serializer extends Serializer<InlineObject6> with _$InlineObject6Serializer {

}
