import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/asset_cable.dart';
import 'package:openapi/model/asset_current_location.dart';
part 'asset_current_locations_response.jser.dart';

class AssetCurrentLocationsResponse {
   /* The cable connected to the asset */
  @Alias('cable')
  final List<AssetCable> cable;
   /* Engine hours */
  @Alias('engineHours')
  final int engineHours;
   /* Asset ID */
  @Alias('id')
  final int id;
   /* Current location of an asset */
  @Alias('location')
  final List<AssetCurrentLocation> location;
   /* Asset name */
  @Alias('name')
  final String name;
  

  AssetCurrentLocationsResponse(
      

{
     this.cable = const [],  
     this.engineHours = null,  
    
     this.id = null,   this.location = const [],  
     this.name = null 
    
    }
  );

  @override
  String toString() {
    return 'AssetCurrentLocationsResponse[cable=$cable, engineHours=$engineHours, id=$id, location=$location, name=$name, ]';
  }
}

@GenSerializer(nullableFields: true)
class AssetCurrentLocationsResponseSerializer extends Serializer<AssetCurrentLocationsResponse> with _$AssetCurrentLocationsResponseSerializer {

}
