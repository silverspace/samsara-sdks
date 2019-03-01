
package org.openapitools.client.model


case class DispatchRoute (
    /* The time in Unix epoch milliseconds that the route actually ended. */
    _actualUnderscoreendUnderscorems: Option[Long],
    /* The time in Unix epoch milliseconds that the route actually started. */
    _actualUnderscorestartUnderscorems: Option[Long],
    /* ID of the driver assigned to the dispatch route. Note that driver_id and vehicle_id are mutually exclusive. If neither is specified, then the route is unassigned. */
    _driverUnderscoreid: Option[Long],
    /* ID of the group if the organization has multiple groups (optional). */
    _groupUnderscoreid: Option[Long],
    /* Descriptive name of this route. */
    _name: String,
    /* The time in Unix epoch milliseconds that the last job in the route is scheduled to end. */
    _scheduledUnderscoreendUnderscorems: Long,
    /* The distance expected to be traveled for this route in meters. */
    _scheduledUnderscoremeters: Option[Long],
    /* The time in Unix epoch milliseconds that the route is scheduled to start. */
    _scheduledUnderscorestartUnderscorems: Long,
    /* The address of the route's starting location, as it would be recognized if provided to maps.google.com. Optional if a valid start location address ID is provided. */
    _startUnderscorelocationUnderscoreaddress: Option[String],
    /* ID of the start location associated with an address book entry. Optional if valid values are provided for start location address or latitude/longitude. If a valid start location address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the start location name is not provided. */
    _startUnderscorelocationUnderscoreaddressUnderscoreid: Option[Long],
    /* Latitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. */
    _startUnderscorelocationUnderscorelat: Option[Double],
    /* Longitude of the start location in decimal degrees. Optional if a valid start location address ID is provided. */
    _startUnderscorelocationUnderscorelng: Option[Double],
    /* The name of the route's starting location. If provided, it will take precedence over the name of the address book entry. */
    _startUnderscorelocationUnderscorename: Option[String],
    /* ID of the trailer assigned to the dispatch route. Note that trailers can only be assigned to routes that have a Vehicle or Driver assigned to them. */
    _trailerUnderscoreid: Option[Long],
    /* ID of the vehicle assigned to the dispatch route. Note that vehicle_id and driver_id are mutually exclusive. If neither is specified, then the route is unassigned. */
    _vehicleUnderscoreid: Option[Long],
    /* The dispatch jobs associated with this route. */
    _dispatchUnderscorejobs: List[DispatchJob],
    /* ID of the Samsara dispatch route. */
    _id: Long
)
object DispatchRoute {
    def toStringBody(var_actualUnderscoreendUnderscorems: Object, var_actualUnderscorestartUnderscorems: Object, var_driverUnderscoreid: Object, var_groupUnderscoreid: Object, var_name: Object, var_scheduledUnderscoreendUnderscorems: Object, var_scheduledUnderscoremeters: Object, var_scheduledUnderscorestartUnderscorems: Object, var_startUnderscorelocationUnderscoreaddress: Object, var_startUnderscorelocationUnderscoreaddressUnderscoreid: Object, var_startUnderscorelocationUnderscorelat: Object, var_startUnderscorelocationUnderscorelng: Object, var_startUnderscorelocationUnderscorename: Object, var_trailerUnderscoreid: Object, var_vehicleUnderscoreid: Object, var_dispatchUnderscorejobs: Object, var_id: Object) =
        s"""
        | {
        | "actualUnderscoreendUnderscorems":$var_actualUnderscoreendUnderscorems,"actualUnderscorestartUnderscorems":$var_actualUnderscorestartUnderscorems,"driverUnderscoreid":$var_driverUnderscoreid,"groupUnderscoreid":$var_groupUnderscoreid,"name":$var_name,"scheduledUnderscoreendUnderscorems":$var_scheduledUnderscoreendUnderscorems,"scheduledUnderscoremeters":$var_scheduledUnderscoremeters,"scheduledUnderscorestartUnderscorems":$var_scheduledUnderscorestartUnderscorems,"startUnderscorelocationUnderscoreaddress":$var_startUnderscorelocationUnderscoreaddress,"startUnderscorelocationUnderscoreaddressUnderscoreid":$var_startUnderscorelocationUnderscoreaddressUnderscoreid,"startUnderscorelocationUnderscorelat":$var_startUnderscorelocationUnderscorelat,"startUnderscorelocationUnderscorelng":$var_startUnderscorelocationUnderscorelng,"startUnderscorelocationUnderscorename":$var_startUnderscorelocationUnderscorename,"trailerUnderscoreid":$var_trailerUnderscoreid,"vehicleUnderscoreid":$var_vehicleUnderscoreid,"dispatchUnderscorejobs":$var_dispatchUnderscorejobs,"id":$var_id
        | }
        """.stripMargin
}
