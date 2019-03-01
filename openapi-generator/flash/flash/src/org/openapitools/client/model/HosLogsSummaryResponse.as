package org.openapitools.client.model {

import org.openapitools.client.model.HosLogsSummaryResponseDrivers;

    [XmlRootNode(name="HosLogsSummaryResponse")]
    public class HosLogsSummaryResponse {
                // This declaration below of _drivers_obj_class is to force flash compiler to include this class
        private var _drivers_obj_class: Array = null;
        [XmlElementWrapper(name="drivers")]
        [XmlElements(name="drivers", type="Array")]
                public var drivers: Array = new Array();

    public function toString(): String {
        var str: String = "HosLogsSummaryResponse: ";
        str += " (drivers: " + drivers + ")";
        return str;
    }

}

}
