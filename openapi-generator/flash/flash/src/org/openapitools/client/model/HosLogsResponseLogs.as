package org.openapitools.client.model {


    [XmlRootNode(name="HosLogsResponseLogs")]
    public class HosLogsResponseLogs {
        /* Longitude at which the log was recorded. */
        [XmlElement(name="locLng")]
        public var locLng: Number = 0.0;
        /* The time at which the log/HOS status started in UNIX milliseconds. */
        [XmlElement(name="logStartMs")]
        public var logStartMs: Number = 0;
        /* ID of the driver. */
        [XmlElement(name="driverId")]
        public var driverId: Number = 0;
        /* The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;. */
        [XmlElement(name="statusType")]
        public var statusType: String = null;
        /* City in which the log was recorded. */
        [XmlElement(name="locCity")]
        public var locCity: String = null;
        /* ID of the group. */
        [XmlElement(name="groupId")]
        public var groupId: Number = 0;
        /* Name of location at which the log was recorded. */
        [XmlElement(name="locName")]
        public var locName: String = null;
        /* Latitude at which the log was recorded. */
        [XmlElement(name="locLat")]
        public var locLat: Number = 0.0;
        /* Remark associated with the log entry. */
        [XmlElement(name="remark")]
        public var remark: String = null;
        /* State in which the log was recorded. */
        [XmlElement(name="locState")]
        public var locState: String = null;
        /* ID of the vehicle. */
        [XmlElement(name="vehicleId")]
        public var vehicleId: Number = 0;
                // This declaration below of _codriverIds_obj_class is to force flash compiler to include this class
        private var _codriverIds_obj_class: Array = null;
        [XmlElementWrapper(name="codriverIds")]
        [XmlElements(name="codriverIds", type="Array")]
                public var codriverIds: Array = new Array();

    public function toString(): String {
        var str: String = "HosLogsResponseLogs: ";
        str += " (locLng: " + locLng + ")";
        str += " (logStartMs: " + logStartMs + ")";
        str += " (driverId: " + driverId + ")";
        str += " (statusType: " + statusType + ")";
        str += " (locCity: " + locCity + ")";
        str += " (groupId: " + groupId + ")";
        str += " (locName: " + locName + ")";
        str += " (locLat: " + locLat + ")";
        str += " (remark: " + remark + ")";
        str += " (locState: " + locState + ")";
        str += " (vehicleId: " + vehicleId + ")";
        str += " (codriverIds: " + codriverIds + ")";
        return str;
    }

}

}
