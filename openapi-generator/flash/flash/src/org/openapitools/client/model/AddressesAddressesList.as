package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.AddressGeofence;

    public class AddressesAddressesList implements ListWrapper {
        // This declaration below of __addresses_addresses_obj_class is to force flash compiler to include this class
        private var _addressesAddresses_obj_class: org.openapitools.client.model.AddressesAddresses = null;
        [XmlElements(name="addressesAddresses", type="org.openapitools.client.model.AddressesAddresses")]
        public var addressesAddresses: Array = new Array();

        public function getList(): Array{
            return addressesAddresses;
        }

}

}
