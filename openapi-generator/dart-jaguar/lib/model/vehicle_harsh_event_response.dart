import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/vehicle_harsh_event_response_location.dart';
part 'vehicle_harsh_event_response.jser.dart';

class VehicleHarshEventResponse {
   /* URL for downloading the forward facing video */
  @Alias('downloadForwardVideoUrl')
  final String downloadForwardVideoUrl;
   /* URL for downloading the inward facing video */
  @Alias('downloadInwardVideoUrl')
  final String downloadInwardVideoUrl;
   /* URL for downloading the tracked inward facing video */
  @Alias('downloadTrackedInwardVideoUrl')
  final String downloadTrackedInwardVideoUrl;
   /* Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event] */
  @Alias('harshEventType')
  final String harshEventType;
   /* URL of the associated incident report page */
  @Alias('incidentReportUrl')
  final String incidentReportUrl;
   /* Whether the driver was deemed distracted during this harsh event */
  @Alias('isDistracted')
  final bool isDistracted;
  
  @Alias('location')
  final VehicleHarshEventResponseLocation location;
  

  VehicleHarshEventResponse(
      

{
     this.downloadForwardVideoUrl = null,  
     this.downloadInwardVideoUrl = null,  
     this.downloadTrackedInwardVideoUrl = null,  
    
     this.harshEventType = null,  
     this.incidentReportUrl = null,   this.isDistracted = null,  
     this.location = null 
    
    }
  );

  @override
  String toString() {
    return 'VehicleHarshEventResponse[downloadForwardVideoUrl=$downloadForwardVideoUrl, downloadInwardVideoUrl=$downloadInwardVideoUrl, downloadTrackedInwardVideoUrl=$downloadTrackedInwardVideoUrl, harshEventType=$harshEventType, incidentReportUrl=$incidentReportUrl, isDistracted=$isDistracted, location=$location, ]';
  }
}

@GenSerializer(nullableFields: true)
class VehicleHarshEventResponseSerializer extends Serializer<VehicleHarshEventResponse> with _$VehicleHarshEventResponseSerializer {

}
