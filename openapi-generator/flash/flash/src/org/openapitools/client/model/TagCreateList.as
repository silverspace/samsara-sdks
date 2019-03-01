package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.TaggedAssetBase;
import org.openapitools.client.model.TaggedDriverBase;
import org.openapitools.client.model.TaggedMachineBase;
import org.openapitools.client.model.TaggedSensorBase;
import org.openapitools.client.model.TaggedVehicleBase;

    public class TagCreateList implements ListWrapper {
        // This declaration below of _TagCreate_obj_class is to force flash compiler to include this class
        private var _tagCreate_obj_class: org.openapitools.client.model.TagCreate = null;
        [XmlElements(name="tagCreate", type="org.openapitools.client.model.TagCreate")]
        public var tagCreate: Array = new Array();

        public function getList(): Array{
            return tagCreate;
        }

}

}
