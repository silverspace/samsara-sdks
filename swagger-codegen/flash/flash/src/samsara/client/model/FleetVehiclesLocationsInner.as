package samsara.client.model {

import samsara.client.model.FleetVehicleLocations;

    [XmlRootNode(name="FleetVehiclesLocationsInner")]
    public class FleetVehiclesLocationsInner {
        /* ID of the vehicle. */
        [XmlElement(name="id")]
        public var id: Number = 0;
                [XmlElement(name="locations")]
        public var locations: FleetVehicleLocations = NaN;
        /* Name of the vehicle. */
        [XmlElement(name="name")]
        public var name: String = null;

    public function toString(): String {
        var str: String = "FleetVehiclesLocationsInner: ";
        str += " (id: " + id + ")";
        str += " (locations: " + locations + ")";
        str += " (name: " + name + ")";
        return str;
    }

}

}
