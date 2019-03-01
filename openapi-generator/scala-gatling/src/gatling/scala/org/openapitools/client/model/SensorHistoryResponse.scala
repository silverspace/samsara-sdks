
package org.openapitools.client.model


case class SensorHistoryResponse (
    _results: Option[List[SensorHistoryResponseResults]]
)
object SensorHistoryResponse {
    def toStringBody(var_results: Object) =
        s"""
        | {
        | "results":$var_results
        | }
        """.stripMargin
}
