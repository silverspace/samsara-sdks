import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/vehicle.dart';
part 'inline_object14.jser.dart';

class InlineObject14 {
   /* Group ID to query. */
  @Alias('groupId')
  final int groupId;
  
  @Alias('vehicles')
  final List<Vehicle> vehicles;
  

  InlineObject14(
      

{
    
     this.groupId = null,  
     this.vehicles = const [] 
    }
  );

  @override
  String toString() {
    return 'InlineObject14[groupId=$groupId, vehicles=$vehicles, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObject14Serializer extends Serializer<InlineObject14> with _$InlineObject14Serializer {

}
