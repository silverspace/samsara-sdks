
package org.openapitools.client.model


case class InlineResponse2006 (
    _dataInputs: Option[List[DataInputHistoryResponse]]
)
object InlineResponse2006 {
    def toStringBody(var_dataInputs: Object) =
        s"""
        | {
        | "dataInputs":$var_dataInputs
        | }
        """.stripMargin
}
