import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/vehicle_maintenance_passenger.dart';
import 'package:openapi/model/vehicle_maintenance_j1939.dart';
part 'vehicle_maintenance.jser.dart';

class VehicleMaintenance {
   /* ID of the vehicle. */
  @Alias('id')
  final int id;
  
  @Alias('j1939')
  final VehicleMaintenanceJ1939 j1939;
  
  @Alias('passenger')
  final VehicleMaintenancePassenger passenger;
  

  VehicleMaintenance(
      

{
    
     this.id = null,   this.j1939 = null,  
     this.passenger = null 
    
    }
  );

  @override
  String toString() {
    return 'VehicleMaintenance[id=$id, j1939=$j1939, passenger=$passenger, ]';
  }
}

@GenSerializer(nullableFields: true)
class VehicleMaintenanceSerializer extends Serializer<VehicleMaintenance> with _$VehicleMaintenanceSerializer {

}
