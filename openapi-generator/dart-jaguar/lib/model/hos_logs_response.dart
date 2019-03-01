import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/hos_logs_response_logs.dart';
part 'hos_logs_response.jser.dart';

class HosLogsResponse {
  
  @Alias('logs')
  final List<HosLogsResponseLogs> logs;
  

  HosLogsResponse(
      

{
     this.logs = const [] 
    
    }
  );

  @override
  String toString() {
    return 'HosLogsResponse[logs=$logs, ]';
  }
}

@GenSerializer(nullableFields: true)
class HosLogsResponseSerializer extends Serializer<HosLogsResponse> with _$HosLogsResponseSerializer {

}
