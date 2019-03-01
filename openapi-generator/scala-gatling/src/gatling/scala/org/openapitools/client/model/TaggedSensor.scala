
package org.openapitools.client.model


case class TaggedSensor (
    /* The ID of the Sensor being tagged. */
    _id: Long,
    /* Name of the Sensor being tagged. */
    _name: Option[String]
)
object TaggedSensor {
    def toStringBody(var_id: Object, var_name: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name
        | }
        """.stripMargin
}
