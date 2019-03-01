package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class DriversSummaryParamList implements ListWrapper {
        // This declaration below of _driversSummaryParam_obj_class is to force flash compiler to include this class
        private var _driversSummaryParam_obj_class: samsara.client.model.DriversSummaryParam = null;
        [XmlElements(name="driversSummaryParam", type="samsara.client.model.DriversSummaryParam")]
        public var driversSummaryParam: Array = new Array();

        public function getList(): Array{
            return driversSummaryParam;
        }

}

}
