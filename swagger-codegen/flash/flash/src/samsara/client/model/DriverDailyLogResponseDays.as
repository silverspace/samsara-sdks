package samsara.client.model {

import samsara.client.model.Object;

    [XmlRootNode(name="DriverDailyLogResponseDays")]
    public class DriverDailyLogResponseDays {
        /* Hours spent on duty or driving, rounded to two decimal places. */
        [XmlElement(name="activeHours")]
        public var activeHours: Number = 0.0;
        /* Milliseconds spent on duty or driving. */
        [XmlElement(name="activeMs")]
        public var activeMs: Number = 0;
        /* Whether this HOS day chart was certified by the driver. */
        [XmlElement(name="certified")]
        public var certified: Boolean = false;
        /* Unix epoch time (in ms) of time when this chart was certified. If this chart is uncertified, 0. */
        [XmlElement(name="certifiedAtMs")]
        public var certifiedAtMs: Number = 0;
        /* Distance driven in miles, rounded to two decimal places. */
        [XmlElement(name="distanceMiles")]
        public var distanceMiles: Number = 0.0;
        /* End of the HOS day, specified in milliseconds UNIX time. */
        [XmlElement(name="endMs")]
        public var endMs: Number = NaN;
        /* End of the HOS day, specified in milliseconds UNIX time. */
        [XmlElement(name="startMs")]
        public var startMs: Number = NaN;
        /* List of trailer ID&#39;s associated with the driver for the day. */
        [XmlElement(name="trailerIds")]
        public var trailerIds: Object = NaN;
        /* List of vehicle ID&#39;s associated with the driver for the day. */
        [XmlElement(name="vehicleIds")]
        public var vehicleIds: Object = NaN;

    public function toString(): String {
        var str: String = "DriverDailyLogResponseDays: ";
        str += " (activeHours: " + activeHours + ")";
        str += " (activeMs: " + activeMs + ")";
        str += " (certified: " + certified + ")";
        str += " (certifiedAtMs: " + certifiedAtMs + ")";
        str += " (distanceMiles: " + distanceMiles + ")";
        str += " (endMs: " + endMs + ")";
        str += " (startMs: " + startMs + ")";
        str += " (trailerIds: " + trailerIds + ")";
        str += " (vehicleIds: " + vehicleIds + ")";
        return str;
    }

}

}
