package samsara.client.model {

import samsara.client.model.AddressesAddresses;

    [XmlRootNode(name="Addresses")]
    public class Addresses {
                // This declaration below of _addresses_obj_class is to force flash compiler to include this class
        private var _addresses_obj_class: Array = null;
        [XmlElementWrapper(name="addresses")]
        [XmlElements(name="addresses", type="Array")]
                public var addresses: Array = new Array();

    public function toString(): String {
        var str: String = "Addresses: ";
        str += " (addresses: " + addresses + ")";
        return str;
    }

}

}
