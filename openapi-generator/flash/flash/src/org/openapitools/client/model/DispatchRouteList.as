package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DispatchJob;
import org.openapitools.client.model.DispatchRouteBase;

    public class DispatchRouteList implements ListWrapper {
        // This declaration below of _DispatchRoute_obj_class is to force flash compiler to include this class
        private var _dispatchRoute_obj_class: org.openapitools.client.model.DispatchRoute = null;
        [XmlElements(name="dispatchRoute", type="org.openapitools.client.model.DispatchRoute")]
        public var dispatchRoute: Array = new Array();

        public function getList(): Array{
            return dispatchRoute;
        }

}

}
