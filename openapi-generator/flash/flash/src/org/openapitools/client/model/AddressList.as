package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.AddressGeofence;
import org.openapitools.client.model.Contact;
import org.openapitools.client.model.TagMetadata;

    public class AddressList implements ListWrapper {
        // This declaration below of _Address_obj_class is to force flash compiler to include this class
        private var _address_obj_class: org.openapitools.client.model.Address = null;
        [XmlElements(name="address", type="org.openapitools.client.model.Address")]
        public var address: Array = new Array();

        public function getList(): Array{
            return address;
        }

}

}
