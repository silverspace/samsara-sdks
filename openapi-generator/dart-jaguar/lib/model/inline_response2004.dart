import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/vehicle_maintenance.dart';
part 'inline_response2004.jser.dart';

class InlineResponse2004 {
  
  @Alias('vehicles')
  final List<VehicleMaintenance> vehicles;
  

  InlineResponse2004(
      

{
     this.vehicles = const [] 
    
    }
  );

  @override
  String toString() {
    return 'InlineResponse2004[vehicles=$vehicles, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineResponse2004Serializer extends Serializer<InlineResponse2004> with _$InlineResponse2004Serializer {

}
