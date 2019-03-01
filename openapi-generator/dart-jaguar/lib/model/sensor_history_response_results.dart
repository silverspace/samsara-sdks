import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'sensor_history_response_results.jser.dart';

class SensorHistoryResponseResults {
   /* List of datapoints, one for each requested (sensor, field) pair. */
  @Alias('series')
  final List<int> series;
   /* Timestamp in UNIX milliseconds. */
  @Alias('timeMs')
  final int timeMs;
  

  SensorHistoryResponseResults(
      

{
     this.series = const [],  
     this.timeMs = null 
    
    }
  );

  @override
  String toString() {
    return 'SensorHistoryResponseResults[series=$series, timeMs=$timeMs, ]';
  }
}

@GenSerializer(nullableFields: true)
class SensorHistoryResponseResultsSerializer extends Serializer<SensorHistoryResponseResults> with _$SensorHistoryResponseResultsSerializer {

}
