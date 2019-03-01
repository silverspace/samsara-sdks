package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.SafetyReportHarshEvent;

    public class VehicleSafetyScoreResponseList implements ListWrapper {
        // This declaration below of _VehicleSafetyScoreResponse_obj_class is to force flash compiler to include this class
        private var _vehicleSafetyScoreResponse_obj_class: org.openapitools.client.model.VehicleSafetyScoreResponse = null;
        [XmlElements(name="vehicleSafetyScoreResponse", type="org.openapitools.client.model.VehicleSafetyScoreResponse")]
        public var vehicleSafetyScoreResponse: Array = new Array();

        public function getList(): Array{
            return vehicleSafetyScoreResponse;
        }

}

}
