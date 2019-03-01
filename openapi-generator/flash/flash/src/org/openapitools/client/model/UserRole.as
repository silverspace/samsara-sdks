package org.openapitools.client.model {


    [XmlRootNode(name="UserRole")]
    public class UserRole {
                [XmlElement(name="id")]
        public var id: String = null;
                [XmlElement(name="name")]
        public var name: String = null;

    public function toString(): String {
        var str: String = "UserRole: ";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        return str;
    }

}

}
