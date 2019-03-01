package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.AddressesAddresses;

    public class AddressesList implements ListWrapper {
        // This declaration below of _addresses_obj_class is to force flash compiler to include this class
        private var _addresses_obj_class: samsara.client.model.Addresses = null;
        [XmlElements(name="addresses", type="samsara.client.model.Addresses")]
        public var addresses: Array = new Array();

        public function getList(): Array{
            return addresses;
        }

}

}
