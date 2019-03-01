
package org.openapitools.client.model


case class DocumentFieldCreate (
    /* Value of this field if this document field has valueType: ValueType_Number. */
    _numberValue: Option[Double],
    /* Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo. */
    _photoValue: Option[List[DocumentFieldCreatePhotoValue]],
    /* Value of this field if this document field has valueType: ValueType_String. */
    _stringValue: Option[String],
    /* Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo. */
    _valueType: String
)
object DocumentFieldCreate {
    def toStringBody(var_numberValue: Object, var_photoValue: Object, var_stringValue: Object, var_valueType: Object) =
        s"""
        | {
        | "numberValue":$var_numberValue,"photoValue":$var_photoValue,"stringValue":$var_stringValue,"valueType":$var_valueType
        | }
        """.stripMargin
}
