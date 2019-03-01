package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.TripResponseEndCoordinates;
import samsara.client.model.TripResponseStartCoordinates;

    public class TripResponseTripsList implements ListWrapper {
        // This declaration below of _TripResponse_trips_obj_class is to force flash compiler to include this class
        private var _tripResponseTrips_obj_class: samsara.client.model.TripResponseTrips = null;
        [XmlElements(name="tripResponseTrips", type="samsara.client.model.TripResponseTrips")]
        public var tripResponseTrips: Array = new Array();

        public function getList(): Array{
            return tripResponseTrips;
        }

}

}
