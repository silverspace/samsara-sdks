package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AddressGeofencePolygonVertices;

@Canonical
class AddressGeofencePolygon {
    /* The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40. */
    List<AddressGeofencePolygonVertices> vertices = new ArrayList<AddressGeofencePolygonVertices>()

}
