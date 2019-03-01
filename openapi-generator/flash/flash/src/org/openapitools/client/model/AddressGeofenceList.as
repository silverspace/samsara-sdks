package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.AddressGeofenceCircle;
import org.openapitools.client.model.AddressGeofencePolygon;

    public class AddressGeofenceList implements ListWrapper {
        // This declaration below of _AddressGeofence_obj_class is to force flash compiler to include this class
        private var _addressGeofence_obj_class: org.openapitools.client.model.AddressGeofence = null;
        [XmlElements(name="addressGeofence", type="org.openapitools.client.model.AddressGeofence")]
        public var addressGeofence: Array = new Array();

        public function getList(): Array{
            return addressGeofence;
        }

}

}
