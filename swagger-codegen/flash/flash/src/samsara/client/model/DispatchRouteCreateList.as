package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.DispatchJobCreate;
import samsara.client.model.DispatchRouteBase;

    public class DispatchRouteCreateList implements ListWrapper {
        // This declaration below of _DispatchRouteCreate_obj_class is to force flash compiler to include this class
        private var _dispatchRouteCreate_obj_class: samsara.client.model.DispatchRouteCreate = null;
        [XmlElements(name="dispatchRouteCreate", type="samsara.client.model.DispatchRouteCreate")]
        public var dispatchRouteCreate: Array = new Array();

        public function getList(): Array{
            return dispatchRouteCreate;
        }

}

}
