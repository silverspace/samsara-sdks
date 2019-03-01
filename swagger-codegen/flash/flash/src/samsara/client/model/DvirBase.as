package samsara.client.model {

import samsara.client.model.DvirBaseAuthorSignature;
import samsara.client.model.DvirBaseMechanicOrAgentSignature;
import samsara.client.model.DvirBaseNextDriverSignature;
import samsara.client.model.DvirBaseTrailerDefects;
import samsara.client.model.DvirBaseVehicle;

    [XmlRootNode(name="DvirBase")]
    public class DvirBase {
                [XmlElement(name="authorSignature")]
        public var authorSignature: DvirBaseAuthorSignature = NaN;
        /* Signifies if the defects on the vehicle corrected after the DVIR is done. */
        [XmlElement(name="defectsCorrected")]
        public var defectsCorrected: Boolean = false;
        /* Signifies if the defects on this vehicle can be ignored. */
        [XmlElement(name="defectsNeedNotBeCorrected")]
        public var defectsNeedNotBeCorrected: Boolean = false;
        /* The id of this DVIR record. */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* Inspection type of the DVIR. */
        [XmlElement(name="inspectionType")]
        public var inspectionType: String = null;
        /* The mechanics notes on the DVIR. */
        [XmlElement(name="mechanicNotes")]
        public var mechanicNotes: String = null;
                [XmlElement(name="mechanicOrAgentSignature")]
        public var mechanicOrAgentSignature: DvirBaseMechanicOrAgentSignature = NaN;
                [XmlElement(name="nextDriverSignature")]
        public var nextDriverSignature: DvirBaseNextDriverSignature = NaN;
        /* The odometer reading in miles for the vehicle when the DVIR was done. */
        [XmlElement(name="odometerMiles")]
        public var odometerMiles: Number = 0;
        /* Timestamp of this DVIR in UNIX milliseconds. */
        [XmlElement(name="timeMs")]
        public var timeMs: Number = 0;
        /* Defects registered for the trailer which was part of the DVIR. */
        // This declaration below of _trailerDefects_obj_class is to force flash compiler to include this class
        private var _trailerDefects_obj_class: Array = null;
        [XmlElementWrapper(name="trailerDefects")]
        [XmlElements(name="trailerDefects", type="Array")]
                public var trailerDefects: Array = new Array();
        /* The id of the trailer which was part of the DVIR. */
        [XmlElement(name="trailerId")]
        public var trailerId: Number = NaN;
        /* The name of the trailer which was part of the DVIR. */
        [XmlElement(name="trailerName")]
        public var trailerName: String = null;
                [XmlElement(name="vehicle")]
        public var vehicle: DvirBaseVehicle = NaN;
        /* The condition of vechile on which DVIR was done. */
        [XmlElement(name="vehicleCondition")]
        public var vehicleCondition: String = null;
        /* Defects registered for the vehicle which was part of the DVIR. */
        // This declaration below of _vehicleDefects_obj_class is to force flash compiler to include this class
        private var _vehicleDefects_obj_class: Array = null;
        [XmlElementWrapper(name="vehicleDefects")]
        [XmlElements(name="vehicleDefects", type="Array")]
                public var vehicleDefects: Array = new Array();

    public function toString(): String {
        var str: String = "DvirBase: ";
        str += " (authorSignature: " + authorSignature + ")";
        str += " (defectsCorrected: " + defectsCorrected + ")";
        str += " (defectsNeedNotBeCorrected: " + defectsNeedNotBeCorrected + ")";
        str += " (id: " + id + ")";
        str += " (inspectionType: " + inspectionType + ")";
        str += " (mechanicNotes: " + mechanicNotes + ")";
        str += " (mechanicOrAgentSignature: " + mechanicOrAgentSignature + ")";
        str += " (nextDriverSignature: " + nextDriverSignature + ")";
        str += " (odometerMiles: " + odometerMiles + ")";
        str += " (timeMs: " + timeMs + ")";
        str += " (trailerDefects: " + trailerDefects + ")";
        str += " (trailerId: " + trailerId + ")";
        str += " (trailerName: " + trailerName + ")";
        str += " (vehicle: " + vehicle + ")";
        str += " (vehicleCondition: " + vehicleCondition + ")";
        str += " (vehicleDefects: " + vehicleDefects + ")";
        return str;
    }

}

}
