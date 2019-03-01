package samsara.client.model {


    [XmlRootNode(name="UserTagRoleTag")]
    public class UserTagRoleTag {
        /* The ID of this tag. */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* Name of this tag. */
        [XmlElement(name="name")]
        public var name: String = null;
        /* The ID of this tag. */
        [XmlElement(name="parentTagId")]
        public var parentTagId: Number = 0;

    public function toString(): String {
        var str: String = "UserTagRoleTag: ";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        str += " (parentTagId: " + parentTagId + ")";
        return str;
    }

}

}
