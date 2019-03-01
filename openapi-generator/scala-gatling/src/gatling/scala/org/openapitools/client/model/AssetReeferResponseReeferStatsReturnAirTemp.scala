
package org.openapitools.client.model


case class AssetReeferResponseReeferStatsReturnAirTemp (
    /* Return air temperature in millidegree Celsius. */
    _tempInMilliC: Option[Long],
    /* Timestamp in Unix milliseconds since epoch. */
    _changedAtMs: Option[Long]
)
object AssetReeferResponseReeferStatsReturnAirTemp {
    def toStringBody(var_tempInMilliC: Object, var_changedAtMs: Object) =
        s"""
        | {
        | "tempInMilliC":$var_tempInMilliC,"changedAtMs":$var_changedAtMs
        | }
        """.stripMargin
}
