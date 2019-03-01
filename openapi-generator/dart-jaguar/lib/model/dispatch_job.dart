import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/job_status.dart';
import 'package:openapi/model/dispatch_job_create.dart';
part 'dispatch_job.jser.dart';

class DispatchJob {
   /* The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided. */
  @Alias('destination_address')
  final String destinationAddress;
   /* ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided. */
  @Alias('destination_address_id')
  final int destinationAddressId;
   /* Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. */
  @Alias('destination_lat')
  final double destinationLat;
   /* Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. */
  @Alias('destination_lng')
  final double destinationLng;
   /* The name of the job destination. If provided, it will take precedence over the name of the address book entry. */
  @Alias('destination_name')
  final String destinationName;
   /* Notes regarding the details of this job. */
  @Alias('notes')
  final String notes;
   /* The time at which the assigned driver is scheduled to arrive at the job destination. */
  @Alias('scheduled_arrival_time_ms')
  final int scheduledArrivalTimeMs;
   /* The time at which the assigned driver is scheduled to depart from the job destination. */
  @Alias('scheduled_departure_time_ms')
  final int scheduledDepartureTimeMs;
   /* The time at which the driver arrived at the job destination. */
  @Alias('arrived_at_ms')
  final int arrivedAtMs;
   /* The time at which the job was marked complete (e.g. started driving to the next destination). */
  @Alias('completed_at_ms')
  final int completedAtMs;
   /* ID of the route that this job belongs to. */
  @Alias('dispatch_route_id')
  final int dispatchRouteId;
   /* ID of the driver assigned to the dispatch job. */
  @Alias('driver_id')
  final int driverId;
   /* The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination). */
  @Alias('en_route_at_ms')
  final int enRouteAtMs;
   /* The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs. */
  @Alias('estimated_arrival_ms')
  final int estimatedArrivalMs;
   /* Fleet viewer url of the dispatch job. */
  @Alias('fleet_viewer_url')
  final String fleetViewerUrl;
  
  @Alias('group_id')
  final int groupId;
   /* ID of the Samsara dispatch job. */
  @Alias('id')
  final int id;
  
  @Alias('job_state')
  final JobStatus jobState;
  //enum jobStateEnum {  JobState_Unassigned,  JobState_Scheduled,  JobState_EnRoute,  JobState_Arrived,  JobState_Completed,  JobState_Skipped,  }; /* The time at which the job was marked skipped. */
  @Alias('skipped_at_ms')
  final int skippedAtMs;
   /* ID of the vehicle used for the dispatch job. */
  @Alias('vehicle_id')
  final int vehicleId;
  

  DispatchJob(
      

{
     this.destinationAddress = null,  
     this.destinationAddressId = null,  
     this.destinationLat = null,  
     this.destinationLng = null,  
     this.destinationName = null,  
     this.notes = null,  
    
     this.scheduledArrivalTimeMs = null,   this.scheduledDepartureTimeMs = null,  
     this.arrivedAtMs = null,  
     this.completedAtMs = null,  
    
     this.dispatchRouteId = null,   this.driverId = null,  
     this.enRouteAtMs = null,  
     this.estimatedArrivalMs = null,  
     this.fleetViewerUrl = null,  
    
     this.groupId = null,  
     this.id = null,  
     this.jobState = null,   this.skippedAtMs = null,  
     this.vehicleId = null 
    
    }
  );

  @override
  String toString() {
    return 'DispatchJob[destinationAddress=$destinationAddress, destinationAddressId=$destinationAddressId, destinationLat=$destinationLat, destinationLng=$destinationLng, destinationName=$destinationName, notes=$notes, scheduledArrivalTimeMs=$scheduledArrivalTimeMs, scheduledDepartureTimeMs=$scheduledDepartureTimeMs, arrivedAtMs=$arrivedAtMs, completedAtMs=$completedAtMs, dispatchRouteId=$dispatchRouteId, driverId=$driverId, enRouteAtMs=$enRouteAtMs, estimatedArrivalMs=$estimatedArrivalMs, fleetViewerUrl=$fleetViewerUrl, groupId=$groupId, id=$id, jobState=$jobState, skippedAtMs=$skippedAtMs, vehicleId=$vehicleId, ]';
  }
}

@GenSerializer(nullableFields: true)
class DispatchJobSerializer extends Serializer<DispatchJob> with _$DispatchJobSerializer {

}
