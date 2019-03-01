import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/driver.dart';
part 'drivers_response.jser.dart';

class DriversResponse {
  
  @Alias('drivers')
  final List<Driver> drivers;
  

  DriversResponse(
      

{
     this.drivers = const [] 
    
    }
  );

  @override
  String toString() {
    return 'DriversResponse[drivers=$drivers, ]';
  }
}

@GenSerializer(nullableFields: true)
class DriversResponseSerializer extends Serializer<DriversResponse> with _$DriversResponseSerializer {

}
