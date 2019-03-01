import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/tagged_vehicle_base.dart';
import 'package:openapi/model/tagged_sensor_base.dart';
import 'package:openapi/model/tagged_asset_base.dart';
import 'package:openapi/model/tagged_machine_base.dart';
import 'package:openapi/model/tagged_driver_base.dart';
part 'tag_modify_add.jser.dart';

class TagModifyAdd {
   /* The assets to be added to this tag. */
  @Alias('assets')
  final List<TaggedAssetBase> assets;
   /* The sensors to be added to this tag. */
  @Alias('sensors')
  final List<TaggedSensorBase> sensors;
   /* The vehicles to be added to this tag. */
  @Alias('vehicles')
  final List<TaggedVehicleBase> vehicles;
   /* The machines to be added to this tag. */
  @Alias('machines')
  final List<TaggedMachineBase> machines;
   /* The drivers to be added to this tag. */
  @Alias('drivers')
  final List<TaggedDriverBase> drivers;
  

  TagModifyAdd(
      

{
     this.assets = const [],  
     this.sensors = const [],  
     this.vehicles = const [],  
     this.machines = const [],  
     this.drivers = const [] 
    
    }
  );

  @override
  String toString() {
    return 'TagModifyAdd[assets=$assets, sensors=$sensors, vehicles=$vehicles, machines=$machines, drivers=$drivers, ]';
  }
}

@GenSerializer(nullableFields: true)
class TagModifyAddSerializer extends Serializer<TagModifyAdd> with _$TagModifyAddSerializer {

}
