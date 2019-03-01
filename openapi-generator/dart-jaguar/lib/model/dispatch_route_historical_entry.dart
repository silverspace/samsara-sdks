import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/dispatch_route.dart';
part 'dispatch_route_historical_entry.jser.dart';

class DispatchRouteHistoricalEntry {
   /* Timestamp that the route was updated, represented as Unix milliseconds since epoch. */
  @Alias('changed_at_ms')
  final int changedAtMs;
  
  @Alias('route')
  final DispatchRoute route;
  

  DispatchRouteHistoricalEntry(
      

{
     this.changedAtMs = null,  
     this.route = null 
    
    }
  );

  @override
  String toString() {
    return 'DispatchRouteHistoricalEntry[changedAtMs=$changedAtMs, route=$route, ]';
  }
}

@GenSerializer(nullableFields: true)
class DispatchRouteHistoricalEntrySerializer extends Serializer<DispatchRouteHistoricalEntry> with _$DispatchRouteHistoricalEntrySerializer {

}
