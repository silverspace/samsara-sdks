package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class AddressNotesList implements ListWrapper {
        // This declaration below of _AddressNotes_obj_class is to force flash compiler to include this class
        private var _addressNotes_obj_class: samsara.client.model.AddressNotes = null;
        [XmlElements(name="addressNotes", type="samsara.client.model.AddressNotes")]
        public var addressNotes: Array = new Array();

        public function getList(): Array{
            return addressNotes;
        }

}

}
