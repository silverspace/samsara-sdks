import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/tagged_vehicle.dart';
import 'package:openapi/model/tagged_asset.dart';
import 'package:openapi/model/tagged_sensor.dart';
import 'package:openapi/model/tagged_driver.dart';
import 'package:openapi/model/tagged_machine.dart';
import 'package:openapi/model/tagged_address.dart';
part 'tag.jser.dart';

class Tag {
   /* The addresses that belong to this tag. */
  @Alias('addresses')
  final List<TaggedAddress> addresses;
   /* The assets that belong to this tag. */
  @Alias('assets')
  final List<TaggedAsset> assets;
   /* The drivers that belong to this tag. */
  @Alias('drivers')
  final List<TaggedDriver> drivers;
   /* The GroupID that this tag belongs to. */
  @Alias('groupId')
  final int groupId;
   /* The ID of this tag. */
  @Alias('id')
  final int id;
   /* The machines that belong to this tag. */
  @Alias('machines')
  final List<TaggedMachine> machines;
   /* Name of this tag. */
  @Alias('name')
  final String name;
   /* If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag. */
  @Alias('parentTagId')
  final int parentTagId;
   /* The sensors that belong to this tag. */
  @Alias('sensors')
  final List<TaggedSensor> sensors;
   /* The vehicles that belong to this tag. */
  @Alias('vehicles')
  final List<TaggedVehicle> vehicles;
  

  Tag(
      

{
     this.addresses = const [],  
     this.assets = const [],  
     this.drivers = const [],  
     this.groupId = null,  
    
     this.id = null,   this.machines = const [],  
    
     this.name = null,   this.parentTagId = null,  
     this.sensors = const [],  
     this.vehicles = const [] 
    
    }
  );

  @override
  String toString() {
    return 'Tag[addresses=$addresses, assets=$assets, drivers=$drivers, groupId=$groupId, id=$id, machines=$machines, name=$name, parentTagId=$parentTagId, sensors=$sensors, vehicles=$vehicles, ]';
  }
}

@GenSerializer(nullableFields: true)
class TagSerializer extends Serializer<Tag> with _$TagSerializer {

}
