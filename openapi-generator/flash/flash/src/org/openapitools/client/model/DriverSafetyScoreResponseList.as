package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.SafetyReportHarshEvent;

    public class DriverSafetyScoreResponseList implements ListWrapper {
        // This declaration below of _DriverSafetyScoreResponse_obj_class is to force flash compiler to include this class
        private var _driverSafetyScoreResponse_obj_class: org.openapitools.client.model.DriverSafetyScoreResponse = null;
        [XmlElements(name="driverSafetyScoreResponse", type="org.openapitools.client.model.DriverSafetyScoreResponse")]
        public var driverSafetyScoreResponse: Array = new Array();

        public function getList(): Array{
            return driverSafetyScoreResponse;
        }

}

}
