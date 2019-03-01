
package org.openapitools.client.model


case class DriverDailyLogResponse (
    _days: Option[List[DriverDailyLogResponseDays]]
)
object DriverDailyLogResponse {
    def toStringBody(var_days: Object) =
        s"""
        | {
        | "days":$var_days
        | }
        """.stripMargin
}
