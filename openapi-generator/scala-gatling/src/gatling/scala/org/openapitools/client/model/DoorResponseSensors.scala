
package org.openapitools.client.model


case class DoorResponseSensors (
    /* Flag indicating whether the current door is closed or open. */
    _doorClosed: Option[Boolean],
    /* Name of the sensor. */
    _name: Option[String],
    /* ID of the sensor. */
    _id: Option[Long]
)
object DoorResponseSensors {
    def toStringBody(var_doorClosed: Object, var_name: Object, var_id: Object) =
        s"""
        | {
        | "doorClosed":$var_doorClosed,"name":$var_name,"id":$var_id
        | }
        """.stripMargin
}
