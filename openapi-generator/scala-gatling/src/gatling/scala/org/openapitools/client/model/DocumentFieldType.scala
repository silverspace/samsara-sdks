
package org.openapitools.client.model


case class DocumentFieldType (
    /* Descriptive name of this field type. */
    _label: String,
    _numberValueTypeMetadata: Option[DocumentFieldTypeNumberValueTypeMetadata],
    /* The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo. */
    _valueType: String
)
object DocumentFieldType {
    def toStringBody(var_label: Object, var_numberValueTypeMetadata: Object, var_valueType: Object) =
        s"""
        | {
        | "label":$var_label,"numberValueTypeMetadata":$var_numberValueTypeMetadata,"valueType":$var_valueType
        | }
        """.stripMargin
}
