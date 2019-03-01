package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.TripResponseTrips;

    public class TripResponseList implements ListWrapper {
        // This declaration below of _TripResponse_obj_class is to force flash compiler to include this class
        private var _tripResponse_obj_class: org.openapitools.client.model.TripResponse = null;
        [XmlElements(name="tripResponse", type="org.openapitools.client.model.TripResponse")]
        public var tripResponse: Array = new Array();

        public function getList(): Array{
            return tripResponse;
        }

}

}
