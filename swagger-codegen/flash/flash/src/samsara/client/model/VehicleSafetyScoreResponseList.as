package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.SafetyReportHarshEvent;

    public class VehicleSafetyScoreResponseList implements ListWrapper {
        // This declaration below of _VehicleSafetyScoreResponse_obj_class is to force flash compiler to include this class
        private var _vehicleSafetyScoreResponse_obj_class: samsara.client.model.VehicleSafetyScoreResponse = null;
        [XmlElements(name="vehicleSafetyScoreResponse", type="samsara.client.model.VehicleSafetyScoreResponse")]
        public var vehicleSafetyScoreResponse: Array = new Array();

        public function getList(): Array{
            return vehicleSafetyScoreResponse;
        }

}

}
