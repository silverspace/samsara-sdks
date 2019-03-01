package org.openapitools.client.model {

import org.openapitools.client.model.UserTagRoleTag;

    [XmlRootNode(name="UserTagRole")]
    public class UserTagRole {
        /* The name of the role the user has been granted on this tag. */
        [XmlElement(name="role")]
        public var role: String = null;
        /* The id of the role the user has been granted on this tag. */
        [XmlElement(name="roleId")]
        public var roleId: String = null;
                [XmlElement(name="tag")]
        public var tag: UserTagRoleTag = NaN;

    public function toString(): String {
        var str: String = "UserTagRole: ";
        str += " (role: " + role + ")";
        str += " (roleId: " + roleId + ")";
        str += " (tag: " + tag + ")";
        return str;
    }

}

}
