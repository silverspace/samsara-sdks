
package org.openapitools.client.model


case class DvirBaseNextDriverSignature (
    /* ID of the driver who signed the DVIR */
    _driverId: Option[Long],
    /* The name of the driver who signed the next DVIR on this vehicle. */
    _name: Option[String],
    /* The time in millis when the next driver signed the DVIR on this vehicle. */
    _signedAt: Option[Long],
    /* Type corresponds to driver. */
    _type: Option[String],
    /* Email of the  driver who signed the next DVIR on this vehicle. */
    _email: Option[String],
    /* Username of the  driver who signed the next DVIR on this vehicle. */
    _username: Option[String]
)
object DvirBaseNextDriverSignature {
    def toStringBody(var_driverId: Object, var_name: Object, var_signedAt: Object, var_type: Object, var_email: Object, var_username: Object) =
        s"""
        | {
        | "driverId":$var_driverId,"name":$var_name,"signedAt":$var_signedAt,"type":$var_type,"email":$var_email,"username":$var_username
        | }
        """.stripMargin
}
