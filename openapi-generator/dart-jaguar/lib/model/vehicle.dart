import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'vehicle.jser.dart';

class Vehicle {
   /* Total engine hours for the vehicle. */
  @Alias('engineHours')
  final int engineHours;
   /* The fuel level of the vehicle as a percentage. (0.0 to 1.0) */
  @Alias('fuelLevelPercent')
  final double fuelLevelPercent;
   /* ID of the vehicle. */
  @Alias('id')
  final int id;
   /* Name of the vehicle. */
  @Alias('name')
  final String name;
  
  @Alias('note')
  final String note;
   /* The number of meters reported by the odometer. */
  @Alias('odometerMeters')
  final int odometerMeters;
   /* Vehicle Identification Number. */
  @Alias('vin')
  final String vin;
  

  Vehicle(
      

{
     this.engineHours = null,  
     this.fuelLevelPercent = null,  
    
     this.id = null,   this.name = null,  
     this.note = null,  
     this.odometerMeters = null,  
     this.vin = null 
    
    }
  );

  @override
  String toString() {
    return 'Vehicle[engineHours=$engineHours, fuelLevelPercent=$fuelLevelPercent, id=$id, name=$name, note=$note, odometerMeters=$odometerMeters, vin=$vin, ]';
  }
}

@GenSerializer(nullableFields: true)
class VehicleSerializer extends Serializer<Vehicle> with _$VehicleSerializer {

}
