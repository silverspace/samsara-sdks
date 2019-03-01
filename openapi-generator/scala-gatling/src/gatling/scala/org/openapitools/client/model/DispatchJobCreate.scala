
package org.openapitools.client.model


case class DispatchJobCreate (
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
    _scheduledUnderscoredepartureUnderscoretimeUnderscorems: Option[Long]
)
object DispatchJobCreate {
    def toStringBody(var_destinationUnderscoreaddress: Object, var_destinationUnderscoreaddressUnderscoreid: Object, var_destinationUnderscorelat: Object, var_destinationUnderscorelng: Object, var_destinationUnderscorename: Object, var_notes: Object, var_scheduledUnderscorearrivalUnderscoretimeUnderscorems: Object, var_scheduledUnderscoredepartureUnderscoretimeUnderscorems: Object) =
        s"""
        | {
        | "destinationUnderscoreaddress":$var_destinationUnderscoreaddress,"destinationUnderscoreaddressUnderscoreid":$var_destinationUnderscoreaddressUnderscoreid,"destinationUnderscorelat":$var_destinationUnderscorelat,"destinationUnderscorelng":$var_destinationUnderscorelng,"destinationUnderscorename":$var_destinationUnderscorename,"notes":$var_notes,"scheduledUnderscorearrivalUnderscoretimeUnderscorems":$var_scheduledUnderscorearrivalUnderscoretimeUnderscorems,"scheduledUnderscoredepartureUnderscoretimeUnderscorems":$var_scheduledUnderscoredepartureUnderscoretimeUnderscorems
        | }
        """.stripMargin
}
