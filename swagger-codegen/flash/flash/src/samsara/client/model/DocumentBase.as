package samsara.client.model {


    [XmlRootNode(name="DocumentBase")]
    public class DocumentBase {
        /* ID of the Samsara dispatch job for which the document is submitted */
        [XmlElement(name="dispatchJobId")]
        public var dispatchJobId: Number = 0;
        /* Notes submitted with this document. */
        [XmlElement(name="notes")]
        public var notes: String = null;

    public function toString(): String {
        var str: String = "DocumentBase: ";
        str += " (dispatchJobId: " + dispatchJobId + ")";
        str += " (notes: " + notes + ")";
        return str;
    }

}

}
