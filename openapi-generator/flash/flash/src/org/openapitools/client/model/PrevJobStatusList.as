package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class PrevJobStatusList implements ListWrapper {
        // This declaration below of _prevJobStatus_obj_class is to force flash compiler to include this class
        private var _prevJobStatus_obj_class: org.openapitools.client.model.PrevJobStatus = null;
        [XmlElements(name="prevJobStatus", type="org.openapitools.client.model.PrevJobStatus")]
        public var prevJobStatus: Array = new Array();

        public function getList(): Array{
            return prevJobStatus;
        }

}

}
