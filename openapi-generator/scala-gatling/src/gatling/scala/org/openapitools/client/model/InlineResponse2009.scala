
package org.openapitools.client.model


case class InlineResponse2009 (
    _tags: Option[List[Tag]]
)
object InlineResponse2009 {
    def toStringBody(var_tags: Object) =
        s"""
        | {
        | "tags":$var_tags
        | }
        """.stripMargin
}
