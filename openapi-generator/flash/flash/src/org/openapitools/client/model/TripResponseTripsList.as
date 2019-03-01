package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.TripResponseEndCoordinates;
import org.openapitools.client.model.TripResponseStartCoordinates;

    public class TripResponseTripsList implements ListWrapper {
        // This declaration below of _TripResponse_trips_obj_class is to force flash compiler to include this class
        private var _tripResponseTrips_obj_class: org.openapitools.client.model.TripResponseTrips = null;
        [XmlElements(name="tripResponseTrips", type="org.openapitools.client.model.TripResponseTrips")]
        public var tripResponseTrips: Array = new Array();

        public function getList(): Array{
            return tripResponseTrips;
        }

}

}
