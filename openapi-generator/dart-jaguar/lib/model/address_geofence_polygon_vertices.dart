import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'address_geofence_polygon_vertices.jser.dart';

class AddressGeofencePolygonVertices {
   /* The longitude of a geofence vertex */
  @Alias('latitude')
  final double latitude;
   /* The longitude of a geofence vertex */
  @Alias('longitude')
  final double longitude;
  

  AddressGeofencePolygonVertices(
      

{
     this.latitude = null,  
     this.longitude = null 
    
    }
  );

  @override
  String toString() {
    return 'AddressGeofencePolygonVertices[latitude=$latitude, longitude=$longitude, ]';
  }
}

@GenSerializer(nullableFields: true)
class AddressGeofencePolygonVerticesSerializer extends Serializer<AddressGeofencePolygonVertices> with _$AddressGeofencePolygonVerticesSerializer {

}
