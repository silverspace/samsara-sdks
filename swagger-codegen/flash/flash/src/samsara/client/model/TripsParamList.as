package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class TripsParamList implements ListWrapper {
        // This declaration below of _tripsParam_obj_class is to force flash compiler to include this class
        private var _tripsParam_obj_class: samsara.client.model.TripsParam = null;
        [XmlElements(name="tripsParam", type="samsara.client.model.TripsParam")]
        public var tripsParam: Array = new Array();

        public function getList(): Array{
            return tripsParam;
        }

}

}
