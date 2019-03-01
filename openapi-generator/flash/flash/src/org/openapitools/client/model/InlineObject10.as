package org.openapitools.client.model {


    [XmlRootNode(name="InlineObject10")]
    public class InlineObject10 {
        /* Group ID to query. */
        [XmlElement(name="groupId")]
        public var groupId: Number = 0;

    public function toString(): String {
        var str: String = "InlineObject10: ";
        str += " (groupId: " + groupId + ")";
        return str;
    }

}

}
