package samsara.client.model {

import samsara.client.model.VehicleHarshEventResponseLocation;

    [XmlRootNode(name="VehicleHarshEventResponse")]
    public class VehicleHarshEventResponse {
        /* URL for downloading the forward facing video */
        [XmlElement(name="downloadForwardVideoUrl")]
        public var downloadForwardVideoUrl: String = null;
        /* URL for downloading the inward facing video */
        [XmlElement(name="downloadInwardVideoUrl")]
        public var downloadInwardVideoUrl: String = null;
        /* URL for downloading the tracked inward facing video */
        [XmlElement(name="downloadTrackedInwardVideoUrl")]
        public var downloadTrackedInwardVideoUrl: String = null;
        /* Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event] */
        [XmlElement(name="harshEventType")]
        public var harshEventType: String = null;
        /* URL of the associated incident report page */
        [XmlElement(name="incidentReportUrl")]
        public var incidentReportUrl: String = null;
        /* Whether the driver was deemed distracted during this harsh event */
        [XmlElement(name="isDistracted")]
        public var isDistracted: Boolean = false;
                [XmlElement(name="location")]
        public var location: VehicleHarshEventResponseLocation = NaN;

    public function toString(): String {
        var str: String = "VehicleHarshEventResponse: ";
        str += " (downloadForwardVideoUrl: " + downloadForwardVideoUrl + ")";
        str += " (downloadInwardVideoUrl: " + downloadInwardVideoUrl + ")";
        str += " (downloadTrackedInwardVideoUrl: " + downloadTrackedInwardVideoUrl + ")";
        str += " (harshEventType: " + harshEventType + ")";
        str += " (incidentReportUrl: " + incidentReportUrl + ")";
        str += " (isDistracted: " + isDistracted + ")";
        str += " (location: " + location + ")";
        return str;
    }

}

}
