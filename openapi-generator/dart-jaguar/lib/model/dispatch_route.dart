import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/dispatch_job.dart';
import 'package:openapi/model/dispatch_route_base.dart';
part 'dispatch_route.jser.dart';

class DispatchRoute {
   /* The time in Unix epoch milliseconds that the route actually ended. */
  @Alias('actual_end_ms')
  final int actualEndMs;
   /* The time in Unix epoch milliseconds that the route actually started. */
  @Alias('actual_start_ms')
  final int actualStartMs;
   /* ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned. */
  @Alias('driver_id')
  final int driverId;
   /* ID of the group if the organization has multiple groups (optional). */
  @Alias('group_id')
  final int groupId;
   /* Descriptive name of this route. */
  @Alias('name')
  final String name;
   /* The time in Unix epoch milliseconds that the last job in the route is scheduled to end. */
  @Alias('scheduled_end_ms')
  final int scheduledEndMs;
   /* The distance expected to be traveled for this route in meters. */
  @Alias('scheduled_meters')
  final int scheduledMeters;
   /* The time in Unix epoch milliseconds that the route is scheduled to start. */
  @Alias('scheduled_start_ms')
  final int scheduledStartMs;
   /* The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided. */
  @Alias('start_location_address')
  final String startLocationAddress;
   /* ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided. */
  @Alias('start_location_address_id')
  final int startLocationAddressId;
   /* Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. */
  @Alias('start_location_lat')
  final double startLocationLat;
   /* Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. */
  @Alias('start_location_lng')
  final double startLocationLng;
   /* The name of the route's starting location. If provided, it will take precedence over the name of the address book entry. */
  @Alias('start_location_name')
  final String startLocationName;
   /* ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them. */
  @Alias('trailer_id')
  final int trailerId;
   /* ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned. */
  @Alias('vehicle_id')
  final int vehicleId;
   /* The dispatch jobs associated with this route. */
  @Alias('dispatch_jobs')
  final List<DispatchJob> dispatchJobs;
   /* ID of the Samsara dispatch route. */
  @Alias('id')
  final int id;
  

  DispatchRoute(
      

{
     this.actualEndMs = null,  
     this.actualStartMs = null,  
     this.driverId = null,  
     this.groupId = null,  
    
     this.name = null,  
     this.scheduledEndMs = null,   this.scheduledMeters = null,  
    
     this.scheduledStartMs = null,   this.startLocationAddress = null,  
     this.startLocationAddressId = null,  
     this.startLocationLat = null,  
     this.startLocationLng = null,  
     this.startLocationName = null,  
     this.trailerId = null,  
     this.vehicleId = null,  
    
     this.dispatchJobs = const [],  
     this.id = null 
    }
  );

  @override
  String toString() {
    return 'DispatchRoute[actualEndMs=$actualEndMs, actualStartMs=$actualStartMs, driverId=$driverId, groupId=$groupId, name=$name, scheduledEndMs=$scheduledEndMs, scheduledMeters=$scheduledMeters, scheduledStartMs=$scheduledStartMs, startLocationAddress=$startLocationAddress, startLocationAddressId=$startLocationAddressId, startLocationLat=$startLocationLat, startLocationLng=$startLocationLng, startLocationName=$startLocationName, trailerId=$trailerId, vehicleId=$vehicleId, dispatchJobs=$dispatchJobs, id=$id, ]';
  }
}

@GenSerializer(nullableFields: true)
class DispatchRouteSerializer extends Serializer<DispatchRoute> with _$DispatchRouteSerializer {

}
