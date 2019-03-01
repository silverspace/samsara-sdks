import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/address_geofence_polygon.dart';
import 'package:openapi/model/address_geofence_circle.dart';
part 'address_geofence.jser.dart';

class AddressGeofence {
  
  @Alias('circle')
  final AddressGeofenceCircle circle;
  
  @Alias('polygon')
  final AddressGeofencePolygon polygon;
  

  AddressGeofence(
      

{
     this.circle = null,  
     this.polygon = null 
    
    }
  );

  @override
  String toString() {
    return 'AddressGeofence[circle=$circle, polygon=$polygon, ]';
  }
}

@GenSerializer(nullableFields: true)
class AddressGeofenceSerializer extends Serializer<AddressGeofence> with _$AddressGeofenceSerializer {

}
