package samsara.client.model {


    [XmlRootNode(name="HosLogsSummaryResponseDrivers")]
    public class HosLogsSummaryResponseDrivers {
        /* The amount of remaining cycle time (in ms). */
        [XmlElement(name="cycleRemaining")]
        public var cycleRemaining: Number = 0;
        /* The amount of cycle time (in ms) available tomorrow. */
        [XmlElement(name="cycleTomorrow")]
        public var cycleTomorrow: Number = 0;
        /* ID of the driver. */
        [XmlElement(name="driverId")]
        public var driverId: Number = 0;
        /* Name of the driver. */
        [XmlElement(name="driverName")]
        public var driverName: String = null;
        /* The amount of driving time in violation in this cycle (in ms). */
        [XmlElement(name="drivingInViolationCycle")]
        public var drivingInViolationCycle: Number = 0;
        /* The amount of driving time in violation today (in ms). */
        [XmlElement(name="drivingInViolationToday")]
        public var drivingInViolationToday: Number = 0;
        /* The Hours of Service status type. One of &#x60;OFF_DUTY&#x60;, &#x60;SLEEPER_BED&#x60;, &#x60;DRIVING&#x60;, &#x60;ON_DUTY&#x60;, &#x60;YARD_MOVE&#x60;, &#x60;PERSONAL_CONVEYANCE&#x60;. */
        [XmlElement(name="dutyStatus")]
        public var dutyStatus: String = null;
        /* The amount of remaining shift drive time (in ms). */
        [XmlElement(name="shiftDriveRemaining")]
        public var shiftDriveRemaining: Number = 0;
        /* The amount of remaining shift time (in ms). */
        [XmlElement(name="shiftRemaining")]
        public var shiftRemaining: Number = 0;
        /* The amount of time (in ms) that the driver has been in the current &#x60;dutyStatus&#x60;. */
        [XmlElement(name="timeInCurrentStatus")]
        public var timeInCurrentStatus: Number = 0;
        /* The amount of time (in ms) remaining until the driver cannot drive without a rest break. */
        [XmlElement(name="timeUntilBreak")]
        public var timeUntilBreak: Number = 0;
        /* Name of the vehicle. */
        [XmlElement(name="vehicleName")]
        public var vehicleName: String = null;

    public function toString(): String {
        var str: String = "HosLogsSummaryResponseDrivers: ";
        str += " (cycleRemaining: " + cycleRemaining + ")";
        str += " (cycleTomorrow: " + cycleTomorrow + ")";
        str += " (driverId: " + driverId + ")";
        str += " (driverName: " + driverName + ")";
        str += " (drivingInViolationCycle: " + drivingInViolationCycle + ")";
        str += " (drivingInViolationToday: " + drivingInViolationToday + ")";
        str += " (dutyStatus: " + dutyStatus + ")";
        str += " (shiftDriveRemaining: " + shiftDriveRemaining + ")";
        str += " (shiftRemaining: " + shiftRemaining + ")";
        str += " (timeInCurrentStatus: " + timeInCurrentStatus + ")";
        str += " (timeUntilBreak: " + timeUntilBreak + ")";
        str += " (vehicleName: " + vehicleName + ")";
        return str;
    }

}

}
