package samsara.client.model {

import samsara.client.model.SafetyReportHarshEvent;

    [XmlRootNode(name="DriverSafetyScoreResponse")]
    public class DriverSafetyScoreResponse {
        /* Crash event count */
        [XmlElement(name="crashCount")]
        public var crashCount: Number = NaN;
        /* Driver ID */
        [XmlElement(name="driverId")]
        public var driverId: Number = NaN;
        /* Harsh acceleration event count */
        [XmlElement(name="harshAccelCount")]
        public var harshAccelCount: Number = NaN;
        /* Harsh braking event count */
        [XmlElement(name="harshBrakingCount")]
        public var harshBrakingCount: Number = NaN;
                // This declaration below of _harshEvents_obj_class is to force flash compiler to include this class
        private var _harshEvents_obj_class: Array = null;
        [XmlElementWrapper(name="harshEvents")]
        [XmlElements(name="harshEvents", type="Array")]
                public var harshEvents: Array = new Array();
        /* Harsh turning event count */
        [XmlElement(name="harshTurningCount")]
        public var harshTurningCount: Number = NaN;
        /* Safety Score */
        [XmlElement(name="safetyScore")]
        public var safetyScore: Number = NaN;
        /* Safety Score Rank */
        [XmlElement(name="safetyScoreRank")]
        public var safetyScoreRank: String = null;
        /* Amount of time driven over the speed limit in milliseconds */
        [XmlElement(name="timeOverSpeedLimitMs")]
        public var timeOverSpeedLimitMs: Number = NaN;
        /* Total distance driven in meters */
        [XmlElement(name="totalDistanceDrivenMeters")]
        public var totalDistanceDrivenMeters: Number = NaN;
        /* Total harsh event count */
        [XmlElement(name="totalHarshEventCount")]
        public var totalHarshEventCount: Number = NaN;
        /* Amount of time driven in milliseconds */
        [XmlElement(name="totalTimeDrivenMs")]
        public var totalTimeDrivenMs: Number = NaN;

    public function toString(): String {
        var str: String = "DriverSafetyScoreResponse: ";
        str += " (crashCount: " + crashCount + ")";
        str += " (driverId: " + driverId + ")";
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
        return str;
    }

}

}
