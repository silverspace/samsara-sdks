
package org.openapitools.client.model


case class AssetCable (
    /* Asset type */
    _assetType: Option[String]
)
object AssetCable {
    def toStringBody(var_assetType: Object) =
        s"""
        | {
        | "assetType":$var_assetType
        | }
        """.stripMargin
}
