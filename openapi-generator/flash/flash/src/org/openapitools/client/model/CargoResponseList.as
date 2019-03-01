package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.CargoResponseSensors;

    public class CargoResponseList implements ListWrapper {
        // This declaration below of _CargoResponse_obj_class is to force flash compiler to include this class
        private var _cargoResponse_obj_class: org.openapitools.client.model.CargoResponse = null;
        [XmlElements(name="cargoResponse", type="org.openapitools.client.model.CargoResponse")]
        public var cargoResponse: Array = new Array();

        public function getList(): Array{
            return cargoResponse;
        }

}

}
