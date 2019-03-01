package samsara.client.model {


    [XmlRootNode(name="DvirBaseMechanicOrAgentSignature")]
    public class DvirBaseMechanicOrAgentSignature {
        /* ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned. */
        [XmlElement(name="driverId")]
        public var driverId: Number = 0;
        /* Email of the  agent|mechanic who signed the DVIR. */
        [XmlElement(name="email")]
        public var email: String = null;
        /* ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned. */
        [XmlElement(name="mechanicUserId")]
        public var mechanicUserId: Number = 0;
        /* The name of the agent or mechanic who signed the DVIR. */
        [XmlElement(name="name")]
        public var name: String = null;
        /* The time in millis when the DVIR was signed */
        [XmlElement(name="signedAt")]
        public var signedAt: Number = 0;
        /* Type corresponds to whether the signature corresponds to driver|mechanic. */
        [XmlElement(name="type")]
        public var type: String = null;
        /* Username of the  agent|mechanic who signed the DVIR. */
        [XmlElement(name="username")]
        public var username: String = null;

    public function toString(): String {
        var str: String = "DvirBaseMechanicOrAgentSignature: ";
        str += " (driverId: " + driverId + ")";
        str += " (email: " + email + ")";
        str += " (mechanicUserId: " + mechanicUserId + ")";
        str += " (name: " + name + ")";
        str += " (signedAt: " + signedAt + ")";
        str += " (type: " + type + ")";
        str += " (username: " + username + ")";
        return str;
    }

}

}
