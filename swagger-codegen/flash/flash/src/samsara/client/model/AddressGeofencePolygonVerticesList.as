package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class AddressGeofencePolygonVerticesList implements ListWrapper {
        // This declaration below of _AddressGeofence_polygon_vertices_obj_class is to force flash compiler to include this class
        private var _addressGeofencePolygonVertices_obj_class: samsara.client.model.AddressGeofencePolygonVertices = null;
        [XmlElements(name="addressGeofencePolygonVertices", type="samsara.client.model.AddressGeofencePolygonVertices")]
        public var addressGeofencePolygonVertices: Array = new Array();

        public function getList(): Array{
            return addressGeofencePolygonVertices;
        }

}

}
