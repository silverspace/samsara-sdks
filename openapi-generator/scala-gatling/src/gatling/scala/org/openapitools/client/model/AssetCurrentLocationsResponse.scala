
package org.openapitools.client.model


case class AssetCurrentLocationsResponse (
    /* The cable connected to the asset */
    _cable: Option[List[AssetCable]],
    /* Engine hours */
    _engineHours: Option[Integer],
    /* Asset ID */
    _id: Long,
    /* Current location of an asset */
    _location: Option[List[AssetCurrentLocation]],
    /* Asset name */
    _name: Option[String]
)
object AssetCurrentLocationsResponse {
    def toStringBody(var_cable: Object, var_engineHours: Object, var_id: Object, var_location: Object, var_name: Object) =
        s"""
        | {
        | "cable":$var_cable,"engineHours":$var_engineHours,"id":$var_id,"location":$var_location,"name":$var_name
        | }
        """.stripMargin
}
