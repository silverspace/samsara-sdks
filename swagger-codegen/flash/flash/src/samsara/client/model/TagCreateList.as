package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.TaggedAssetBase;
import samsara.client.model.TaggedDriverBase;
import samsara.client.model.TaggedMachineBase;
import samsara.client.model.TaggedSensorBase;
import samsara.client.model.TaggedVehicleBase;

    public class TagCreateList implements ListWrapper {
        // This declaration below of _TagCreate_obj_class is to force flash compiler to include this class
        private var _tagCreate_obj_class: samsara.client.model.TagCreate = null;
        [XmlElements(name="tagCreate", type="samsara.client.model.TagCreate")]
        public var tagCreate: Array = new Array();

        public function getList(): Array{
            return tagCreate;
        }

}

}
