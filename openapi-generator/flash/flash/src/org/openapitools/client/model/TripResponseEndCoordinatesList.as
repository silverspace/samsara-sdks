package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class TripResponseEndCoordinatesList implements ListWrapper {
        // This declaration below of _TripResponse_endCoordinates_obj_class is to force flash compiler to include this class
        private var _tripResponseEndCoordinates_obj_class: org.openapitools.client.model.TripResponseEndCoordinates = null;
        [XmlElements(name="tripResponseEndCoordinates", type="org.openapitools.client.model.TripResponseEndCoordinates")]
        public var tripResponseEndCoordinates: Array = new Array();

        public function getList(): Array{
            return tripResponseEndCoordinates;
        }

}

}
