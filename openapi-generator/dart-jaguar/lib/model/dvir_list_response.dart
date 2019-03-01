import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/dvir_base.dart';
part 'dvir_list_response.jser.dart';

class DvirListResponse {
  
  @Alias('dvirs')
  final List<DvirBase> dvirs;
  

  DvirListResponse(
      

{
     this.dvirs = const [] 
    
    }
  );

  @override
  String toString() {
    return 'DvirListResponse[dvirs=$dvirs, ]';
  }
}

@GenSerializer(nullableFields: true)
class DvirListResponseSerializer extends Serializer<DvirListResponse> with _$DvirListResponseSerializer {

}
