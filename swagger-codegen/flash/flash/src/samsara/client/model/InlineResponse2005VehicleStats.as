package samsara.client.model {

import samsara.client.model.AuxInputSeries;
import samsara.client.model.EngineState;

    [XmlRootNode(name="InlineResponse2005VehicleStats")]
    public class InlineResponse2005VehicleStats {
                [XmlElement(name="auxInput1")]
        public var auxInput1: AuxInputSeries = NaN;
                [XmlElement(name="auxInput2")]
        public var auxInput2: AuxInputSeries = NaN;
                // This declaration below of _engineState_obj_class is to force flash compiler to include this class
        private var _engineState_obj_class: Array = null;
        [XmlElementWrapper(name="engineState")]
        [XmlElements(name="engineState", type="Array")]
                public var engineState: Array = new Array();
        /* ID of the vehicle. */
        [XmlElement(name="vehicleId")]
        public var vehicleId: Number = 0;

    public function toString(): String {
        var str: String = "InlineResponse2005VehicleStats: ";
        str += " (auxInput1: " + auxInput1 + ")";
        str += " (auxInput2: " + auxInput2 + ")";
        str += " (engineState: " + engineState + ")";
        str += " (vehicleId: " + vehicleId + ")";
        return str;
    }

}

}
