package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.InlineResponse2005VehicleStats;
import samsara.client.model.Pagination;

    public class InlineResponse2005List implements ListWrapper {
        // This declaration below of _inline_response_200_5_obj_class is to force flash compiler to include this class
        private var _inlineResponse2005_obj_class: samsara.client.model.InlineResponse2005 = null;
        [XmlElements(name="inlineResponse2005", type="samsara.client.model.InlineResponse2005")]
        public var inlineResponse2005: Array = new Array();

        public function getList(): Array{
            return inlineResponse2005;
        }

}

}
