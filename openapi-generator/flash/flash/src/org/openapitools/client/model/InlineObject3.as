package org.openapitools.client.model {


    [XmlRootNode(name="InlineObject3")]
    public class InlineObject3 {
        /* Group ID to query. */
        [XmlElement(name="groupId")]
        public var groupId: Number = 0;

    public function toString(): String {
        var str: String = "InlineObject3: ";
        str += " (groupId: " + groupId + ")";
        return str;
    }

}

}
