package samsara.client.model {


    [XmlRootNode(name="HosLogsResponseLogs")]
    public class HosLogsResponseLogs {
                // This declaration below of _codriverIds_obj_class is to force flash compiler to include this class
        private var _codriverIds_obj_class: Array = null;
        [XmlElementWrapper(name="codriverIds")]
        [XmlElements(name="codriverIds", type="Array")]
                public var codriverIds: Array = new Array();
        /* ID of the driver. */
        [XmlElement(name="driverId")]
        public var driverId: Number = 0;
        /* ID of the group. */
        [XmlElement(name="groupId")]
        public var groupId: Number = 0;
        /* City in which the log was recorded. */
        [XmlElement(name="locCity")]
        public var locCity: String = null;
        /* Latitude at which the log was recorded. */
        [XmlElement(name="locLat")]
        public var locLat: Number = 0.0;
        /* Longitude at which the log was recorded. */
        [XmlElement(name="locLng")]
        public var locLng: Number = 0.0;
        /* Name of location at which the log was recorded. */
        [XmlElement(name="locName")]
        public var locName: String = null;
        /* State in which the log was recorded. */
        [XmlElement(name="locState")]
        public var locState: String = null;
        /* The time at which the log/HOS status started in UNIX milliseconds. */
        [XmlElement(name="logStartMs")]
        public var logStartMs: Number = 0;
        /* Remark associated with the log entry. */
        [XmlElement(name="remark")]
        public var remark: String = null;
        /* The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;. */
        [XmlElement(name="statusType")]
        public var statusType: String = null;
        /* ID of the vehicle. */
        [XmlElement(name="vehicleId")]
        public var vehicleId: Number = 0;

    public function toString(): String {
        var str: String = "HosLogsResponseLogs: ";
        str += " (codriverIds: " + codriverIds + ")";
        str += " (driverId: " + driverId + ")";
        str += " (groupId: " + groupId + ")";
        str += " (locCity: " + locCity + ")";
        str += " (locLat: " + locLat + ")";
        str += " (locLng: " + locLng + ")";
        str += " (locName: " + locName + ")";
        str += " (locState: " + locState + ")";
        str += " (logStartMs: " + logStartMs + ")";
        str += " (remark: " + remark + ")";
        str += " (statusType: " + statusType + ")";
        str += " (vehicleId: " + vehicleId + ")";
        return str;
    }

}

}
