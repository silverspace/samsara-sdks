package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class ContactIdsList implements ListWrapper {
        // This declaration below of _ContactIds_obj_class is to force flash compiler to include this class
        private var _contactIds_obj_class: samsara.client.model.ContactIds = null;
        [XmlElements(name="contactIds", type="samsara.client.model.ContactIds")]
        public var contactIds: Array = new Array();

        public function getList(): Array{
            return contactIds;
        }

}

}
