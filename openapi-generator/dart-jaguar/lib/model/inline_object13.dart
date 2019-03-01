import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'inline_object13.jser.dart';

class InlineObject13 {
   /* Group ID to query. */
  @Alias('groupId')
  final int groupId;
  

  InlineObject13(
      

{
    
     this.groupId = null 
    }
  );

  @override
  String toString() {
    return 'InlineObject13[groupId=$groupId, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObject13Serializer extends Serializer<InlineObject13> with _$InlineObject13Serializer {

}
