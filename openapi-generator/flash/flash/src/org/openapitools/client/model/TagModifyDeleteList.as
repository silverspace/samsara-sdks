package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.TaggedAssetBase;
import org.openapitools.client.model.TaggedDriverBase;
import org.openapitools.client.model.TaggedMachineBase;
import org.openapitools.client.model.TaggedSensorBase;
import org.openapitools.client.model.TaggedVehicleBase;

    public class TagModifyDeleteList implements ListWrapper {
        // This declaration below of _TagModify_delete_obj_class is to force flash compiler to include this class
        private var _tagModifyDelete_obj_class: org.openapitools.client.model.TagModifyDelete = null;
        [XmlElements(name="tagModifyDelete", type="org.openapitools.client.model.TagModifyDelete")]
        public var tagModifyDelete: Array = new Array();

        public function getList(): Array{
            return tagModifyDelete;
        }

}

}
