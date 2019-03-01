package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.TaggedAddress;
import org.openapitools.client.model.TaggedAsset;
import org.openapitools.client.model.TaggedDriver;
import org.openapitools.client.model.TaggedMachine;
import org.openapitools.client.model.TaggedSensor;
import org.openapitools.client.model.TaggedVehicle;

    public class TagList implements ListWrapper {
        // This declaration below of _Tag_obj_class is to force flash compiler to include this class
        private var _tag_obj_class: org.openapitools.client.model.Tag = null;
        [XmlElements(name="tag", type="org.openapitools.client.model.Tag")]
        public var tag: Array = new Array();

        public function getList(): Array{
            return tag;
        }

}

}
