
package org.openapitools.client.model


case class InlineObject16 (
    _externalIds: Option[Map[String, String]],
    /* Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic */
    _harshUnderscoreaccelUnderscoresetting: Option[Integer],
    /* Name */
    _name: Option[String]
)
object InlineObject16 {
    def toStringBody(var_externalIds: Object, var_harshUnderscoreaccelUnderscoresetting: Object, var_name: Object) =
        s"""
        | {
        | "externalIds":$var_externalIds,"harshUnderscoreaccelUnderscoresetting":$var_harshUnderscoreaccelUnderscoresetting,"name":$var_name
        | }
        """.stripMargin
}
