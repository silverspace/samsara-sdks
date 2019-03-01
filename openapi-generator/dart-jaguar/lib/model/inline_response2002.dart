import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/pagination.dart';
import 'package:openapi/model/vehicle.dart';
part 'inline_response2002.jser.dart';

class InlineResponse2002 {
  
  @Alias('pagination')
  final Pagination pagination;
   /* Group ID to query. */
  @Alias('groupId')
  final int groupId;
  
  @Alias('vehicles')
  final List<Vehicle> vehicles;
  

  InlineResponse2002(
      

{
     this.pagination = null,  
     this.groupId = null,  
     this.vehicles = const [] 
    
    }
  );

  @override
  String toString() {
    return 'InlineResponse2002[pagination=$pagination, groupId=$groupId, vehicles=$vehicles, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineResponse2002Serializer extends Serializer<InlineResponse2002> with _$InlineResponse2002Serializer {

}
