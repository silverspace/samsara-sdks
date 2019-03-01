
package org.openapitools.client.model


case class DocumentBase (
    /* ID of the Samsara dispatch job for which the document is submitted */
    _dispatchJobId: Option[Long],
    /* Notes submitted with this document. */
    _notes: Option[String]
)
object DocumentBase {
    def toStringBody(var_dispatchJobId: Object, var_notes: Object) =
        s"""
        | {
        | "dispatchJobId":$var_dispatchJobId,"notes":$var_notes
        | }
        """.stripMargin
}
