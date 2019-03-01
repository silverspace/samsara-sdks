package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DispatchJobCreate;
import org.openapitools.client.model.DispatchRouteBase;

    public class DispatchRouteCreateList implements ListWrapper {
        // This declaration below of _DispatchRouteCreate_obj_class is to force flash compiler to include this class
        private var _dispatchRouteCreate_obj_class: org.openapitools.client.model.DispatchRouteCreate = null;
        [XmlElements(name="dispatchRouteCreate", type="org.openapitools.client.model.DispatchRouteCreate")]
        public var dispatchRouteCreate: Array = new Array();

        public function getList(): Array{
            return dispatchRouteCreate;
        }

}

}
