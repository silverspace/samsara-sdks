
package org.openapitools.client.model


case class TaggedMachine (
    /* The ID of the Machine being tagged. */
    _id: Long,
    /* Name of the Machine being tagged. */
    _name: Option[String]
)
object TaggedMachine {
    def toStringBody(var_id: Object, var_name: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name
        | }
        """.stripMargin
}
