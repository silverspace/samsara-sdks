package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param actionType The log type - one of 'signin' or 'signout'
 * @param address Address at which the log was recorded, if applicable.
 * @param city City in which the log was recorded, if applicable.
 * @param happenedAtMs The time at which the event was recorded in UNIX milliseconds.
 * @param addressName Address name from the group address book at which the log was recorded, if applicable.
 * @param state State in which the log was recorded, if applicable.
 */
case class HosAuthenticationLogsResponseAuthenticationLogs(actionType: Option[String],
                address: Option[String],
                city: Option[String],
                happenedAtMs: Option[Long],
                addressName: Option[String],
                state: Option[String]
                )

object HosAuthenticationLogsResponseAuthenticationLogs {
    /**
     * Creates the codec for converting HosAuthenticationLogsResponseAuthenticationLogs from and to JSON.
     */
    implicit val decoder: Decoder[HosAuthenticationLogsResponseAuthenticationLogs] = deriveDecoder
    implicit val encoder: ObjectEncoder[HosAuthenticationLogsResponseAuthenticationLogs] = deriveEncoder
}
