import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'vehicle_harsh_event_response_location.jser.dart';

class VehicleHarshEventResponseLocation {
   /* Address of location where the harsh event occurred */
  @Alias('address')
  final String address;
   /* Latitude of location where the harsh event occurred */
  @Alias('latitude')
  final String latitude;
   /* Longitude of location where the harsh event occurred */
  @Alias('longitude')
  final String longitude;
  

  VehicleHarshEventResponseLocation(
      

{
     this.address = null,  
     this.latitude = null,  
     this.longitude = null 
    
    }
  );

  @override
  String toString() {
    return 'VehicleHarshEventResponseLocation[address=$address, latitude=$latitude, longitude=$longitude, ]';
  }
}

@GenSerializer(nullableFields: true)
class VehicleHarshEventResponseLocationSerializer extends Serializer<VehicleHarshEventResponseLocation> with _$VehicleHarshEventResponseLocationSerializer {

}
