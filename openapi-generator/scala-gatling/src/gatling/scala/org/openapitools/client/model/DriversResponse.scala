
package org.openapitools.client.model


case class DriversResponse (
    _drivers: Option[List[Driver]]
)
object DriversResponse {
    def toStringBody(var_drivers: Object) =
        s"""
        | {
        | "drivers":$var_drivers
        | }
        """.stripMargin
}
