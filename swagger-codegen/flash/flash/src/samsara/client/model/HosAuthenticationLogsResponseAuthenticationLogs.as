package samsara.client.model {


    [XmlRootNode(name="HosAuthenticationLogsResponseAuthenticationLogs")]
    public class HosAuthenticationLogsResponseAuthenticationLogs {
        /* The log type - one of &#39;signin&#39; or &#39;signout&#39; */
        [XmlElement(name="actionType")]
        public var actionType: String = null;
        /* Address at which the log was recorded, if applicable. */
        [XmlElement(name="address")]
        public var address: String = null;
        /* Address name from the group address book at which the log was recorded, if applicable. */
        [XmlElement(name="addressName")]
        public var addressName: String = null;
        /* City in which the log was recorded, if applicable. */
        [XmlElement(name="city")]
        public var city: String = null;
        /* The time at which the event was recorded in UNIX milliseconds. */
        [XmlElement(name="happenedAtMs")]
        public var happenedAtMs: Number = 0;
        /* State in which the log was recorded, if applicable. */
        [XmlElement(name="state")]
        public var state: String = null;

    public function toString(): String {
        var str: String = "HosAuthenticationLogsResponseAuthenticationLogs: ";
        str += " (actionType: " + actionType + ")";
        str += " (address: " + address + ")";
        str += " (addressName: " + addressName + ")";
        str += " (city: " + city + ")";
        str += " (happenedAtMs: " + happenedAtMs + ")";
        str += " (state: " + state + ")";
        return str;
    }

}

}
