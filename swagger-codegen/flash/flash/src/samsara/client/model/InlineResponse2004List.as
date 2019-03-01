package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.VehicleMaintenance;

    public class InlineResponse2004List implements ListWrapper {
        // This declaration below of _inline_response_200_4_obj_class is to force flash compiler to include this class
        private var _inlineResponse2004_obj_class: samsara.client.model.InlineResponse2004 = null;
        [XmlElements(name="inlineResponse2004", type="samsara.client.model.InlineResponse2004")]
        public var inlineResponse2004: Array = new Array();

        public function getList(): Array{
            return inlineResponse2004;
        }

}

}
