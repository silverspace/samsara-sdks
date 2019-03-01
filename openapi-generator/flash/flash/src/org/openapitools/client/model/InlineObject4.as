package org.openapitools.client.model {


    [XmlRootNode(name="InlineObject4")]
    public class InlineObject4 {
        /* True indicates that this driver should be reactivated. */
        [XmlElement(name="reactivate")]
        public var reactivate: Boolean = false;

    public function toString(): String {
        var str: String = "InlineObject4: ";
        str += " (reactivate: " + reactivate + ")";
        return str;
    }

}

}
