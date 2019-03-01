
package org.openapitools.client.model


case class DriversSummaryResponse (
    _Summaries: Option[List[DriversSummaryResponseSummaries]]
)
object DriversSummaryResponse {
    def toStringBody(var_Summaries: Object) =
        s"""
        | {
        | "Summaries":$var_Summaries
        | }
        """.stripMargin
}
