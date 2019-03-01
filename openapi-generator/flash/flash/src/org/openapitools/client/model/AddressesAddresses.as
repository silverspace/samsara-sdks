package org.openapitools.client.model {

import org.openapitools.client.model.AddressGeofence;

    [XmlRootNode(name="AddressesAddresses")]
    public class AddressesAddresses {
        /* Notes associated with an address. */
        [XmlElement(name="notes")]
        public var notes: String = null;
        /* The full address associated with this address/geofence, as it might be recognized by maps.google.com */
        [XmlElement(name="formattedAddress")]
        public var formattedAddress: String = null;
                [XmlElement(name="geofence")]
        public var geofence: AddressGeofence = NaN;
        /* A list of tag IDs. */
        // This declaration below of _tagIds_obj_class is to force flash compiler to include this class
        private var _tagIds_obj_class: Array = null;
        [XmlElementWrapper(name="tagIds")]
        [XmlElements(name="tagIds", type="Array")]
                public var tagIds: Array = new Array();
        /* The name of this address/geofence */
        [XmlElement(name="name")]
        public var name: String = null;
        /* A list of IDs for contact book entries. */
        // This declaration below of _contactIds_obj_class is to force flash compiler to include this class
        private var _contactIds_obj_class: Array = null;
        [XmlElementWrapper(name="contactIds")]
        [XmlElements(name="contactIds", type="Array")]
                public var contactIds: Array = new Array();

    public function toString(): String {
        var str: String = "AddressesAddresses: ";
        str += " (notes: " + notes + ")";
        str += " (formattedAddress: " + formattedAddress + ")";
        str += " (geofence: " + geofence + ")";
        str += " (tagIds: " + tagIds + ")";
        str += " (name: " + name + ")";
        str += " (contactIds: " + contactIds + ")";
        return str;
    }

}

}
