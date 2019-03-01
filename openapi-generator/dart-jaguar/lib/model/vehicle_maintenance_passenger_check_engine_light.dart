import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'vehicle_maintenance_passenger_check_engine_light.jser.dart';

class VehicleMaintenancePassengerCheckEngineLight {
  
  @Alias('isOn')
  final bool isOn;
  

  VehicleMaintenancePassengerCheckEngineLight(
      

{
     this.isOn = null 
    
    }
  );

  @override
  String toString() {
    return 'VehicleMaintenancePassengerCheckEngineLight[isOn=$isOn, ]';
  }
}

@GenSerializer(nullableFields: true)
class VehicleMaintenancePassengerCheckEngineLightSerializer extends Serializer<VehicleMaintenancePassengerCheckEngineLight> with _$VehicleMaintenancePassengerCheckEngineLightSerializer {

}
