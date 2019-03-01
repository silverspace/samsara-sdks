import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'trip_response_start_coordinates.jser.dart';

class TripResponseStartCoordinates {
  
  @Alias('latitude')
  final double latitude;
  
  @Alias('longitude')
  final double longitude;
  

  TripResponseStartCoordinates(
      

{
     this.latitude = null,  
     this.longitude = null 
    
    }
  );

  @override
  String toString() {
    return 'TripResponseStartCoordinates[latitude=$latitude, longitude=$longitude, ]';
  }
}

@GenSerializer(nullableFields: true)
class TripResponseStartCoordinatesSerializer extends Serializer<TripResponseStartCoordinates> with _$TripResponseStartCoordinatesSerializer {

}
