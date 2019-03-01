package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class HosAuthenticationLogsResponseAuthenticationLogs {

  /* The log type - one of 'signin' or 'signout' */
  String actionType = null

  /* Address at which the log was recorded, if applicable. */
  String address = null

  /* Address name from the group address book at which the log was recorded, if applicable. */
  String addressName = null

  /* City in which the log was recorded, if applicable. */
  String city = null

  /* The time at which the event was recorded in UNIX milliseconds. */
  Long happenedAtMs = null

  /* State in which the log was recorded, if applicable. */
  String state = null
  

}

