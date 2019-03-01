package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.TaggedAssetBase;
import samsara.client.model.TaggedDriverBase;
import samsara.client.model.TaggedMachineBase;
import samsara.client.model.TaggedSensorBase;
import samsara.client.model.TaggedVehicleBase;

    public class TagModifyAddList implements ListWrapper {
        // This declaration below of _TagModify_add_obj_class is to force flash compiler to include this class
        private var _tagModifyAdd_obj_class: samsara.client.model.TagModifyAdd = null;
        [XmlElements(name="tagModifyAdd", type="samsara.client.model.TagModifyAdd")]
        public var tagModifyAdd: Array = new Array();

        public function getList(): Array{
            return tagModifyAdd;
        }

}

}
