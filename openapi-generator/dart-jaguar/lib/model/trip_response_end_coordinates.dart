import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'trip_response_end_coordinates.jser.dart';

class TripResponseEndCoordinates {
  
  @Alias('latitude')
  final double latitude;
  
  @Alias('longitude')
  final double longitude;
  

  TripResponseEndCoordinates(
      

{
     this.latitude = null,  
     this.longitude = null 
    
    }
  );

  @override
  String toString() {
    return 'TripResponseEndCoordinates[latitude=$latitude, longitude=$longitude, ]';
  }
}

@GenSerializer(nullableFields: true)
class TripResponseEndCoordinatesSerializer extends Serializer<TripResponseEndCoordinates> with _$TripResponseEndCoordinatesSerializer {

}
