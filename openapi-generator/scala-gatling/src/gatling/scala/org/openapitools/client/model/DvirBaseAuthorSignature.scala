
package org.openapitools.client.model


case class DvirBaseAuthorSignature (
    /* ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned. */
    _mechanicUserId: Option[Long],
    /* ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned. */
    _driverId: Option[Long],
    /* The name of the driver or mechanic who signed the DVIR. */
    _name: Option[String],
    /* The time in millis when the DVIR was signed */
    _signedAt: Option[Long],
    /* Type corresponds to whether the signature corresponds to driver|mechanic. */
    _type: Option[String],
    /* Email of the  driver|mechanic who signed the DVIR. */
    _email: Option[String],
    /* Username of the  driver|mechanic who signed the DVIR. */
    _username: Option[String]
)
object DvirBaseAuthorSignature {
    def toStringBody(var_mechanicUserId: Object, var_driverId: Object, var_name: Object, var_signedAt: Object, var_type: Object, var_email: Object, var_username: Object) =
        s"""
        | {
        | "mechanicUserId":$var_mechanicUserId,"driverId":$var_driverId,"name":$var_name,"signedAt":$var_signedAt,"type":$var_type,"email":$var_email,"username":$var_username
        | }
        """.stripMargin
}
