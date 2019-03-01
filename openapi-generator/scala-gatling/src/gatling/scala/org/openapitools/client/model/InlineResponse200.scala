
package org.openapitools.client.model


case class InlineResponse200 (
    _assets: Option[List[Asset]]
)
object InlineResponse200 {
    def toStringBody(var_assets: Object) =
        s"""
        | {
        | "assets":$var_assets
        | }
        """.stripMargin
}
