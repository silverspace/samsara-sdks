import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'asset_current_location.jser.dart';

class AssetCurrentLocation {
   /* The latitude of the location in degrees. */
  @Alias('latitude')
  final double latitude;
   /* The best effort (street,city,state) for the latitude and longitude. */
  @Alias('location')
  final String location;
   /* The longitude of the location in degrees. */
  @Alias('longitude')
  final double longitude;
   /* The speed calculated from GPS that the asset was traveling at in miles per hour. */
  @Alias('speedMilesPerHour')
  final double speedMilesPerHour;
   /* Time in Unix milliseconds since epoch when the asset was at the location. */
  @Alias('timeMs')
  final int timeMs;
  

  AssetCurrentLocation(
      

{
     this.latitude = null,  
     this.location = null,  
     this.longitude = null,  
     this.speedMilesPerHour = null,  
     this.timeMs = null 
    
    }
  );

  @override
  String toString() {
    return 'AssetCurrentLocation[latitude=$latitude, location=$location, longitude=$longitude, speedMilesPerHour=$speedMilesPerHour, timeMs=$timeMs, ]';
  }
}

@GenSerializer(nullableFields: true)
class AssetCurrentLocationSerializer extends Serializer<AssetCurrentLocation> with _$AssetCurrentLocationSerializer {

}
