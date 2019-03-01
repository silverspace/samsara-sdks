import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/tagged_vehicle_base.dart';
import 'package:openapi/model/tagged_sensor_base.dart';
import 'package:openapi/model/tagged_asset_base.dart';
import 'package:openapi/model/tagged_machine_base.dart';
import 'package:openapi/model/tagged_driver_base.dart';
part 'tag_update.jser.dart';

class TagUpdate {
   /* The assets that belong to this tag. */
  @Alias('assets')
  final List<TaggedAssetBase> assets;
   /* The drivers that belong to this tag. */
  @Alias('drivers')
  final List<TaggedDriverBase> drivers;
   /* The machines that belong to this tag. */
  @Alias('machines')
  final List<TaggedMachineBase> machines;
   /* Updated name of this tag. */
  @Alias('name')
  final String name;
   /* If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag. */
  @Alias('parentTagId')
  final int parentTagId;
   /* The sensors that belong to this tag. */
  @Alias('sensors')
  final List<TaggedSensorBase> sensors;
   /* The vehicles that belong to this tag. */
  @Alias('vehicles')
  final List<TaggedVehicleBase> vehicles;
  

  TagUpdate(
      

{
     this.assets = const [],  
     this.drivers = const [],  
     this.machines = const [],  
     this.name = null,  
     this.parentTagId = null,  
     this.sensors = const [],  
     this.vehicles = const [] 
    
    }
  );

  @override
  String toString() {
    return 'TagUpdate[assets=$assets, drivers=$drivers, machines=$machines, name=$name, parentTagId=$parentTagId, sensors=$sensors, vehicles=$vehicles, ]';
  }
}

@GenSerializer(nullableFields: true)
class TagUpdateSerializer extends Serializer<TagUpdate> with _$TagUpdateSerializer {

}
