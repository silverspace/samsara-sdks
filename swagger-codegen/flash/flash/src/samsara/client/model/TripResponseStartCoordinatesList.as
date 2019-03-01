package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class TripResponseStartCoordinatesList implements ListWrapper {
        // This declaration below of _TripResponse_startCoordinates_obj_class is to force flash compiler to include this class
        private var _tripResponseStartCoordinates_obj_class: samsara.client.model.TripResponseStartCoordinates = null;
        [XmlElements(name="tripResponseStartCoordinates", type="samsara.client.model.TripResponseStartCoordinates")]
        public var tripResponseStartCoordinates: Array = new Array();

        public function getList(): Array{
            return tripResponseStartCoordinates;
        }

}

}
