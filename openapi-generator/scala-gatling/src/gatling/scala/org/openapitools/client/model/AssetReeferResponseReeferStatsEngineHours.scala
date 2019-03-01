
package org.openapitools.client.model


case class AssetReeferResponseReeferStatsEngineHours (
    /* Engine hours of the reefer. */
    _engineHours: Option[Long],
    /* Timestamp in Unix milliseconds since epoch. */
    _changedAtMs: Option[Long]
)
object AssetReeferResponseReeferStatsEngineHours {
    def toStringBody(var_engineHours: Object, var_changedAtMs: Object) =
        s"""
        | {
        | "engineHours":$var_engineHours,"changedAtMs":$var_changedAtMs
        | }
        """.stripMargin
}
