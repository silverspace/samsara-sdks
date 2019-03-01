import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'dispatch_job_create.jser.dart';

class DispatchJobCreate {
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
  

  DispatchJobCreate(
      

{
     this.destinationAddress = null,  
     this.destinationAddressId = null,  
     this.destinationLat = null,  
     this.destinationLng = null,  
     this.destinationName = null,  
     this.notes = null,  
    
     this.scheduledArrivalTimeMs = null,   this.scheduledDepartureTimeMs = null 
    
    }
  );

  @override
  String toString() {
    return 'DispatchJobCreate[destinationAddress=$destinationAddress, destinationAddressId=$destinationAddressId, destinationLat=$destinationLat, destinationLng=$destinationLng, destinationName=$destinationName, notes=$notes, scheduledArrivalTimeMs=$scheduledArrivalTimeMs, scheduledDepartureTimeMs=$scheduledDepartureTimeMs, ]';
  }
}

@GenSerializer(nullableFields: true)
class DispatchJobCreateSerializer extends Serializer<DispatchJobCreate> with _$DispatchJobCreateSerializer {

}
