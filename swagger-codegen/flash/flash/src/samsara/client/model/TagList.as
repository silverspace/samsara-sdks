package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.TaggedAddress;
import samsara.client.model.TaggedAsset;
import samsara.client.model.TaggedDriver;
import samsara.client.model.TaggedMachine;
import samsara.client.model.TaggedSensor;
import samsara.client.model.TaggedVehicle;

    public class TagList implements ListWrapper {
        // This declaration below of _Tag_obj_class is to force flash compiler to include this class
        private var _tag_obj_class: samsara.client.model.Tag = null;
        [XmlElements(name="tag", type="samsara.client.model.Tag")]
        public var tag: Array = new Array();

        public function getList(): Array{
            return tag;
        }

}

}
