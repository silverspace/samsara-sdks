package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.DispatchJob;
import samsara.client.model.DispatchRouteBase;

    public class DispatchRouteList implements ListWrapper {
        // This declaration below of _DispatchRoute_obj_class is to force flash compiler to include this class
        private var _dispatchRoute_obj_class: samsara.client.model.DispatchRoute = null;
        [XmlElements(name="dispatchRoute", type="samsara.client.model.DispatchRoute")]
        public var dispatchRoute: Array = new Array();

        public function getList(): Array{
            return dispatchRoute;
        }

}

}
