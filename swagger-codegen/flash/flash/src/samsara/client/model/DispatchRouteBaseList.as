package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class DispatchRouteBaseList implements ListWrapper {
        // This declaration below of _DispatchRouteBase_obj_class is to force flash compiler to include this class
        private var _dispatchRouteBase_obj_class: samsara.client.model.DispatchRouteBase = null;
        [XmlElements(name="dispatchRouteBase", type="samsara.client.model.DispatchRouteBase")]
        public var dispatchRouteBase: Array = new Array();

        public function getList(): Array{
            return dispatchRouteBase;
        }

}

}
