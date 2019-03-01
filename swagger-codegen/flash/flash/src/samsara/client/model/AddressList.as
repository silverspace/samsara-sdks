package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.AddressGeofence;
import samsara.client.model.AddressNotes;
import samsara.client.model.ContactIds;
import samsara.client.model.TagIds;

    public class AddressList implements ListWrapper {
        // This declaration below of _address_obj_class is to force flash compiler to include this class
        private var _address_obj_class: samsara.client.model.Address = null;
        [XmlElements(name="address", type="samsara.client.model.Address")]
        public var address: Array = new Array();

        public function getList(): Array{
            return address;
        }

}

}
