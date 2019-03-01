package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class DispatchJobCreateList implements ListWrapper {
        // This declaration below of _DispatchJobCreate_obj_class is to force flash compiler to include this class
        private var _dispatchJobCreate_obj_class: samsara.client.model.DispatchJobCreate = null;
        [XmlElements(name="dispatchJobCreate", type="samsara.client.model.DispatchJobCreate")]
        public var dispatchJobCreate: Array = new Array();

        public function getList(): Array{
            return dispatchJobCreate;
        }

}

}
