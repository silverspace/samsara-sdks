package org.openapitools.client.model {

import org.openapitools.client.model.SafetyReportHarshEvent;

    [XmlRootNode(name="VehicleSafetyScoreResponse")]
    public class VehicleSafetyScoreResponse {
        /* Crash event count */
        [XmlElement(name="crashCount")]
        public var crashCount: Number = 0;
        /* Harsh acceleration event count */
        [XmlElement(name="harshAccelCount")]
        public var harshAccelCount: Number = 0;
        /* Harsh braking event count */
        [XmlElement(name="harshBrakingCount")]
        public var harshBrakingCount: Number = 0;
                // This declaration below of _harshEvents_obj_class is to force flash compiler to include this class
        private var _harshEvents_obj_class: Array = null;
        [XmlElementWrapper(name="harshEvents")]
        [XmlElements(name="harshEvents", type="Array")]
                public var harshEvents: Array = new Array();
        /* Harsh turning event count */
        [XmlElement(name="harshTurningCount")]
        public var harshTurningCount: Number = 0;
        /* Safety Score */
        [XmlElement(name="safetyScore")]
        public var safetyScore: Number = 0;
        /* Safety Score Rank */
        [XmlElement(name="safetyScoreRank")]
        public var safetyScoreRank: String = null;
        /* Amount of time driven over the speed limit in milliseconds */
        [XmlElement(name="timeOverSpeedLimitMs")]
        public var timeOverSpeedLimitMs: Number = 0;
        /* Total distance driven in meters */
        [XmlElement(name="totalDistanceDrivenMeters")]
        public var totalDistanceDrivenMeters: Number = 0;
        /* Total harsh event count */
        [XmlElement(name="totalHarshEventCount")]
        public var totalHarshEventCount: Number = 0;
        /* Amount of time driven in milliseconds */
        [XmlElement(name="totalTimeDrivenMs")]
        public var totalTimeDrivenMs: Number = 0;
        /* Vehicle ID */
        [XmlElement(name="vehicleId")]
        public var vehicleId: Number = 0;

    public function toString(): String {
        var str: String = "VehicleSafetyScoreResponse: ";
        str += " (crashCount: " + crashCount + ")";
        str += " (harshAccelCount: " + harshAccelCount + ")";
        str += " (harshBrakingCount: " + harshBrakingCount + ")";
        str += " (harshEvents: " + harshEvents + ")";
        str += " (harshTurningCount: " + harshTurningCount + ")";
        str += " (safetyScore: " + safetyScore + ")";
        str += " (safetyScoreRank: " + safetyScoreRank + ")";
        str += " (timeOverSpeedLimitMs: " + timeOverSpeedLimitMs + ")";
        str += " (totalDistanceDrivenMeters: " + totalDistanceDrivenMeters + ")";
        str += " (totalHarshEventCount: " + totalHarshEventCount + ")";
        str += " (totalTimeDrivenMs: " + totalTimeDrivenMs + ")";
        str += " (vehicleId: " + vehicleId + ")";
        return str;
    }

}

}
