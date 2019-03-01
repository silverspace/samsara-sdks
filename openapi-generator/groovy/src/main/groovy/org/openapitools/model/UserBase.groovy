package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class UserBase {
    /* The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration. */
    String authType

    /* The email address of this user. */
    String email

    /* The first and last name of the user. */
    String name

    /* The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. */
    String organizationRoleId

}
