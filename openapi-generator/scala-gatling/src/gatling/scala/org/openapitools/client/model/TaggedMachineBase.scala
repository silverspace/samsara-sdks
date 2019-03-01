
package org.openapitools.client.model


case class TaggedMachineBase (
    /* The ID of the Machine being tagged. */
    _id: Long
)
object TaggedMachineBase {
    def toStringBody(var_id: Object) =
        s"""
        | {
        | "id":$var_id
        | }
        """.stripMargin
}
