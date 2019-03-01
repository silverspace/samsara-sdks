import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'inline_object3.jser.dart';

class InlineObject3 {
   /* Group ID to query. */
  @Alias('groupId')
  final int groupId;
  

  InlineObject3(
      

{
    
     this.groupId = null 
    }
  );

  @override
  String toString() {
    return 'InlineObject3[groupId=$groupId, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObject3Serializer extends Serializer<InlineObject3> with _$InlineObject3Serializer {

}
