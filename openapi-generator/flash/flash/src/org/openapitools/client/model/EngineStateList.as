package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.Object;

    public class EngineStateList implements ListWrapper {
        // This declaration below of _EngineState_obj_class is to force flash compiler to include this class
        private var _engineState_obj_class: org.openapitools.client.model.EngineState = null;
        [XmlElements(name="engineState", type="org.openapitools.client.model.EngineState")]
        public var engineState: Array = new Array();

        public function getList(): Array{
            return engineState;
        }

}

}
