
package org.openapitools.client.model


case class DvirBaseVehicle (
    /* The vehicle on which DVIR was done. */
    _name: Option[String],
    /* The vehicle id on which DVIR was done. */
    _id: Option[Long]
)
object DvirBaseVehicle {
    def toStringBody(var_name: Object, var_id: Object) =
        s"""
        | {
        | "name":$var_name,"id":$var_id
        | }
        """.stripMargin
}
