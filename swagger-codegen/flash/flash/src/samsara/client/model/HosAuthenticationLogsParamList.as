package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class HosAuthenticationLogsParamList implements ListWrapper {
        // This declaration below of _hosAuthenticationLogsParam_obj_class is to force flash compiler to include this class
        private var _hosAuthenticationLogsParam_obj_class: samsara.client.model.HosAuthenticationLogsParam = null;
        [XmlElements(name="hosAuthenticationLogsParam", type="samsara.client.model.HosAuthenticationLogsParam")]
        public var hosAuthenticationLogsParam: Array = new Array();

        public function getList(): Array{
            return hosAuthenticationLogsParam;
        }

}

}
