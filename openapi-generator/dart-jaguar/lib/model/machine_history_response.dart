import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/machine_history_response_machines.dart';
part 'machine_history_response.jser.dart';

class MachineHistoryResponse {
  
  @Alias('machines')
  final List<MachineHistoryResponseMachines> machines;
  

  MachineHistoryResponse(
      

{
     this.machines = const [] 
    
    }
  );

  @override
  String toString() {
    return 'MachineHistoryResponse[machines=$machines, ]';
  }
}

@GenSerializer(nullableFields: true)
class MachineHistoryResponseSerializer extends Serializer<MachineHistoryResponse> with _$MachineHistoryResponseSerializer {

}
