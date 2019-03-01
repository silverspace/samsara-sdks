
package org.openapitools.client.model


case class TaggedVehicle (
    /* The ID of the Vehicle being tagged. */
    _id: Long,
    /* Name of the Vehicle being tagged. */
    _name: Option[String]
)
object TaggedVehicle {
    def toStringBody(var_id: Object, var_name: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name
        | }
        """.stripMargin
}
