
package org.openapitools.client.model


case class VehicleHarshEventResponse (
    /* URL for downloading the forward facing video */
    _downloadForwardVideoUrl: Option[String],
    /* URL for downloading the inward facing video */
    _downloadInwardVideoUrl: Option[String],
    /* URL for downloading the tracked inward facing video */
    _downloadTrackedInwardVideoUrl: Option[String],
    /* Type of the harsh event. One of: [Crash, Harsh Acceleration, Harsh Braking, Harsh Turn, ROP Engine, ROP Brake, YC Engine, YC Brake, Harsh Event] */
    _harshEventType: String,
    /* URL of the associated incident report page */
    _incidentReportUrl: String,
    /* Whether the driver was deemed distracted during this harsh event */
    _isDistracted: Option[Boolean],
    _location: Option[VehicleHarshEventResponseLocation]
)
object VehicleHarshEventResponse {
    def toStringBody(var_downloadForwardVideoUrl: Object, var_downloadInwardVideoUrl: Object, var_downloadTrackedInwardVideoUrl: Object, var_harshEventType: Object, var_incidentReportUrl: Object, var_isDistracted: Object, var_location: Object) =
        s"""
        | {
        | "downloadForwardVideoUrl":$var_downloadForwardVideoUrl,"downloadInwardVideoUrl":$var_downloadInwardVideoUrl,"downloadTrackedInwardVideoUrl":$var_downloadTrackedInwardVideoUrl,"harshEventType":$var_harshEventType,"incidentReportUrl":$var_incidentReportUrl,"isDistracted":$var_isDistracted,"location":$var_location
        | }
        """.stripMargin
}
