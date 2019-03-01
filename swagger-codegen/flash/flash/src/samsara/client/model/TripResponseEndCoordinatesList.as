package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class TripResponseEndCoordinatesList implements ListWrapper {
        // This declaration below of _TripResponse_endCoordinates_obj_class is to force flash compiler to include this class
        private var _tripResponseEndCoordinates_obj_class: samsara.client.model.TripResponseEndCoordinates = null;
        [XmlElements(name="tripResponseEndCoordinates", type="samsara.client.model.TripResponseEndCoordinates")]
        public var tripResponseEndCoordinates: Array = new Array();

        public function getList(): Array{
            return tripResponseEndCoordinates;
        }

}

}
