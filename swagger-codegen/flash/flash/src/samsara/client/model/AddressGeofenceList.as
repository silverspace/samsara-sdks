package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.AddressGeofenceCircle;
import samsara.client.model.AddressGeofencePolygon;

    public class AddressGeofenceList implements ListWrapper {
        // This declaration below of _AddressGeofence_obj_class is to force flash compiler to include this class
        private var _addressGeofence_obj_class: samsara.client.model.AddressGeofence = null;
        [XmlElements(name="addressGeofence", type="samsara.client.model.AddressGeofence")]
        public var addressGeofence: Array = new Array();

        public function getList(): Array{
            return addressGeofence;
        }

}

}
