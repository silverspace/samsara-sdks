
package org.openapitools.client.model


case class AllRouteJobUpdates (
    _jobUnderscoreupdates: Option[List[JobUpdateObject]],
    /* Sequence ID of the last update returned in the response */
    _sequenceUnderscoreid: Option[String]
)
object AllRouteJobUpdates {
    def toStringBody(var_jobUnderscoreupdates: Object, var_sequenceUnderscoreid: Object) =
        s"""
        | {
        | "jobUnderscoreupdates":$var_jobUnderscoreupdates,"sequenceUnderscoreid":$var_sequenceUnderscoreid
        | }
        """.stripMargin
}
