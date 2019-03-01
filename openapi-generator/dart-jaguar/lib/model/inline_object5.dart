import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'inline_object5.jser.dart';

class InlineObject5 {
   /* End time (ms) of queried time period. */
  @Alias('endMs')
  final int endMs;
   /* Org ID to query. */
  @Alias('orgId')
  final int orgId;
   /* Start time (ms) of queried time period. */
  @Alias('startMs')
  final int startMs;
  

  InlineObject5(
      

{
    
     this.endMs = null,  
     this.orgId = null,  
     this.startMs = null 
    }
  );

  @override
  String toString() {
    return 'InlineObject5[endMs=$endMs, orgId=$orgId, startMs=$startMs, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObject5Serializer extends Serializer<InlineObject5> with _$InlineObject5Serializer {

}
