package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AddressGeofencePolygonVertices;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class AddressGeofencePolygon {

  /* The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40. */
  List<AddressGeofencePolygonVertices> vertices = new ArrayList<AddressGeofencePolygonVertices>()
  

}

