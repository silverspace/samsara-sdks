import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/driver_daily_log_response_days.dart';
part 'driver_daily_log_response.jser.dart';

class DriverDailyLogResponse {
  
  @Alias('days')
  final List<DriverDailyLogResponseDays> days;
  

  DriverDailyLogResponse(
      

{
     this.days = const [] 
    
    }
  );

  @override
  String toString() {
    return 'DriverDailyLogResponse[days=$days, ]';
  }
}

@GenSerializer(nullableFields: true)
class DriverDailyLogResponseSerializer extends Serializer<DriverDailyLogResponse> with _$DriverDailyLogResponseSerializer {

}
