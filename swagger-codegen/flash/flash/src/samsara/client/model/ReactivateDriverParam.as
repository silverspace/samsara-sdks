package samsara.client.model {


    [XmlRootNode(name="ReactivateDriverParam")]
    public class ReactivateDriverParam {
        /* True indicates that this driver should be reactivated. */
        [XmlElement(name="reactivate")]
        public var reactivate: Boolean = false;

    public function toString(): String {
        var str: String = "ReactivateDriverParam: ";
        str += " (reactivate: " + reactivate + ")";
        return str;
    }

}

}
