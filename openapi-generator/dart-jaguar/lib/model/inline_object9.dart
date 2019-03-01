import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'inline_object9.jser.dart';

class InlineObject9 {
   /* Group ID to query. */
  @Alias('groupId')
  final int groupId;
  

  InlineObject9(
      

{
    
     this.groupId = null 
    }
  );

  @override
  String toString() {
    return 'InlineObject9[groupId=$groupId, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObject9Serializer extends Serializer<InlineObject9> with _$InlineObject9Serializer {

}
