package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.TaggedAssetBase;
import org.openapitools.client.model.TaggedDriverBase;
import org.openapitools.client.model.TaggedMachineBase;
import org.openapitools.client.model.TaggedSensorBase;
import org.openapitools.client.model.TaggedVehicleBase;

    public class TagUpdateList implements ListWrapper {
        // This declaration below of _TagUpdate_obj_class is to force flash compiler to include this class
        private var _tagUpdate_obj_class: org.openapitools.client.model.TagUpdate = null;
        [XmlElements(name="tagUpdate", type="org.openapitools.client.model.TagUpdate")]
        public var tagUpdate: Array = new Array();

        public function getList(): Array{
            return tagUpdate;
        }

}

}
