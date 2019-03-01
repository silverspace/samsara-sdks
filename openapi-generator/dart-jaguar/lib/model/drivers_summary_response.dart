import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/drivers_summary_response_summaries.dart';
part 'drivers_summary_response.jser.dart';

class DriversSummaryResponse {
  
  @Alias('Summaries')
  final List<DriversSummaryResponseSummaries> summaries;
  

  DriversSummaryResponse(
      

{
     this.summaries = const [] 
    
    }
  );

  @override
  String toString() {
    return 'DriversSummaryResponse[summaries=$summaries, ]';
  }
}

@GenSerializer(nullableFields: true)
class DriversSummaryResponseSerializer extends Serializer<DriversSummaryResponse> with _$DriversSummaryResponseSerializer {

}
