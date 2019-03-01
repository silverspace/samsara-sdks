package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class DataList implements ListWrapper {
        // This declaration below of _data_obj_class is to force flash compiler to include this class
        private var _data_obj_class: samsara.client.model.Data = null;
        [XmlElements(name="data", type="samsara.client.model.Data")]
        public var data: Array = new Array();

        public function getList(): Array{
            return data;
        }

}

}
