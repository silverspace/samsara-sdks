import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/hos_authentication_logs_response_authentication_logs.dart';
part 'hos_authentication_logs_response.jser.dart';

class HosAuthenticationLogsResponse {
  
  @Alias('authenticationLogs')
  final List<HosAuthenticationLogsResponseAuthenticationLogs> authenticationLogs;
  

  HosAuthenticationLogsResponse(
      

{
     this.authenticationLogs = const [] 
    
    }
  );

  @override
  String toString() {
    return 'HosAuthenticationLogsResponse[authenticationLogs=$authenticationLogs, ]';
  }
}

@GenSerializer(nullableFields: true)
class HosAuthenticationLogsResponseSerializer extends Serializer<HosAuthenticationLogsResponse> with _$HosAuthenticationLogsResponseSerializer {

}
