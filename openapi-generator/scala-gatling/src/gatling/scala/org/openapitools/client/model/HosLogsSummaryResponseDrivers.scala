
package org.openapitools.client.model


case class HosLogsSummaryResponseDrivers (
    /* The amount of time (in ms) remaining until the driver cannot drive without a rest break. */
    _timeUntilBreak: Option[Long],
    /* Name of the vehicle. */
    _vehicleName: Option[String],
    /* The amount of driving time in violation today (in ms). */
    _drivingInViolationToday: Option[Long],
    /* ID of the driver. */
    _driverId: Option[Long],
    /* The amount of remaining cycle time (in ms). */
    _cycleRemaining: Option[Long],
    /* Name of the driver. */
    _driverName: Option[String],
    /* The Hours of Service status type. One of `OFF_DUTY`, `SLEEPER_BED`, `DRIVING`, `ON_DUTY`, `YARD_MOVE`, `PERSONAL_CONVEYANCE`. */
    _dutyStatus: Option[String],
    /* The amount of cycle time (in ms) available tomorrow. */
    _cycleTomorrow: Option[Long],
    /* The amount of remaining shift drive time (in ms). */
    _shiftDriveRemaining: Option[Long],
    /* The amount of time (in ms) that the driver has been in the current `dutyStatus`. */
    _timeInCurrentStatus: Option[Long],
    /* The amount of driving time in violation in this cycle (in ms). */
    _drivingInViolationCycle: Option[Long],
    /* The amount of remaining shift time (in ms). */
    _shiftRemaining: Option[Long]
)
object HosLogsSummaryResponseDrivers {
    def toStringBody(var_timeUntilBreak: Object, var_vehicleName: Object, var_drivingInViolationToday: Object, var_driverId: Object, var_cycleRemaining: Object, var_driverName: Object, var_dutyStatus: Object, var_cycleTomorrow: Object, var_shiftDriveRemaining: Object, var_timeInCurrentStatus: Object, var_drivingInViolationCycle: Object, var_shiftRemaining: Object) =
        s"""
        | {
        | "timeUntilBreak":$var_timeUntilBreak,"vehicleName":$var_vehicleName,"drivingInViolationToday":$var_drivingInViolationToday,"driverId":$var_driverId,"cycleRemaining":$var_cycleRemaining,"driverName":$var_driverName,"dutyStatus":$var_dutyStatus,"cycleTomorrow":$var_cycleTomorrow,"shiftDriveRemaining":$var_shiftDriveRemaining,"timeInCurrentStatus":$var_timeInCurrentStatus,"drivingInViolationCycle":$var_drivingInViolationCycle,"shiftRemaining":$var_shiftRemaining
        | }
        """.stripMargin
}
