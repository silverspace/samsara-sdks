
package org.openapitools.client.model


case class Machine (
    /* ID of the machine. */
    _id: Long,
    /* Name of the machine. */
    _name: Option[String],
    /* Notes about the machine */
    _notes: Option[String]
)
object Machine {
    def toStringBody(var_id: Object, var_name: Object, var_notes: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"notes":$var_notes
        | }
        """.stripMargin
}
