package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.CargoResponseSensors;

    public class CargoResponseList implements ListWrapper {
        // This declaration below of _CargoResponse_obj_class is to force flash compiler to include this class
        private var _cargoResponse_obj_class: samsara.client.model.CargoResponse = null;
        [XmlElements(name="cargoResponse", type="samsara.client.model.CargoResponse")]
        public var cargoResponse: Array = new Array();

        public function getList(): Array{
            return cargoResponse;
        }

}

}
