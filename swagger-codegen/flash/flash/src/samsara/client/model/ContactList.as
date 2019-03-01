package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class ContactList implements ListWrapper {
        // This declaration below of _Contact_obj_class is to force flash compiler to include this class
        private var _contact_obj_class: samsara.client.model.Contact = null;
        [XmlElements(name="contact", type="samsara.client.model.Contact")]
        public var contact: Array = new Array();

        public function getList(): Array{
            return contact;
        }

}

}
