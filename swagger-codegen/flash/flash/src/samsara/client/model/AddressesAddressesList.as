package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.AddressGeofence;
import samsara.client.model.AddressNotes;
import samsara.client.model.ContactIds;
import samsara.client.model.TagIds;

    public class AddressesAddressesList implements ListWrapper {
        // This declaration below of _addresses_addresses_obj_class is to force flash compiler to include this class
        private var _addressesAddresses_obj_class: samsara.client.model.AddressesAddresses = null;
        [XmlElements(name="addressesAddresses", type="samsara.client.model.AddressesAddresses")]
        public var addressesAddresses: Array = new Array();

        public function getList(): Array{
            return addressesAddresses;
        }

}

}
