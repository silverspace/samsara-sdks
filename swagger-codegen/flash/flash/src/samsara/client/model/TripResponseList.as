package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.TripResponseTrips;

    public class TripResponseList implements ListWrapper {
        // This declaration below of _TripResponse_obj_class is to force flash compiler to include this class
        private var _tripResponse_obj_class: samsara.client.model.TripResponse = null;
        [XmlElements(name="tripResponse", type="samsara.client.model.TripResponse")]
        public var tripResponse: Array = new Array();

        public function getList(): Array{
            return tripResponse;
        }

}

}
