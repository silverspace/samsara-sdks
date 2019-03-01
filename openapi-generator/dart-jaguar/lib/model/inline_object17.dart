import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'inline_object17.jser.dart';

class InlineObject17 {
   /* End of the time range, specified in milliseconds UNIX time. */
  @Alias('endMs')
  final int endMs;
   /* Group ID to query. */
  @Alias('groupId')
  final int groupId;
   /* Beginning of the time range, specified in milliseconds UNIX time. */
  @Alias('startMs')
  final int startMs;
  

  InlineObject17(
      

{
    
     this.endMs = null,  
     this.groupId = null,  
     this.startMs = null 
    }
  );

  @override
  String toString() {
    return 'InlineObject17[endMs=$endMs, groupId=$groupId, startMs=$startMs, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObject17Serializer extends Serializer<InlineObject17> with _$InlineObject17Serializer {

}
