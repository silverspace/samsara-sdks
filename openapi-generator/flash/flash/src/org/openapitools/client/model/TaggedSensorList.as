package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.TaggedSensorBase;

    public class TaggedSensorList implements ListWrapper {
        // This declaration below of _TaggedSensor_obj_class is to force flash compiler to include this class
        private var _taggedSensor_obj_class: org.openapitools.client.model.TaggedSensor = null;
        [XmlElements(name="taggedSensor", type="org.openapitools.client.model.TaggedSensor")]
        public var taggedSensor: Array = new Array();

        public function getList(): Array{
            return taggedSensor;
        }

}

}
