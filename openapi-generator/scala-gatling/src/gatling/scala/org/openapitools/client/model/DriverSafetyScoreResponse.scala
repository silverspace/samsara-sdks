
package org.openapitools.client.model


case class DriverSafetyScoreResponse (
    /* Crash event count */
    _crashCount: Option[Integer],
    /* Driver ID */
    _driverId: Option[Integer],
    /* Harsh acceleration event count */
    _harshAccelCount: Option[Integer],
    /* Harsh braking event count */
    _harshBrakingCount: Option[Integer],
    _harshEvents: Option[List[SafetyReportHarshEvent]],
    /* Harsh turning event count */
    _harshTurningCount: Option[Integer],
    /* Safety Score */
    _safetyScore: Option[Integer],
    /* Safety Score Rank */
    _safetyScoreRank: Option[String],
    /* Amount of time driven over the speed limit in milliseconds */
    _timeOverSpeedLimitMs: Option[Integer],
    /* Total distance driven in meters */
    _totalDistanceDrivenMeters: Option[Integer],
    /* Total harsh event count */
    _totalHarshEventCount: Option[Integer],
    /* Amount of time driven in milliseconds */
    _totalTimeDrivenMs: Option[Integer]
)
object DriverSafetyScoreResponse {
    def toStringBody(var_crashCount: Object, var_driverId: Object, var_harshAccelCount: Object, var_harshBrakingCount: Object, var_harshEvents: Object, var_harshTurningCount: Object, var_safetyScore: Object, var_safetyScoreRank: Object, var_timeOverSpeedLimitMs: Object, var_totalDistanceDrivenMeters: Object, var_totalHarshEventCount: Object, var_totalTimeDrivenMs: Object) =
        s"""
        | {
        | "crashCount":$var_crashCount,"driverId":$var_driverId,"harshAccelCount":$var_harshAccelCount,"harshBrakingCount":$var_harshBrakingCount,"harshEvents":$var_harshEvents,"harshTurningCount":$var_harshTurningCount,"safetyScore":$var_safetyScore,"safetyScoreRank":$var_safetyScoreRank,"timeOverSpeedLimitMs":$var_timeOverSpeedLimitMs,"totalDistanceDrivenMeters":$var_totalDistanceDrivenMeters,"totalHarshEventCount":$var_totalHarshEventCount,"totalTimeDrivenMs":$var_totalTimeDrivenMs
        | }
        """.stripMargin
}
