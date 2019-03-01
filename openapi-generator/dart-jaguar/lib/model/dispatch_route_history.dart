import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/dispatch_route_historical_entry.dart';
part 'dispatch_route_history.jser.dart';

class DispatchRouteHistory {
   /* History of the route's state changes. */
  @Alias('history')
  final List<DispatchRouteHistoricalEntry> history;
  

  DispatchRouteHistory(
      

{
     this.history = const [] 
    
    }
  );

  @override
  String toString() {
    return 'DispatchRouteHistory[history=$history, ]';
  }
}

@GenSerializer(nullableFields: true)
class DispatchRouteHistorySerializer extends Serializer<DispatchRouteHistory> with _$DispatchRouteHistorySerializer {

}
