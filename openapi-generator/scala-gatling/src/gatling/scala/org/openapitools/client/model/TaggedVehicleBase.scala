
package org.openapitools.client.model


case class TaggedVehicleBase (
    /* The ID of the Vehicle being tagged. */
    _id: Long
)
object TaggedVehicleBase {
    def toStringBody(var_id: Object) =
        s"""
        | {
        | "id":$var_id
        | }
        """.stripMargin
}
