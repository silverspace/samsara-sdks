package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param actionType The log type - one of 'signin' or 'signout'
 * @param address Address at which the log was recorded, if applicable.
 * @param city City in which the log was recorded, if applicable.
 * @param happenedAtMs The time at which the event was recorded in UNIX milliseconds.
 * @param addressName Address name from the group address book at which the log was recorded, if applicable.
 * @param state State in which the log was recorded, if applicable.
 */
data class HosAuthenticationLogsResponseAuthenticationLogs (

        @JsonProperty("actionType") val actionType: String? = null,

        @JsonProperty("address") val address: String? = null,

        @JsonProperty("city") val city: String? = null,

        @JsonProperty("happenedAtMs") val happenedAtMs: Long? = null,

        @JsonProperty("addressName") val addressName: String? = null,

        @JsonProperty("state") val state: String? = null
) {

}

