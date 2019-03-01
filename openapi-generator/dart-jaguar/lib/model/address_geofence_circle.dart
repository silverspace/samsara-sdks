import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'address_geofence_circle.jser.dart';

class AddressGeofenceCircle {
   /* The latitude of the center of the circular geofence */
  @Alias('latitude')
  final double latitude;
   /* The radius of the circular geofence */
  @Alias('radiusMeters')
  final int radiusMeters;
   /* The longitude of the center of the circular geofence */
  @Alias('longitude')
  final double longitude;
  

  AddressGeofenceCircle(
      

{
     this.latitude = null,  
     this.radiusMeters = null,  
     this.longitude = null 
    
    }
  );

  @override
  String toString() {
    return 'AddressGeofenceCircle[latitude=$latitude, radiusMeters=$radiusMeters, longitude=$longitude, ]';
  }
}

@GenSerializer(nullableFields: true)
class AddressGeofenceCircleSerializer extends Serializer<AddressGeofenceCircle> with _$AddressGeofenceCircleSerializer {

}
