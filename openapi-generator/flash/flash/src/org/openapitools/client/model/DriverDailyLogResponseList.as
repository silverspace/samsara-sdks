package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DriverDailyLogResponseDays;

    public class DriverDailyLogResponseList implements ListWrapper {
        // This declaration below of _DriverDailyLogResponse_obj_class is to force flash compiler to include this class
        private var _driverDailyLogResponse_obj_class: org.openapitools.client.model.DriverDailyLogResponse = null;
        [XmlElements(name="driverDailyLogResponse", type="org.openapitools.client.model.DriverDailyLogResponse")]
        public var driverDailyLogResponse: Array = new Array();

        public function getList(): Array{
            return driverDailyLogResponse;
        }

}

}
