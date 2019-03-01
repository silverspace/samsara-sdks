import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'inline_object18.jser.dart';

class InlineObject18 {
   /* Group ID to query. */
  @Alias('groupId')
  final int groupId;
  

  InlineObject18(
      

{
    
     this.groupId = null 
    }
  );

  @override
  String toString() {
    return 'InlineObject18[groupId=$groupId, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObject18Serializer extends Serializer<InlineObject18> with _$InlineObject18Serializer {

}
