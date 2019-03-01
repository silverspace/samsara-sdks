import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'safety_report_harsh_event.jser.dart';

class SafetyReportHarshEvent {
   /* Type of the harsh event */
  @Alias('harshEventType')
  final String harshEventType;
   /* Timestamp that the harsh event occurred in Unix milliseconds since epoch */
  @Alias('timestampMs')
  final int timestampMs;
   /* Vehicle associated with the harsh event */
  @Alias('vehicleId')
  final int vehicleId;
  

  SafetyReportHarshEvent(
      

{
     this.harshEventType = null,  
     this.timestampMs = null,  
     this.vehicleId = null 
    
    }
  );

  @override
  String toString() {
    return 'SafetyReportHarshEvent[harshEventType=$harshEventType, timestampMs=$timestampMs, vehicleId=$vehicleId, ]';
  }
}

@GenSerializer(nullableFields: true)
class SafetyReportHarshEventSerializer extends Serializer<SafetyReportHarshEvent> with _$SafetyReportHarshEventSerializer {

}
