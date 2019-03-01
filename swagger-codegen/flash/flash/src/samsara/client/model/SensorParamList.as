package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class SensorParamList implements ListWrapper {
        // This declaration below of _sensorParam_obj_class is to force flash compiler to include this class
        private var _sensorParam_obj_class: samsara.client.model.SensorParam = null;
        [XmlElements(name="sensorParam", type="samsara.client.model.SensorParam")]
        public var sensorParam: Array = new Array();

        public function getList(): Array{
            return sensorParam;
        }

}

}
