import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/sensors_history_series.dart';
part 'inline_object21.jser.dart';

class InlineObject21 {
   /* End of the time range, specified in milliseconds UNIX time. */
  @Alias('endMs')
  final int endMs;
  
  @Alias('fillMissing')
  final String fillMissing;
  //enum fillMissingEnum {  withNull,  withPrevious,  }; /* Group ID to query. */
  @Alias('groupId')
  final int groupId;
  
  @Alias('series')
  final List<SensorsHistorySeries> series;
   /* Beginning of the time range, specified in milliseconds UNIX time. */
  @Alias('startMs')
  final int startMs;
   /* Time resolution for which data should be returned, in milliseconds. Specifying 3600000 will return data at hour intervals. */
  @Alias('stepMs')
  final int stepMs;
  

  InlineObject21(
      

{
    
     this.endMs = null,   this.fillMissing = "withNull",  
    
     this.groupId = null,  
     this.series = const [],  
     this.startMs = null,  
     this.stepMs = null 
    }
  );

  @override
  String toString() {
    return 'InlineObject21[endMs=$endMs, fillMissing=$fillMissing, groupId=$groupId, series=$series, startMs=$startMs, stepMs=$stepMs, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObject21Serializer extends Serializer<InlineObject21> with _$InlineObject21Serializer {

}
