
package org.openapitools.client.model


case class DispatchRouteHistory (
    /* History of the route's state changes. */
    _history: Option[List[DispatchRouteHistoricalEntry]]
)
object DispatchRouteHistory {
    def toStringBody(var_history: Object) =
        s"""
        | {
        | "history":$var_history
        | }
        """.stripMargin
}
