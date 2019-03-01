import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'inline_object4.jser.dart';

class InlineObject4 {
   /* True indicates that this driver should be reactivated. */
  @Alias('reactivate')
  final bool reactivate;
  

  InlineObject4(
      

{
    
     this.reactivate = null 
    }
  );

  @override
  String toString() {
    return 'InlineObject4[reactivate=$reactivate, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObject4Serializer extends Serializer<InlineObject4> with _$InlineObject4Serializer {

}
