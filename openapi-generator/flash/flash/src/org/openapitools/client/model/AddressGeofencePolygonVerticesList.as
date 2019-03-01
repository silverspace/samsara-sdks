package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class AddressGeofencePolygonVerticesList implements ListWrapper {
        // This declaration below of _AddressGeofence_polygon_vertices_obj_class is to force flash compiler to include this class
        private var _addressGeofencePolygonVertices_obj_class: org.openapitools.client.model.AddressGeofencePolygonVertices = null;
        [XmlElements(name="addressGeofencePolygonVertices", type="org.openapitools.client.model.AddressGeofencePolygonVertices")]
        public var addressGeofencePolygonVertices: Array = new Array();

        public function getList(): Array{
            return addressGeofencePolygonVertices;
        }

}

}
