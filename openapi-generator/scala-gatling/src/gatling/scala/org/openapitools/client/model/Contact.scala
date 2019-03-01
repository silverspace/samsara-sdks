
package org.openapitools.client.model


case class Contact (
    /* Email address of the contact */
    _email: Option[String],
    /* First name of the contact */
    _firstName: Option[String],
    /* ID of the contact */
    _id: Option[Long],
    /* Last name of the contact */
    _lastName: Option[String],
    /* Phone number of the contact */
    _phone: Option[String]
)
object Contact {
    def toStringBody(var_email: Object, var_firstName: Object, var_id: Object, var_lastName: Object, var_phone: Object) =
        s"""
        | {
        | "email":$var_email,"firstName":$var_firstName,"id":$var_id,"lastName":$var_lastName,"phone":$var_phone
        | }
        """.stripMargin
}
