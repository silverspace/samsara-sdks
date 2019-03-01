package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.TemperatureResponseSensors;

    public class TemperatureResponseList implements ListWrapper {
        // This declaration below of _TemperatureResponse_obj_class is to force flash compiler to include this class
        private var _temperatureResponse_obj_class: samsara.client.model.TemperatureResponse = null;
        [XmlElements(name="temperatureResponse", type="samsara.client.model.TemperatureResponse")]
        public var temperatureResponse: Array = new Array();

        public function getList(): Array{
            return temperatureResponse;
        }

}

}
