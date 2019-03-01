import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/pagination.dart';
import 'package:openapi/model/inline_response2005_vehicle_stats.dart';
part 'inline_response2005.jser.dart';

class InlineResponse2005 {
  
  @Alias('pagination')
  final Pagination pagination;
  
  @Alias('vehicleStats')
  final List<InlineResponse2005VehicleStats> vehicleStats;
  

  InlineResponse2005(
      

{
     this.pagination = null,  
    
     this.vehicleStats = const [] 
    }
  );

  @override
  String toString() {
    return 'InlineResponse2005[pagination=$pagination, vehicleStats=$vehicleStats, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineResponse2005Serializer extends Serializer<InlineResponse2005> with _$InlineResponse2005Serializer {

}
