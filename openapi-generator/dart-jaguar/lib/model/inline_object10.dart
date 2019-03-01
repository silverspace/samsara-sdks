import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'inline_object10.jser.dart';

class InlineObject10 {
   /* Group ID to query. */
  @Alias('groupId')
  final int groupId;
  

  InlineObject10(
      

{
    
     this.groupId = null 
    }
  );

  @override
  String toString() {
    return 'InlineObject10[groupId=$groupId, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObject10Serializer extends Serializer<InlineObject10> with _$InlineObject10Serializer {

}
