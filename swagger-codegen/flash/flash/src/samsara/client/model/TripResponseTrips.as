package samsara.client.model {

import samsara.client.model.TripResponseEndCoordinates;
import samsara.client.model.TripResponseStartCoordinates;

    [XmlRootNode(name="TripResponseTrips")]
    public class TripResponseTrips {
        /* Length of the trip in meters. */
        [XmlElement(name="distanceMeters")]
        public var distanceMeters: Number = NaN;
        /* ID of the driver. */
        [XmlElement(name="driverId")]
        public var driverId: Number = NaN;
        /* Text representation of nearest identifiable location to the end (latitude, longitude) coordinates. */
        [XmlElement(name="endAddress")]
        public var endAddress: String = null;
                [XmlElement(name="endCoordinates")]
        public var endCoordinates: TripResponseEndCoordinates = NaN;
        /* Geocoded street address of start (latitude, longitude) coordinates. */
        [XmlElement(name="endLocation")]
        public var endLocation: String = null;
        /* End of the trip in UNIX milliseconds. */
        [XmlElement(name="endMs")]
        public var endMs: Number = NaN;
        /* Odometer reading at the end of the trip. */
        [XmlElement(name="endOdometer")]
        public var endOdometer: Number = NaN;
        /* Amount in milliliters of fuel consumed on this trip. */
        [XmlElement(name="fuelConsumedMl")]
        public var fuelConsumedMl: Number = NaN;
        /* Text representation of nearest identifiable location to the start (latitude, longitude) coordinates. */
        [XmlElement(name="startAddress")]
        public var startAddress: String = null;
                [XmlElement(name="startCoordinates")]
        public var startCoordinates: TripResponseStartCoordinates = NaN;
        /* Geocoded street address of start (latitude, longitude) coordinates. */
        [XmlElement(name="startLocation")]
        public var startLocation: String = null;
        /* Beginning of the trip in UNIX milliseconds. */
        [XmlElement(name="startMs")]
        public var startMs: Number = NaN;
        /* Odometer reading at the beginning of the trip. */
        [XmlElement(name="startOdometer")]
        public var startOdometer: Number = NaN;
        /* Length in meters trip spent on toll roads. */
        [XmlElement(name="tollMeters")]
        public var tollMeters: Number = NaN;

    public function toString(): String {
        var str: String = "TripResponseTrips: ";
        str += " (distanceMeters: " + distanceMeters + ")";
        str += " (driverId: " + driverId + ")";
        str += " (endAddress: " + endAddress + ")";
        str += " (endCoordinates: " + endCoordinates + ")";
        str += " (endLocation: " + endLocation + ")";
        str += " (endMs: " + endMs + ")";
        str += " (endOdometer: " + endOdometer + ")";
        str += " (fuelConsumedMl: " + fuelConsumedMl + ")";
        str += " (startAddress: " + startAddress + ")";
        str += " (startCoordinates: " + startCoordinates + ")";
        str += " (startLocation: " + startLocation + ")";
        str += " (startMs: " + startMs + ")";
        str += " (startOdometer: " + startOdometer + ")";
        str += " (tollMeters: " + tollMeters + ")";
        return str;
    }

}

}
