package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.AddressGeofencePolygonVertices;

    public class AddressGeofencePolygonList implements ListWrapper {
        // This declaration below of _AddressGeofence_polygon_obj_class is to force flash compiler to include this class
        private var _addressGeofencePolygon_obj_class: samsara.client.model.AddressGeofencePolygon = null;
        [XmlElements(name="addressGeofencePolygon", type="samsara.client.model.AddressGeofencePolygon")]
        public var addressGeofencePolygon: Array = new Array();

        public function getList(): Array{
            return addressGeofencePolygon;
        }

}

}
