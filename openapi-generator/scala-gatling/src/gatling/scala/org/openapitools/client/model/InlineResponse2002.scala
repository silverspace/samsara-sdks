
package org.openapitools.client.model


case class InlineResponse2002 (
    _pagination: Option[Pagination],
    /* Group ID to query. */
    _groupId: Option[Long],
    _vehicles: Option[List[Vehicle]]
)
object InlineResponse2002 {
    def toStringBody(var_pagination: Object, var_groupId: Object, var_vehicles: Object) =
        s"""
        | {
        | "pagination":$var_pagination,"groupId":$var_groupId,"vehicles":$var_vehicles
        | }
        """.stripMargin
}
