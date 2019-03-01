package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class DispatchJobCreateList implements ListWrapper {
        // This declaration below of _DispatchJobCreate_obj_class is to force flash compiler to include this class
        private var _dispatchJobCreate_obj_class: org.openapitools.client.model.DispatchJobCreate = null;
        [XmlElements(name="dispatchJobCreate", type="org.openapitools.client.model.DispatchJobCreate")]
        public var dispatchJobCreate: Array = new Array();

        public function getList(): Array{
            return dispatchJobCreate;
        }

}

}
