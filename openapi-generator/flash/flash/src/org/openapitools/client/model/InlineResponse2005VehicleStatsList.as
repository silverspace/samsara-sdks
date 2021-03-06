package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.AuxInputSeries;
import org.openapitools.client.model.EngineState;

    public class InlineResponse2005VehicleStatsList implements ListWrapper {
        // This declaration below of _inline_response_200_5_vehicleStats_obj_class is to force flash compiler to include this class
        private var _inlineResponse2005VehicleStats_obj_class: org.openapitools.client.model.InlineResponse2005VehicleStats = null;
        [XmlElements(name="inlineResponse2005VehicleStats", type="org.openapitools.client.model.InlineResponse2005VehicleStats")]
        public var inlineResponse2005VehicleStats: Array = new Array();

        public function getList(): Array{
            return inlineResponse2005VehicleStats;
        }

}

}
