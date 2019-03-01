package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class ReactivateDriverParamList implements ListWrapper {
        // This declaration below of _reactivateDriverParam_obj_class is to force flash compiler to include this class
        private var _reactivateDriverParam_obj_class: samsara.client.model.ReactivateDriverParam = null;
        [XmlElements(name="reactivateDriverParam", type="samsara.client.model.ReactivateDriverParam")]
        public var reactivateDriverParam: Array = new Array();

        public function getList(): Array{
            return reactivateDriverParam;
        }

}

}
