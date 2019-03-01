
package org.openapitools.client.model


case class DocumentField (
    /* Value of this field if this document field has valueType: ValueType_Number. */
    _numberValue: Option[Double],
    /* Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo. */
    _photoValue: Option[List[DocumentFieldCreatePhotoValue]],
    /* Value of this field if this document field has valueType: ValueType_String. */
    _stringValue: Option[String],
    /* Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo. */
    _valueType: String,
    /* Descriptive name of this field. */
    _label: String,
    /* DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string. */
    _value: Option[Any]
)
object DocumentField {
    def toStringBody(var_numberValue: Object, var_photoValue: Object, var_stringValue: Object, var_valueType: Object, var_label: Object, var_value: Object) =
        s"""
        | {
        | "numberValue":$var_numberValue,"photoValue":$var_photoValue,"stringValue":$var_stringValue,"valueType":$var_valueType,"label":$var_label,"value":$var_value
        | }
        """.stripMargin
}
