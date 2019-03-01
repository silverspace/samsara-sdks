package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.TaggedSensorBase;

    public class TaggedSensorList implements ListWrapper {
        // This declaration below of _TaggedSensor_obj_class is to force flash compiler to include this class
        private var _taggedSensor_obj_class: samsara.client.model.TaggedSensor = null;
        [XmlElements(name="taggedSensor", type="samsara.client.model.TaggedSensor")]
        public var taggedSensor: Array = new Array();

        public function getList(): Array{
            return taggedSensor;
        }

}

}
