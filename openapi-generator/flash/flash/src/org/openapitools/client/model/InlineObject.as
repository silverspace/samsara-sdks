package org.openapitools.client.model {

import org.openapitools.client.model.AddressesAddresses;

    [XmlRootNode(name="InlineObject")]
    public class InlineObject {
                // This declaration below of _addresses_obj_class is to force flash compiler to include this class
        private var _addresses_obj_class: Array = null;
        [XmlElementWrapper(name="addresses")]
        [XmlElements(name="addresses", type="Array")]
                public var addresses: Array = new Array();

    public function toString(): String {
        var str: String = "InlineObject: ";
        str += " (addresses: " + addresses + ")";
        return str;
    }

}

}
