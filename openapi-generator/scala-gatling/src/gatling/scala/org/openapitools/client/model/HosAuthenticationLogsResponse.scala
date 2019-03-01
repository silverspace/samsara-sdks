
package org.openapitools.client.model


case class HosAuthenticationLogsResponse (
    _authenticationLogs: Option[List[HosAuthenticationLogsResponseAuthenticationLogs]]
)
object HosAuthenticationLogsResponse {
    def toStringBody(var_authenticationLogs: Object) =
        s"""
        | {
        | "authenticationLogs":$var_authenticationLogs
        | }
        """.stripMargin
}
