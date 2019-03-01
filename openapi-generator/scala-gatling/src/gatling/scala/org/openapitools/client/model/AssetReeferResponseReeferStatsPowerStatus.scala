
package org.openapitools.client.model


case class AssetReeferResponseReeferStatsPowerStatus (
    /* Timestamp in Unix milliseconds since epoch. */
    _changedAtMs: Option[Long],
    /* Power status of the reefer. */
    _status: Option[String]
)
object AssetReeferResponseReeferStatsPowerStatus {
    def toStringBody(var_changedAtMs: Object, var_status: Object) =
        s"""
        | {
        | "changedAtMs":$var_changedAtMs,"status":$var_status
        | }
        """.stripMargin
}
