
package org.openapitools.client.model


case class DocumentFieldTypeNumberValueTypeMetadata (
    /* Number of decimal places that values for this field type can have. */
    _numDecimalPlaces: Option[Long]
)
object DocumentFieldTypeNumberValueTypeMetadata {
    def toStringBody(var_numDecimalPlaces: Object) =
        s"""
        | {
        | "numDecimalPlaces":$var_numDecimalPlaces
        | }
        """.stripMargin
}
