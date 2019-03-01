import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'data_input_history_response_points.jser.dart';

class DataInputHistoryResponsePoints {
  
  @Alias('value')
  final double value;
  
  @Alias('timeMs')
  final int timeMs;
  

  DataInputHistoryResponsePoints(
      

{
     this.value = null,  
     this.timeMs = null 
    
    }
  );

  @override
  String toString() {
    return 'DataInputHistoryResponsePoints[value=$value, timeMs=$timeMs, ]';
  }
}

@GenSerializer(nullableFields: true)
class DataInputHistoryResponsePointsSerializer extends Serializer<DataInputHistoryResponsePoints> with _$DataInputHistoryResponsePointsSerializer {

}
