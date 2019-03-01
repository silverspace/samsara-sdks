package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.UserTagRoleTag;

@Canonical
class UserTagRole {
    /* The name of the role the user has been granted on this tag. */
    String role

    /* The id of the role the user has been granted on this tag. */
    String roleId

    UserTagRoleTag tag = null

}
