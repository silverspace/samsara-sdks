import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/safety_report_harsh_event.dart';
part 'vehicle_safety_score_response.jser.dart';

class VehicleSafetyScoreResponse {
   /* Crash event count */
  @Alias('crashCount')
  final int crashCount;
   /* Harsh acceleration event count */
  @Alias('harshAccelCount')
  final int harshAccelCount;
   /* Harsh braking event count */
  @Alias('harshBrakingCount')
  final int harshBrakingCount;
  
  @Alias('harshEvents')
  final List<SafetyReportHarshEvent> harshEvents;
   /* Harsh turning event count */
  @Alias('harshTurningCount')
  final int harshTurningCount;
   /* Safety Score */
  @Alias('safetyScore')
  final int safetyScore;
   /* Safety Score Rank */
  @Alias('safetyScoreRank')
  final String safetyScoreRank;
   /* Amount of time driven over the speed limit in milliseconds */
  @Alias('timeOverSpeedLimitMs')
  final int timeOverSpeedLimitMs;
   /* Total distance driven in meters */
  @Alias('totalDistanceDrivenMeters')
  final int totalDistanceDrivenMeters;
   /* Total harsh event count */
  @Alias('totalHarshEventCount')
  final int totalHarshEventCount;
   /* Amount of time driven in milliseconds */
  @Alias('totalTimeDrivenMs')
  final int totalTimeDrivenMs;
   /* Vehicle ID */
  @Alias('vehicleId')
  final int vehicleId;
  

  VehicleSafetyScoreResponse(
      

{
     this.crashCount = null,  
     this.harshAccelCount = null,  
     this.harshBrakingCount = null,  
     this.harshEvents = const [],  
     this.harshTurningCount = null,  
     this.safetyScore = null,  
     this.safetyScoreRank = null,  
     this.timeOverSpeedLimitMs = null,  
     this.totalDistanceDrivenMeters = null,  
     this.totalHarshEventCount = null,  
     this.totalTimeDrivenMs = null,  
     this.vehicleId = null 
    
    }
  );

  @override
  String toString() {
    return 'VehicleSafetyScoreResponse[crashCount=$crashCount, harshAccelCount=$harshAccelCount, harshBrakingCount=$harshBrakingCount, harshEvents=$harshEvents, harshTurningCount=$harshTurningCount, safetyScore=$safetyScore, safetyScoreRank=$safetyScoreRank, timeOverSpeedLimitMs=$timeOverSpeedLimitMs, totalDistanceDrivenMeters=$totalDistanceDrivenMeters, totalHarshEventCount=$totalHarshEventCount, totalTimeDrivenMs=$totalTimeDrivenMs, vehicleId=$vehicleId, ]';
  }
}

@GenSerializer(nullableFields: true)
class VehicleSafetyScoreResponseSerializer extends Serializer<VehicleSafetyScoreResponse> with _$VehicleSafetyScoreResponseSerializer {

}
