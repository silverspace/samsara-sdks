package samsara.client.model {

import samsara.client.model.TripResponseTrips;

    [XmlRootNode(name="TripResponse")]
    public class TripResponse {
                // This declaration below of _trips_obj_class is to force flash compiler to include this class
        private var _trips_obj_class: Array = null;
        [XmlElementWrapper(name="trips")]
        [XmlElements(name="trips", type="Array")]
                public var trips: Array = new Array();

    public function toString(): String {
        var str: String = "TripResponse: ";
        str += " (trips: " + trips + ")";
        return str;
    }

}

}
