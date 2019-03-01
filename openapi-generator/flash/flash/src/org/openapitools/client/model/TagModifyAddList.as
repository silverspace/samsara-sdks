package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.TaggedAssetBase;
import org.openapitools.client.model.TaggedDriverBase;
import org.openapitools.client.model.TaggedMachineBase;
import org.openapitools.client.model.TaggedSensorBase;
import org.openapitools.client.model.TaggedVehicleBase;

    public class TagModifyAddList implements ListWrapper {
        // This declaration below of _TagModify_add_obj_class is to force flash compiler to include this class
        private var _tagModifyAdd_obj_class: org.openapitools.client.model.TagModifyAdd = null;
        [XmlElements(name="tagModifyAdd", type="org.openapitools.client.model.TagModifyAdd")]
        public var tagModifyAdd: Array = new Array();

        public function getList(): Array{
            return tagModifyAdd;
        }

}

}
