package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.SafetyReportHarshEvent;

    public class DriverSafetyScoreResponseList implements ListWrapper {
        // This declaration below of _DriverSafetyScoreResponse_obj_class is to force flash compiler to include this class
        private var _driverSafetyScoreResponse_obj_class: samsara.client.model.DriverSafetyScoreResponse = null;
        [XmlElements(name="driverSafetyScoreResponse", type="samsara.client.model.DriverSafetyScoreResponse")]
        public var driverSafetyScoreResponse: Array = new Array();

        public function getList(): Array{
            return driverSafetyScoreResponse;
        }

}

}
