package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.UserTagRoleTag;
@Canonical
class UserTagRole {

  /* The name of the role the user has been granted on this tag. */
  String role = null

  /* The id of the role the user has been granted on this tag. */
  String roleId = null

    UserTagRoleTag tag = null
  

}

