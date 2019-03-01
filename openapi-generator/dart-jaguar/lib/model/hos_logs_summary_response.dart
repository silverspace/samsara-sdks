import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/hos_logs_summary_response_drivers.dart';
part 'hos_logs_summary_response.jser.dart';

class HosLogsSummaryResponse {
  
  @Alias('drivers')
  final List<HosLogsSummaryResponseDrivers> drivers;
  

  HosLogsSummaryResponse(
      

{
     this.drivers = const [] 
    
    }
  );

  @override
  String toString() {
    return 'HosLogsSummaryResponse[drivers=$drivers, ]';
  }
}

@GenSerializer(nullableFields: true)
class HosLogsSummaryResponseSerializer extends Serializer<HosLogsSummaryResponse> with _$HosLogsSummaryResponseSerializer {

}
