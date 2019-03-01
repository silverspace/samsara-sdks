
package org.openapitools.client.model


case class DispatchJob (
    /* The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided. */
    _destinationUnderscoreaddress: Option[String],
    /* ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided. */
    _destinationUnderscoreaddressUnderscoreid: Option[Long],
    /* Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. */
    _destinationUnderscorelat: Option[Double],
    /* Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided. */
    _destinationUnderscorelng: Option[Double],
    /* The name of the job destination. If provided, it will take precedence over the name of the address book entry. */
    _destinationUnderscorename: Option[String],
    /* Notes regarding the details of this job. */
    _notes: Option[String],
    /* The time at which the assigned driver is scheduled to arrive at the job destination. */
    _scheduledUnderscorearrivalUnderscoretimeUnderscorems: Long,
    /* The time at which the assigned driver is scheduled to depart from the job destination. */
    _scheduledUnderscoredepartureUnderscoretimeUnderscorems: Option[Long],
    /* The time at which the driver arrived at the job destination. */
    _arrivedUnderscoreatUnderscorems: Option[Long],
    /* The time at which the job was marked complete (e.g. started driving to the next destination). */
    _completedUnderscoreatUnderscorems: Option[Long],
    /* ID of the route that this job belongs to. */
    _dispatchUnderscorerouteUnderscoreid: Long,
    /* ID of the driver assigned to the dispatch job. */
    _driverUnderscoreid: Option[Long],
    /* The time at which the assigned driver started fulfilling the job (e.g. started driving to the destination). */
    _enUnderscorerouteUnderscoreatUnderscorems: Option[Long],
    /* The time at which the assigned driver is estimated to arrive at the job destination. Only valid for en-route jobs. */
    _estimatedUnderscorearrivalUnderscorems: Option[Long],
    /* Fleet viewer url of the dispatch job. */
    _fleetUnderscoreviewerUnderscoreurl: Option[String],
    _groupUnderscoreid: Long,
    /* ID of the Samsara dispatch job. */
    _id: Long,
    _jobUnderscorestate: JobStatus,
    /* The time at which the job was marked skipped. */
    _skippedUnderscoreatUnderscorems: Option[Long],
    /* ID of the vehicle used for the dispatch job. */
    _vehicleUnderscoreid: Option[Long]
)
object DispatchJob {
    def toStringBody(var_destinationUnderscoreaddress: Object, var_destinationUnderscoreaddressUnderscoreid: Object, var_destinationUnderscorelat: Object, var_destinationUnderscorelng: Object, var_destinationUnderscorename: Object, var_notes: Object, var_scheduledUnderscorearrivalUnderscoretimeUnderscorems: Object, var_scheduledUnderscoredepartureUnderscoretimeUnderscorems: Object, var_arrivedUnderscoreatUnderscorems: Object, var_completedUnderscoreatUnderscorems: Object, var_dispatchUnderscorerouteUnderscoreid: Object, var_driverUnderscoreid: Object, var_enUnderscorerouteUnderscoreatUnderscorems: Object, var_estimatedUnderscorearrivalUnderscorems: Object, var_fleetUnderscoreviewerUnderscoreurl: Object, var_groupUnderscoreid: Object, var_id: Object, var_jobUnderscorestate: Object, var_skippedUnderscoreatUnderscorems: Object, var_vehicleUnderscoreid: Object) =
        s"""
        | {
        | "destinationUnderscoreaddress":$var_destinationUnderscoreaddress,"destinationUnderscoreaddressUnderscoreid":$var_destinationUnderscoreaddressUnderscoreid,"destinationUnderscorelat":$var_destinationUnderscorelat,"destinationUnderscorelng":$var_destinationUnderscorelng,"destinationUnderscorename":$var_destinationUnderscorename,"notes":$var_notes,"scheduledUnderscorearrivalUnderscoretimeUnderscorems":$var_scheduledUnderscorearrivalUnderscoretimeUnderscorems,"scheduledUnderscoredepartureUnderscoretimeUnderscorems":$var_scheduledUnderscoredepartureUnderscoretimeUnderscorems,"arrivedUnderscoreatUnderscorems":$var_arrivedUnderscoreatUnderscorems,"completedUnderscoreatUnderscorems":$var_completedUnderscoreatUnderscorems,"dispatchUnderscorerouteUnderscoreid":$var_dispatchUnderscorerouteUnderscoreid,"driverUnderscoreid":$var_driverUnderscoreid,"enUnderscorerouteUnderscoreatUnderscorems":$var_enUnderscorerouteUnderscoreatUnderscorems,"estimatedUnderscorearrivalUnderscorems":$var_estimatedUnderscorearrivalUnderscorems,"fleetUnderscoreviewerUnderscoreurl":$var_fleetUnderscoreviewerUnderscoreurl,"groupUnderscoreid":$var_groupUnderscoreid,"id":$var_id,"jobUnderscorestate":$var_jobUnderscorestate,"skippedUnderscoreatUnderscorems":$var_skippedUnderscoreatUnderscorems,"vehicleUnderscoreid":$var_vehicleUnderscoreid
        | }
        """.stripMargin
}
