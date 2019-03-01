
package org.openapitools.client.model


case class CargoResponseSensors (
    /* Flag indicating whether the current cargo is empty or loaded. */
    _cargoEmpty: Option[Boolean],
    /* Name of the sensor. */
    _name: Option[String],
    /* ID of the sensor. */
    _id: Option[Long]
)
object CargoResponseSensors {
    def toStringBody(var_cargoEmpty: Object, var_name: Object, var_id: Object) =
        s"""
        | {
        | "cargoEmpty":$var_cargoEmpty,"name":$var_name,"id":$var_id
        | }
        """.stripMargin
}
