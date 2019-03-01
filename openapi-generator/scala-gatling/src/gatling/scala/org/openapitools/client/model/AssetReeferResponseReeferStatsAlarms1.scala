
package org.openapitools.client.model


case class AssetReeferResponseReeferStatsAlarms1 (
    _alarms: Option[List[AssetReeferResponseReeferStatsAlarms]],
    /* Timestamp when the alarms were reported, in Unix milliseconds since epoch */
    _changedAtMs: Option[Long]
)
object AssetReeferResponseReeferStatsAlarms1 {
    def toStringBody(var_alarms: Object, var_changedAtMs: Object) =
        s"""
        | {
        | "alarms":$var_alarms,"changedAtMs":$var_changedAtMs
        | }
        """.stripMargin
}
