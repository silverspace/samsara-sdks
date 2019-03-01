package org.openapitools.client.model {

import org.openapitools.client.model.Driver;

    [XmlRootNode(name="DriversResponse")]
    public class DriversResponse {
                // This declaration below of _drivers_obj_class is to force flash compiler to include this class
        private var _drivers_obj_class: Array = null;
        [XmlElementWrapper(name="drivers")]
        [XmlElements(name="drivers", type="Array")]
                public var drivers: Array = new Array();

    public function toString(): String {
        var str: String = "DriversResponse: ";
        str += " (drivers: " + drivers + ")";
        return str;
    }

}

}
