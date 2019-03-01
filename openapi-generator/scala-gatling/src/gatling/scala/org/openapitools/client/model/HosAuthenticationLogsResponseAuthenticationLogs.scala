
package org.openapitools.client.model


case class HosAuthenticationLogsResponseAuthenticationLogs (
    /* The log type - one of 'signin' or 'signout' */
    _actionType: Option[String],
    /* Address at which the log was recorded, if applicable. */
    _address: Option[String],
    /* City in which the log was recorded, if applicable. */
    _city: Option[String],
    /* The time at which the event was recorded in UNIX milliseconds. */
    _happenedAtMs: Option[Long],
    /* Address name from the group address book at which the log was recorded, if applicable. */
    _addressName: Option[String],
    /* State in which the log was recorded, if applicable. */
    _state: Option[String]
)
object HosAuthenticationLogsResponseAuthenticationLogs {
    def toStringBody(var_actionType: Object, var_address: Object, var_city: Object, var_happenedAtMs: Object, var_addressName: Object, var_state: Object) =
        s"""
        | {
        | "actionType":$var_actionType,"address":$var_address,"city":$var_city,"happenedAtMs":$var_happenedAtMs,"addressName":$var_addressName,"state":$var_state
        | }
        """.stripMargin
}
