import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/sensor_history_response_results.dart';
part 'sensor_history_response.jser.dart';

class SensorHistoryResponse {
  
  @Alias('results')
  final List<SensorHistoryResponseResults> results;
  

  SensorHistoryResponse(
      

{
     this.results = const [] 
    
    }
  );

  @override
  String toString() {
    return 'SensorHistoryResponse[results=$results, ]';
  }
}

@GenSerializer(nullableFields: true)
class SensorHistoryResponseSerializer extends Serializer<SensorHistoryResponse> with _$SensorHistoryResponseSerializer {

}
