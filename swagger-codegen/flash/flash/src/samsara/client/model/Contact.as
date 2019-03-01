package samsara.client.model {


    [XmlRootNode(name="Contact")]
    public class Contact {
        /* Email address of the contact */
        [XmlElement(name="email")]
        public var email: String = null;
        /* First name of the contact */
        [XmlElement(name="firstName")]
        public var firstName: String = null;
        /* ID of the contact */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* Last name of the contact */
        [XmlElement(name="lastName")]
        public var lastName: String = null;
        /* Phone number of the contact */
        [XmlElement(name="phone")]
        public var phone: String = null;

    public function toString(): String {
        var str: String = "Contact: ";
        str += " (email: " + email + ")";
        str += " (firstName: " + firstName + ")";
        str += " (id: " + id + ")";
        str += " (lastName: " + lastName + ")";
        str += " (phone: " + phone + ")";
        return str;
    }

}

}
