import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'machine_history_response_vibrations.jser.dart';

class MachineHistoryResponseVibrations {
  
  @Alias('X')
  final double X;
  
  @Alias('Y')
  final double Y;
  
  @Alias('Z')
  final double Z;
  
  @Alias('time')
  final int time;
  

  MachineHistoryResponseVibrations(
      

{
     this.X = null,  
     this.Y = null,  
     this.Z = null,  
     this.time = null 
    
    }
  );

  @override
  String toString() {
    return 'MachineHistoryResponseVibrations[X=$X, Y=$Y, Z=$Z, time=$time, ]';
  }
}

@GenSerializer(nullableFields: true)
class MachineHistoryResponseVibrationsSerializer extends Serializer<MachineHistoryResponseVibrations> with _$MachineHistoryResponseVibrationsSerializer {

}
