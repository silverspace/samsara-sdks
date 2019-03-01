import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'sensors_history_series.jser.dart';

class SensorsHistorySeries {
   /* Field to query. */
  @Alias('field')
  final String field;
  //enum fieldEnum {  ambientTemperature,  probeTemperature,  currentLoop1Raw,  currentLoop1Mapped,  currentLoop2Raw,  currentLoop2Mapped,  pmPowerTotal,  pmPhase1Power,  pmPhase2Power,  pmPhase3Power,  pmPhase1PowerFactor,  pmPhase2PowerFactor,  pmPhase3PowerFactor,  }; /* Sensor ID to query. */
  @Alias('widgetId')
  final int widgetId;
  

  SensorsHistorySeries(
      

{
    
     this.field = null,  
     this.widgetId = null 
    }
  );

  @override
  String toString() {
    return 'SensorsHistorySeries[field=$field, widgetId=$widgetId, ]';
  }
}

@GenSerializer(nullableFields: true)
class SensorsHistorySeriesSerializer extends Serializer<SensorsHistorySeries> with _$SensorsHistorySeriesSerializer {

}
