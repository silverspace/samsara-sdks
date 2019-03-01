import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'inline_object23.jser.dart';

class InlineObject23 {
   /* Group ID to query. */
  @Alias('groupId')
  final int groupId;
  

  InlineObject23(
      

{
    
     this.groupId = null 
    }
  );

  @override
  String toString() {
    return 'InlineObject23[groupId=$groupId, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObject23Serializer extends Serializer<InlineObject23> with _$InlineObject23Serializer {

}
