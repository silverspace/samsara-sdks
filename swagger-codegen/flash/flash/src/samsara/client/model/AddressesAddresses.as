package samsara.client.model {

import samsara.client.model.AddressGeofence;
import samsara.client.model.AddressNotes;
import samsara.client.model.ContactIds;
import samsara.client.model.TagIds;

    [XmlRootNode(name="AddressesAddresses")]
    public class AddressesAddresses {
                [XmlElement(name="contactIds")]
        public var contactIds: ContactIds = NaN;
        /* The full address associated with this address/geofence, as it might be recognized by maps.google.com */
        [XmlElement(name="formattedAddress")]
        public var formattedAddress: String = null;
                [XmlElement(name="geofence")]
        public var geofence: AddressGeofence = NaN;
        /* The name of this address/geofence */
        [XmlElement(name="name")]
        public var name: String = null;
                [XmlElement(name="notes")]
        public var notes: AddressNotes = NaN;
                [XmlElement(name="tagIds")]
        public var tagIds: TagIds = NaN;

    public function toString(): String {
        var str: String = "AddressesAddresses: ";
        str += " (contactIds: " + contactIds + ")";
        str += " (formattedAddress: " + formattedAddress + ")";
        str += " (geofence: " + geofence + ")";
        str += " (name: " + name + ")";
        str += " (notes: " + notes + ")";
        str += " (tagIds: " + tagIds + ")";
        return str;
    }

}

}
