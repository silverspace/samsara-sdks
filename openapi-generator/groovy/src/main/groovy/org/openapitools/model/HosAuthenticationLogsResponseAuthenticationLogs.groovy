package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class HosAuthenticationLogsResponseAuthenticationLogs {
    /* The log type - one of 'signin' or 'signout' */
    String actionType

    /* Address at which the log was recorded, if applicable. */
    String address

    /* City in which the log was recorded, if applicable. */
    String city

    /* The time at which the event was recorded in UNIX milliseconds. */
    Long happenedAtMs

    /* Address name from the group address book at which the log was recorded, if applicable. */
    String addressName

    /* State in which the log was recorded, if applicable. */
    String state

}
