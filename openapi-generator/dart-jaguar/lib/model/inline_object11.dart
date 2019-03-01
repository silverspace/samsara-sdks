import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'inline_object11.jser.dart';

class InlineObject11 {
   /* Group ID to query. */
  @Alias('groupId')
  final int groupId;
  

  InlineObject11(
      

{
    
     this.groupId = null 
    }
  );

  @override
  String toString() {
    return 'InlineObject11[groupId=$groupId, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObject11Serializer extends Serializer<InlineObject11> with _$InlineObject11Serializer {

}
