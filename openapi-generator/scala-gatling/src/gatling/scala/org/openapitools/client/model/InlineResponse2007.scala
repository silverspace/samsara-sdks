
package org.openapitools.client.model


case class InlineResponse2007 (
    _machines: Option[List[Machine]]
)
object InlineResponse2007 {
    def toStringBody(var_machines: Object) =
        s"""
        | {
        | "machines":$var_machines
        | }
        """.stripMargin
}
