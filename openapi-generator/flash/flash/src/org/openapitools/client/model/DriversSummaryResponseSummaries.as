package org.openapitools.client.model {


    [XmlRootNode(name="DriversSummaryResponseSummaries")]
    public class DriversSummaryResponseSummaries {
        /* ID of the driver. */
        [XmlElement(name="driverId")]
        public var driverId: Number = 0;
        /* Distance driven in miles, rounded to two decimal places. */
        [XmlElement(name="distanceMiles")]
        public var distanceMiles: Number = 0.0;
        /* Duration in milliseconds that driver was driving during the requested time range */
        [XmlElement(name="driveMs")]
        public var driveMs: Number = 0;
        /* Duration in milliseconds that driver was on duty or driving during the requested time range */
        [XmlElement(name="activeMs")]
        public var activeMs: Number = 0;
        /* Username of the driver. */
        [XmlElement(name="driverUsername")]
        public var driverUsername: String = null;
        /* Group of the driver. */
        [XmlElement(name="groupId")]
        public var groupId: Number = 0;
        /* Name of the driver. */
        [XmlElement(name="driverName")]
        public var driverName: String = null;
        /* Duration in milliseconds that driver was on duty during the requested time range */
        [XmlElement(name="onDutyMs")]
        public var onDutyMs: Number = 0;

    public function toString(): String {
        var str: String = "DriversSummaryResponseSummaries: ";
        str += " (driverId: " + driverId + ")";
        str += " (distanceMiles: " + distanceMiles + ")";
        str += " (driveMs: " + driveMs + ")";
        str += " (activeMs: " + activeMs + ")";
        str += " (driverUsername: " + driverUsername + ")";
        str += " (groupId: " + groupId + ")";
        str += " (driverName: " + driverName + ")";
        str += " (onDutyMs: " + onDutyMs + ")";
        return str;
    }

}

}
