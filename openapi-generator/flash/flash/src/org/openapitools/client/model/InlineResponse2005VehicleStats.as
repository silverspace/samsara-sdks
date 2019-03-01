package org.openapitools.client.model {

import org.openapitools.client.model.AuxInputSeries;
import org.openapitools.client.model.EngineState;

    [XmlRootNode(name="InlineResponse2005VehicleStats")]
    public class InlineResponse2005VehicleStats {
                // This declaration below of _engineState_obj_class is to force flash compiler to include this class
        private var _engineState_obj_class: Array = null;
        [XmlElementWrapper(name="engineState")]
        [XmlElements(name="engineState", type="Array")]
                public var engineState: Array = new Array();
                [XmlElement(name="auxInput2")]
        public var auxInput2: AuxInputSeries = NaN;
        /* ID of the vehicle. */
        [XmlElement(name="vehicleId")]
        public var vehicleId: Number = 0;
                [XmlElement(name="auxInput1")]
        public var auxInput1: AuxInputSeries = NaN;

    public function toString(): String {
        var str: String = "InlineResponse2005VehicleStats: ";
        str += " (engineState: " + engineState + ")";
        str += " (auxInput2: " + auxInput2 + ")";
        str += " (vehicleId: " + vehicleId + ")";
        str += " (auxInput1: " + auxInput1 + ")";
        return str;
    }

}

}
