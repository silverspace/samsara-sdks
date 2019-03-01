
package org.openapitools.client.model


case class TaggedSensorBase (
    /* The ID of the Sensor being tagged. */
    _id: Long
)
object TaggedSensorBase {
    def toStringBody(var_id: Object) =
        s"""
        | {
        | "id":$var_id
        | }
        """.stripMargin
}
