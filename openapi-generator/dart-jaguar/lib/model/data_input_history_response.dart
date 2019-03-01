import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/data_input_history_response_points.dart';
part 'data_input_history_response.jser.dart';

class DataInputHistoryResponse {
   /* The ID of this data input */
  @Alias('id')
  final int id;
   /* Name of this data input */
  @Alias('name')
  final String name;
   /* Data points from this data input */
  @Alias('points')
  final List<DataInputHistoryResponsePoints> points;
  

  DataInputHistoryResponse(
      

{
     this.id = null,  
    
     this.name = null,   this.points = const [] 
    
    }
  );

  @override
  String toString() {
    return 'DataInputHistoryResponse[id=$id, name=$name, points=$points, ]';
  }
}

@GenSerializer(nullableFields: true)
class DataInputHistoryResponseSerializer extends Serializer<DataInputHistoryResponse> with _$DataInputHistoryResponseSerializer {

}
