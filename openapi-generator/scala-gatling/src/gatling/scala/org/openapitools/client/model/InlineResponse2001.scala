
package org.openapitools.client.model


case class InlineResponse2001 (
    _assets: Option[List[AssetCurrentLocationsResponse]]
)
object InlineResponse2001 {
    def toStringBody(var_assets: Object) =
        s"""
        | {
        | "assets":$var_assets
        | }
        """.stripMargin
}
