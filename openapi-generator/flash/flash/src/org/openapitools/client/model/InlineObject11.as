package org.openapitools.client.model {


    [XmlRootNode(name="InlineObject11")]
    public class InlineObject11 {
        /* Group ID to query. */
        [XmlElement(name="groupId")]
        public var groupId: Number = 0;

    public function toString(): String {
        var str: String = "InlineObject11: ";
        str += " (groupId: " + groupId + ")";
        return str;
    }

}

}
