import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/aux_input_series.dart';
import 'package:openapi/model/engine_state.dart';
part 'inline_response2005_vehicle_stats.jser.dart';

class InlineResponse2005VehicleStats {
  
  @Alias('engineState')
  final List<EngineState> engineState;
  
  @Alias('auxInput2')
  final AuxInputSeries auxInput2;
   /* ID of the vehicle. */
  @Alias('vehicleId')
  final int vehicleId;
  
  @Alias('auxInput1')
  final AuxInputSeries auxInput1;
  

  InlineResponse2005VehicleStats(
      

{
     this.engineState = const [],  
     this.auxInput2 = null,  
    
     this.vehicleId = null,   this.auxInput1 = null 
    
    }
  );

  @override
  String toString() {
    return 'InlineResponse2005VehicleStats[engineState=$engineState, auxInput2=$auxInput2, vehicleId=$vehicleId, auxInput1=$auxInput1, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineResponse2005VehicleStatsSerializer extends Serializer<InlineResponse2005VehicleStats> with _$InlineResponse2005VehicleStatsSerializer {

}
