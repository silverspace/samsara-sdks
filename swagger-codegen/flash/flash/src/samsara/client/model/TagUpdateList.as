package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.TaggedAssetBase;
import samsara.client.model.TaggedDriverBase;
import samsara.client.model.TaggedMachineBase;
import samsara.client.model.TaggedSensorBase;
import samsara.client.model.TaggedVehicleBase;

    public class TagUpdateList implements ListWrapper {
        // This declaration below of _TagUpdate_obj_class is to force flash compiler to include this class
        private var _tagUpdate_obj_class: samsara.client.model.TagUpdate = null;
        [XmlElements(name="tagUpdate", type="samsara.client.model.TagUpdate")]
        public var tagUpdate: Array = new Array();

        public function getList(): Array{
            return tagUpdate;
        }

}

}
