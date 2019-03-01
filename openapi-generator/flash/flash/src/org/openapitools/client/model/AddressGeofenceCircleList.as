package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class AddressGeofenceCircleList implements ListWrapper {
        // This declaration below of _AddressGeofence_circle_obj_class is to force flash compiler to include this class
        private var _addressGeofenceCircle_obj_class: org.openapitools.client.model.AddressGeofenceCircle = null;
        [XmlElements(name="addressGeofenceCircle", type="org.openapitools.client.model.AddressGeofenceCircle")]
        public var addressGeofenceCircle: Array = new Array();

        public function getList(): Array{
            return addressGeofenceCircle;
        }

}

}
