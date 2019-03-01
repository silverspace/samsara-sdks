package org.openapitools.client.model {


    [XmlRootNode(name="DvirBaseNextDriverSignature")]
    public class DvirBaseNextDriverSignature {
        /* ID of the driver who signed the DVIR */
        [XmlElement(name="driverId")]
        public var driverId: Number = 0;
        /* The name of the driver who signed the next DVIR on this vehicle. */
        [XmlElement(name="name")]
        public var name: String = null;
        /* The time in millis when the next driver signed the DVIR on this vehicle. */
        [XmlElement(name="signedAt")]
        public var signedAt: Number = 0;
        /* Type corresponds to driver. */
        [XmlElement(name="type")]
        public var type: String = null;
        /* Email of the  driver who signed the next DVIR on this vehicle. */
        [XmlElement(name="email")]
        public var email: String = null;
        /* Username of the  driver who signed the next DVIR on this vehicle. */
        [XmlElement(name="username")]
        public var username: String = null;

    public function toString(): String {
        var str: String = "DvirBaseNextDriverSignature: ";
        str += " (driverId: " + driverId + ")";
        str += " (name: " + name + ")";
        str += " (signedAt: " + signedAt + ")";
        str += " (type: " + type + ")";
        str += " (email: " + email + ")";
        str += " (username: " + username + ")";
        return str;
    }

}

}
