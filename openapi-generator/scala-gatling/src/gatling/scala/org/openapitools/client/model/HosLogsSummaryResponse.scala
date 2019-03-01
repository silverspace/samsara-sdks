
package org.openapitools.client.model


case class HosLogsSummaryResponse (
    _drivers: Option[List[HosLogsSummaryResponseDrivers]]
)
object HosLogsSummaryResponse {
    def toStringBody(var_drivers: Object) =
        s"""
        | {
        | "drivers":$var_drivers
        | }
        """.stripMargin
}
