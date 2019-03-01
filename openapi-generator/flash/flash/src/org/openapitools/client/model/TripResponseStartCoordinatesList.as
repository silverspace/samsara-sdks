package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class TripResponseStartCoordinatesList implements ListWrapper {
        // This declaration below of _TripResponse_startCoordinates_obj_class is to force flash compiler to include this class
        private var _tripResponseStartCoordinates_obj_class: org.openapitools.client.model.TripResponseStartCoordinates = null;
        [XmlElements(name="tripResponseStartCoordinates", type="org.openapitools.client.model.TripResponseStartCoordinates")]
        public var tripResponseStartCoordinates: Array = new Array();

        public function getList(): Array{
            return tripResponseStartCoordinates;
        }

}

}
