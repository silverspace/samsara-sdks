import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'vehicle_location.jser.dart';

class VehicleLocation {
   /* Heading in degrees. */
  @Alias('heading')
  final double heading;
   /* ID of the vehicle. */
  @Alias('id')
  final int id;
   /* Latitude in decimal degrees. */
  @Alias('latitude')
  final double latitude;
   /* Text representation of nearest identifiable location to (latitude, longitude) coordinates. */
  @Alias('location')
  final String location;
   /* Longitude in decimal degrees. */
  @Alias('longitude')
  final double longitude;
   /* Name of the vehicle. */
  @Alias('name')
  final String name;
   /* The number of meters reported by the odometer. */
  @Alias('odometerMeters')
  final int odometerMeters;
   /* Whether or not a trip is currently in progress for this vehicle. More information available via /fleet/trips endpoint. */
  @Alias('onTrip')
  final bool onTrip;
   /* Speed in miles per hour. */
  @Alias('speed')
  final double speed;
   /* The time the reported location was logged, reported as a UNIX timestamp in milliseconds. */
  @Alias('time')
  final int time;
   /* Vehicle Identification Number (VIN) of the vehicle. */
  @Alias('vin')
  final String vin;
  

  VehicleLocation(
      

{
     this.heading = null,  
    
     this.id = null,   this.latitude = null,  
     this.location = null,  
     this.longitude = null,  
     this.name = null,  
     this.odometerMeters = null,  
     this.onTrip = null,  
     this.speed = null,  
     this.time = null,  
     this.vin = null 
    
    }
  );

  @override
  String toString() {
    return 'VehicleLocation[heading=$heading, id=$id, latitude=$latitude, location=$location, longitude=$longitude, name=$name, odometerMeters=$odometerMeters, onTrip=$onTrip, speed=$speed, time=$time, vin=$vin, ]';
  }
}

@GenSerializer(nullableFields: true)
class VehicleLocationSerializer extends Serializer<VehicleLocation> with _$VehicleLocationSerializer {

}
