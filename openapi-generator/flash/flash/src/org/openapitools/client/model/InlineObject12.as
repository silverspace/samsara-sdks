package org.openapitools.client.model {


    [XmlRootNode(name="InlineObject12")]
    public class InlineObject12 {
        /* Only type &#39;mechanic&#39; is currently accepted. */
        [XmlElement(name="inspectionType")]
        public var inspectionType: String = null;
        /* Any notes from the mechanic. */
        [XmlElement(name="mechanicNotes")]
        public var mechanicNotes: String = null;
        /* The current odometer of the vehicle. */
        [XmlElement(name="odometerMiles")]
        public var odometerMiles: Number = 0;
        /* Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. */
        [XmlElement(name="previousDefectsCorrected")]
        public var previousDefectsCorrected: Boolean = false;
        /* Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. */
        [XmlElement(name="previousDefectsIgnored")]
        public var previousDefectsIgnored: Boolean = false;
        /* Whether or not this vehicle or trailer is safe to drive. */
        [XmlElement(name="safe")]
        public var safe: String = null;
        /* Id of trailer being inspected. Either vehicleId or trailerId must be provided. */
        [XmlElement(name="trailerId")]
        public var trailerId: Number = 0;
        /* The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user&#39;s email. */
        [XmlElement(name="userEmail")]
        public var userEmail: String = null;
        /* Id of vehicle being inspected. Either vehicleId or trailerId must be provided. */
        [XmlElement(name="vehicleId")]
        public var vehicleId: Number = 0;

    public function toString(): String {
        var str: String = "InlineObject12: ";
        str += " (inspectionType: " + inspectionType + ")";
        str += " (mechanicNotes: " + mechanicNotes + ")";
        str += " (odometerMiles: " + odometerMiles + ")";
        str += " (previousDefectsCorrected: " + previousDefectsCorrected + ")";
        str += " (previousDefectsIgnored: " + previousDefectsIgnored + ")";
        str += " (safe: " + safe + ")";
        str += " (trailerId: " + trailerId + ")";
        str += " (userEmail: " + userEmail + ")";
        str += " (vehicleId: " + vehicleId + ")";
        return str;
    }

}

}
