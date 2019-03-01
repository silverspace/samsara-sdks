package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.TaggedAssetBase;
import samsara.client.model.TaggedDriverBase;
import samsara.client.model.TaggedMachineBase;
import samsara.client.model.TaggedSensorBase;
import samsara.client.model.TaggedVehicleBase;

    public class TagModifyDeleteList implements ListWrapper {
        // This declaration below of _TagModify_delete_obj_class is to force flash compiler to include this class
        private var _tagModifyDelete_obj_class: samsara.client.model.TagModifyDelete = null;
        [XmlElements(name="tagModifyDelete", type="samsara.client.model.TagModifyDelete")]
        public var tagModifyDelete: Array = new Array();

        public function getList(): Array{
            return tagModifyDelete;
        }

}

}
