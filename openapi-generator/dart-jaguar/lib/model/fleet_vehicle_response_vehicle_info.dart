import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'fleet_vehicle_response_vehicle_info.jser.dart';

class FleetVehicleResponseVehicleInfo {
   /* Year of the vehicle. */
  @Alias('year')
  final int year;
   /* Model of the Vehicle. */
  @Alias('model')
  final String model;
   /* Vehicle Identification Number. */
  @Alias('vin')
  final String vin;
   /* Make of the vehicle. */
  @Alias('make')
  final String make;
  

  FleetVehicleResponseVehicleInfo(
      

{
     this.year = null,  
     this.model = null,  
     this.vin = null,  
     this.make = null 
    
    }
  );

  @override
  String toString() {
    return 'FleetVehicleResponseVehicleInfo[year=$year, model=$model, vin=$vin, make=$make, ]';
  }
}

@GenSerializer(nullableFields: true)
class FleetVehicleResponseVehicleInfoSerializer extends Serializer<FleetVehicleResponseVehicleInfo> with _$FleetVehicleResponseVehicleInfoSerializer {

}
