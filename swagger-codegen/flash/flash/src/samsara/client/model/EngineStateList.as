package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class EngineStateList implements ListWrapper {
        // This declaration below of _EngineState_obj_class is to force flash compiler to include this class
        private var _engineState_obj_class: samsara.client.model.EngineState = null;
        [XmlElements(name="engineState", type="samsara.client.model.EngineState")]
        public var engineState: Array = new Array();

        public function getList(): Array{
            return engineState;
        }

}

}
