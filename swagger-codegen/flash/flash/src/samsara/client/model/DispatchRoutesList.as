package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.DispatchRoute;

    public class DispatchRoutesList implements ListWrapper {
        // This declaration below of _DispatchRoutes_obj_class is to force flash compiler to include this class
        private var _dispatchRoutes_obj_class: samsara.client.model.DispatchRoutes = null;
        [XmlElements(name="dispatchRoutes", type="samsara.client.model.DispatchRoutes")]
        public var dispatchRoutes: Array = new Array();

        public function getList(): Array{
            return dispatchRoutes;
        }

}

}
