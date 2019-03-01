package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class CreateDvirParamList implements ListWrapper {
        // This declaration below of _createDvirParam_obj_class is to force flash compiler to include this class
        private var _createDvirParam_obj_class: samsara.client.model.CreateDvirParam = null;
        [XmlElements(name="createDvirParam", type="samsara.client.model.CreateDvirParam")]
        public var createDvirParam: Array = new Array();

        public function getList(): Array{
            return createDvirParam;
        }

}

}
