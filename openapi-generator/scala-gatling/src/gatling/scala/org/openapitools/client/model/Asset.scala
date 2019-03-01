
package org.openapitools.client.model


case class Asset (
    /* Serial number of the host asset */
    _assetSerialNumber: Option[String],
    /* The cable connected to the asset */
    _cable: Option[List[AssetCable]],
    /* Engine hours */
    _engineHours: Option[Integer],
    /* Asset ID */
    _id: Long,
    /* Asset name */
    _name: Option[String]
)
object Asset {
    def toStringBody(var_assetSerialNumber: Object, var_cable: Object, var_engineHours: Object, var_id: Object, var_name: Object) =
        s"""
        | {
        | "assetSerialNumber":$var_assetSerialNumber,"cable":$var_cable,"engineHours":$var_engineHours,"id":$var_id,"name":$var_name
        | }
        """.stripMargin
}
