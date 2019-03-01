import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/address_geofence_polygon_vertices.dart';
part 'address_geofence_polygon.jser.dart';

class AddressGeofencePolygon {
   /* The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40. */
  @Alias('vertices')
  final List<AddressGeofencePolygonVertices> vertices;
  

  AddressGeofencePolygon(
      

{
     this.vertices = const [] 
    
    }
  );

  @override
  String toString() {
    return 'AddressGeofencePolygon[vertices=$vertices, ]';
  }
}

@GenSerializer(nullableFields: true)
class AddressGeofencePolygonSerializer extends Serializer<AddressGeofencePolygon> with _$AddressGeofencePolygonSerializer {

}
