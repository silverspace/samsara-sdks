
package org.openapitools.client.model


case class AssetReeferResponseReeferStatsFuelPercentage (
    /* Fuel percentage of the reefer. */
    _fuelPercentage: Option[Long],
    /* Timestamp in Unix milliseconds since epoch. */
    _changedAtMs: Option[Long]
)
object AssetReeferResponseReeferStatsFuelPercentage {
    def toStringBody(var_fuelPercentage: Object, var_changedAtMs: Object) =
        s"""
        | {
        | "fuelPercentage":$var_fuelPercentage,"changedAtMs":$var_changedAtMs
        | }
        """.stripMargin
}
