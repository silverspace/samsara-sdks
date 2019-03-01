package org.openapitools.client.model {

import org.openapitools.client.model.UserBase;
import org.openapitools.client.model.UserTagRole;

    [XmlRootNode(name="User")]
    public class User {
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
        /* The ID of the User record. */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. */
        [XmlElement(name="organizationRole")]
        public var organizationRole: String = null;
        /* The specific tags this user has access to. This will be blank for users that have full access to the organization. */
        // This declaration below of _tagRoles_obj_class is to force flash compiler to include this class
        private var _tagRoles_obj_class: Array = null;
        [XmlElementWrapper(name="tagRoles")]
        [XmlElements(name="tagRoles", type="Array")]
                public var tagRoles: Array = new Array();

    public function toString(): String {
        var str: String = "User: ";
        str += " (authType: " + authType + ")";
        str += " (email: " + email + ")";
        str += " (name: " + name + ")";
        str += " (organizationRoleId: " + organizationRoleId + ")";
        str += " (id: " + id + ")";
        str += " (organizationRole: " + organizationRole + ")";
        str += " (tagRoles: " + tagRoles + ")";
        return str;
    }

}

}
