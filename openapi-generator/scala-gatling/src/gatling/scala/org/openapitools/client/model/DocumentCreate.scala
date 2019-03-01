
package org.openapitools.client.model


case class DocumentCreate (
    /* ID of the Samsara dispatch job for which the document is submitted */
    _dispatchJobId: Option[Long],
    /* Notes submitted with this document. */
    _notes: Option[String],
    /* Universally unique identifier for the document type this document is being created for. */
    _documentTypeUuid: String,
    /* List of fields should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. */
    _fields: List[DocumentField]
)
object DocumentCreate {
    def toStringBody(var_dispatchJobId: Object, var_notes: Object, var_documentTypeUuid: Object, var_fields: Object) =
        s"""
        | {
        | "dispatchJobId":$var_dispatchJobId,"notes":$var_notes,"documentTypeUuid":$var_documentTypeUuid,"fields":$var_fields
        | }
        """.stripMargin
}
