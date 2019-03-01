package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class CargoResponseSensorsList implements ListWrapper {
        // This declaration below of _CargoResponse_sensors_obj_class is to force flash compiler to include this class
        private var _cargoResponseSensors_obj_class: org.openapitools.client.model.CargoResponseSensors = null;
        [XmlElements(name="cargoResponseSensors", type="org.openapitools.client.model.CargoResponseSensors")]
        public var cargoResponseSensors: Array = new Array();

        public function getList(): Array{
            return cargoResponseSensors;
        }

}

}
