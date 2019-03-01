
package org.openapitools.client.model


case class DataInputHistoryResponse (
    /* The ID of this data input */
    _id: Option[Long],
    /* Name of this data input */
    _name: String,
    /* Data points from this data input */
    _points: Option[List[DataInputHistoryResponsePoints]]
)
object DataInputHistoryResponse {
    def toStringBody(var_id: Object, var_name: Object, var_points: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"points":$var_points
        | }
        """.stripMargin
}
