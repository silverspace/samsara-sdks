package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class AddressGeofenceCircleList implements ListWrapper {
        // This declaration below of _AddressGeofence_circle_obj_class is to force flash compiler to include this class
        private var _addressGeofenceCircle_obj_class: samsara.client.model.AddressGeofenceCircle = null;
        [XmlElements(name="addressGeofenceCircle", type="samsara.client.model.AddressGeofenceCircle")]
        public var addressGeofenceCircle: Array = new Array();

        public function getList(): Array{
            return addressGeofenceCircle;
        }

}

}
