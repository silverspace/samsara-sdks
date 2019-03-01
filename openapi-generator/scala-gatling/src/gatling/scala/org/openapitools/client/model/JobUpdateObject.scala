
package org.openapitools.client.model


case class JobUpdateObject (
    /* Timestamp that this event was updated, represented as Unix milliseconds since epoch. */
    _changedUnderscoreatUnderscorems: Option[Long],
    /* ID of the Samsara job. */
    _jobUnderscoreid: Option[Long],
    _jobUnderscorestate: Option[JobStatus],
    _prevUnderscorejobUnderscorestate: Option[PrevJobStatus],
    _route: Option[DispatchRoute],
    /* ID of the Samsara dispatch route. */
    _routeUnderscoreid: Option[Long]
)
object JobUpdateObject {
    def toStringBody(var_changedUnderscoreatUnderscorems: Object, var_jobUnderscoreid: Object, var_jobUnderscorestate: Object, var_prevUnderscorejobUnderscorestate: Object, var_route: Object, var_routeUnderscoreid: Object) =
        s"""
        | {
        | "changedUnderscoreatUnderscorems":$var_changedUnderscoreatUnderscorems,"jobUnderscoreid":$var_jobUnderscoreid,"jobUnderscorestate":$var_jobUnderscorestate,"prevUnderscorejobUnderscorestate":$var_prevUnderscorejobUnderscorestate,"route":$var_route,"routeUnderscoreid":$var_routeUnderscoreid
        | }
        """.stripMargin
}
