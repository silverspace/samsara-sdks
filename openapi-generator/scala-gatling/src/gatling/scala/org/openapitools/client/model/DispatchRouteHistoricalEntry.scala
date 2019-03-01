
package org.openapitools.client.model


case class DispatchRouteHistoricalEntry (
    /* Timestamp that the route was updated, represented as Unix milliseconds since epoch. */
    _changedUnderscoreatUnderscorems: Option[Long],
    _route: Option[DispatchRoute]
)
object DispatchRouteHistoricalEntry {
    def toStringBody(var_changedUnderscoreatUnderscorems: Object, var_route: Object) =
        s"""
        | {
        | "changedUnderscoreatUnderscorems":$var_changedUnderscoreatUnderscorems,"route":$var_route
        | }
        """.stripMargin
}
