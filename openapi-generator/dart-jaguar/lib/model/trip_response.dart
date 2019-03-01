import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/trip_response_trips.dart';
part 'trip_response.jser.dart';

class TripResponse {
  
  @Alias('trips')
  final List<TripResponseTrips> trips;
  

  TripResponse(
      

{
     this.trips = const [] 
    
    }
  );

  @override
  String toString() {
    return 'TripResponse[trips=$trips, ]';
  }
}

@GenSerializer(nullableFields: true)
class TripResponseSerializer extends Serializer<TripResponse> with _$TripResponseSerializer {

}
