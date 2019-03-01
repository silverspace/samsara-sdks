package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class PrevJobStatusList implements ListWrapper {
        // This declaration below of _prevJobStatus_obj_class is to force flash compiler to include this class
        private var _prevJobStatus_obj_class: samsara.client.model.PrevJobStatus = null;
        [XmlElements(name="prevJobStatus", type="samsara.client.model.PrevJobStatus")]
        public var prevJobStatus: Array = new Array();

        public function getList(): Array{
            return prevJobStatus;
        }

}

}
