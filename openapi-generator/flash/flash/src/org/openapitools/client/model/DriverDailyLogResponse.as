package org.openapitools.client.model {

import org.openapitools.client.model.DriverDailyLogResponseDays;

    [XmlRootNode(name="DriverDailyLogResponse")]
    public class DriverDailyLogResponse {
                // This declaration below of _days_obj_class is to force flash compiler to include this class
        private var _days_obj_class: Array = null;
        [XmlElementWrapper(name="days")]
        [XmlElements(name="days", type="Array")]
                public var days: Array = new Array();

    public function toString(): String {
        var str: String = "DriverDailyLogResponse: ";
        str += " (days: " + days + ")";
        return str;
    }

}

}
