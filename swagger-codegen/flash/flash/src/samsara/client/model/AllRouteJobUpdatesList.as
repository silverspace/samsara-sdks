package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.JobUpdateObject;

    public class AllRouteJobUpdatesList implements ListWrapper {
        // This declaration below of _allRouteJobUpdates_obj_class is to force flash compiler to include this class
        private var _allRouteJobUpdates_obj_class: samsara.client.model.AllRouteJobUpdates = null;
        [XmlElements(name="allRouteJobUpdates", type="samsara.client.model.AllRouteJobUpdates")]
        public var allRouteJobUpdates: Array = new Array();

        public function getList(): Array{
            return allRouteJobUpdates;
        }

}

}
