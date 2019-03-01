
package org.openapitools.client.model


case class HosLogsResponse (
    _logs: Option[List[HosLogsResponseLogs]]
)
object HosLogsResponse {
    def toStringBody(var_logs: Object) =
        s"""
        | {
        | "logs":$var_logs
        | }
        """.stripMargin
}
