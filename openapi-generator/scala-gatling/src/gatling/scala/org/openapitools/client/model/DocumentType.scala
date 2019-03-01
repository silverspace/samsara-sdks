
package org.openapitools.client.model


case class DocumentType (
    /* The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have. */
    _fieldTypes: Option[List[List]],
    /* Name of the document type. */
    _name: String,
    /* ID for the organization this document belongs to. */
    _orgId: Long,
    /* Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type. */
    _uuid: String
)
object DocumentType {
    def toStringBody(var_fieldTypes: Object, var_name: Object, var_orgId: Object, var_uuid: Object) =
        s"""
        | {
        | "fieldTypes":$var_fieldTypes,"name":$var_name,"orgId":$var_orgId,"uuid":$var_uuid
        | }
        """.stripMargin
}
