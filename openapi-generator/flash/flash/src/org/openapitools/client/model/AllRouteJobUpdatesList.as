package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.JobUpdateObject;

    public class AllRouteJobUpdatesList implements ListWrapper {
        // This declaration below of _allRouteJobUpdates_obj_class is to force flash compiler to include this class
        private var _allRouteJobUpdates_obj_class: org.openapitools.client.model.AllRouteJobUpdates = null;
        [XmlElements(name="allRouteJobUpdates", type="org.openapitools.client.model.AllRouteJobUpdates")]
        public var allRouteJobUpdates: Array = new Array();

        public function getList(): Array{
            return allRouteJobUpdates;
        }

}

}
