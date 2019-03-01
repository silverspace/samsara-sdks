import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/machine_history_response_vibrations.dart';
part 'machine_history_response_machines.jser.dart';

class MachineHistoryResponseMachines {
   /* Machine name */
  @Alias('name')
  final String name;
   /* Machine ID */
  @Alias('id')
  final int id;
   /* List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s */
  @Alias('vibrations')
  final List<MachineHistoryResponseVibrations> vibrations;
  

  MachineHistoryResponseMachines(
      

{
     this.name = null,  
     this.id = null,  
     this.vibrations = const [] 
    
    }
  );

  @override
  String toString() {
    return 'MachineHistoryResponseMachines[name=$name, id=$id, vibrations=$vibrations, ]';
  }
}

@GenSerializer(nullableFields: true)
class MachineHistoryResponseMachinesSerializer extends Serializer<MachineHistoryResponseMachines> with _$MachineHistoryResponseMachinesSerializer {

}
