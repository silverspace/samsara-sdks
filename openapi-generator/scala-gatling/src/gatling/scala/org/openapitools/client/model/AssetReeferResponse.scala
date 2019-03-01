
package org.openapitools.client.model


case class AssetReeferResponse (
    /* Asset type */
    _assetType: Option[String],
    /* Asset ID */
    _id: Option[Integer],
    /* Asset name */
    _name: Option[String],
    _reeferStats: Option[AssetReeferResponseReeferStats]
)
object AssetReeferResponse {
    def toStringBody(var_assetType: Object, var_id: Object, var_name: Object, var_reeferStats: Object) =
        s"""
        | {
        | "assetType":$var_assetType,"id":$var_id,"name":$var_name,"reeferStats":$var_reeferStats
        | }
        """.stripMargin
}
