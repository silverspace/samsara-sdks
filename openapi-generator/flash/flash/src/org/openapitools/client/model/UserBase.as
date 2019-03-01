package org.openapitools.client.model {


    [XmlRootNode(name="UserBase")]
    public class UserBase {
        /* The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration. */
        [XmlElement(name="authType")]
        public var authType: String = null;
        /* The email address of this user. */
        [XmlElement(name="email")]
        public var email: String = null;
        /* The first and last name of the user. */
        [XmlElement(name="name")]
        public var name: String = null;
        /* The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. */
        [XmlElement(name="organizationRoleId")]
        public var organizationRoleId: String = null;

    public function toString(): String {
        var str: String = "UserBase: ";
        str += " (authType: " + authType + ")";
        str += " (email: " + email + ")";
        str += " (name: " + name + ")";
        str += " (organizationRoleId: " + organizationRoleId + ")";
        return str;
    }

}

}
