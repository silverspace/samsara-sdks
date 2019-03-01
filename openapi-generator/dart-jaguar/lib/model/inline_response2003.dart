import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/vehicle_location.dart';
part 'inline_response2003.jser.dart';

class InlineResponse2003 {
   /* Group ID to query. */
  @Alias('groupId')
  final int groupId;
  
  @Alias('vehicles')
  final List<VehicleLocation> vehicles;
  

  InlineResponse2003(
      

{
     this.groupId = null,  
     this.vehicles = const [] 
    
    }
  );

  @override
  String toString() {
    return 'InlineResponse2003[groupId=$groupId, vehicles=$vehicles, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineResponse2003Serializer extends Serializer<InlineResponse2003> with _$InlineResponse2003Serializer {

}
