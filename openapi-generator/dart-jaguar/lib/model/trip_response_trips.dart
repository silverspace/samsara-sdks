import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/trip_response_start_coordinates.dart';
import 'package:openapi/model/trip_response_end_coordinates.dart';
part 'trip_response_trips.jser.dart';

class TripResponseTrips {
   /* Odometer reading at the end of the trip. */
  @Alias('endOdometer')
  final int endOdometer;
   /* Length of the trip in meters. */
  @Alias('distanceMeters')
  final int distanceMeters;
   /* End of the trip in UNIX milliseconds. */
  @Alias('endMs')
  final int endMs;
   /* Beginning of the trip in UNIX milliseconds. */
  @Alias('startMs')
  final int startMs;
   /* Amount in milliliters of fuel consumed on this trip. */
  @Alias('fuelConsumedMl')
  final int fuelConsumedMl;
   /* Text representation of nearest identifiable location to the start (latitude, longitude) coordinates. */
  @Alias('startAddress')
  final String startAddress;
  
  @Alias('startCoordinates')
  final TripResponseStartCoordinates startCoordinates;
  
  @Alias('endCoordinates')
  final TripResponseEndCoordinates endCoordinates;
   /* Odometer reading at the beginning of the trip. */
  @Alias('startOdometer')
  final int startOdometer;
   /* ID of the driver. */
  @Alias('driverId')
  final int driverId;
   /* Geocoded street address of start (latitude, longitude) coordinates. */
  @Alias('startLocation')
  final String startLocation;
   /* Length in meters trip spent on toll roads. */
  @Alias('tollMeters')
  final int tollMeters;
   /* Text representation of nearest identifiable location to the end (latitude, longitude) coordinates. */
  @Alias('endAddress')
  final String endAddress;
   /* Geocoded street address of start (latitude, longitude) coordinates. */
  @Alias('endLocation')
  final String endLocation;
  

  TripResponseTrips(
      

{
     this.endOdometer = null,  
     this.distanceMeters = null,  
     this.endMs = null,  
     this.startMs = null,  
     this.fuelConsumedMl = null,  
     this.startAddress = null,  
     this.startCoordinates = null,  
     this.endCoordinates = null,  
     this.startOdometer = null,  
     this.driverId = null,  
     this.startLocation = null,  
     this.tollMeters = null,  
     this.endAddress = null,  
     this.endLocation = null 
    
    }
  );

  @override
  String toString() {
    return 'TripResponseTrips[endOdometer=$endOdometer, distanceMeters=$distanceMeters, endMs=$endMs, startMs=$startMs, fuelConsumedMl=$fuelConsumedMl, startAddress=$startAddress, startCoordinates=$startCoordinates, endCoordinates=$endCoordinates, startOdometer=$startOdometer, driverId=$driverId, startLocation=$startLocation, tollMeters=$tollMeters, endAddress=$endAddress, endLocation=$endLocation, ]';
  }
}

@GenSerializer(nullableFields: true)
class TripResponseTripsSerializer extends Serializer<TripResponseTrips> with _$TripResponseTripsSerializer {

}
