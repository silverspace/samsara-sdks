package org.openapitools.client.model {

import org.openapitools.client.model.AddressGeofence;
import org.openapitools.client.model.Contact;
import org.openapitools.client.model.TagMetadata;

    [XmlRootNode(name="Address")]
    public class Address {
                // This declaration below of _contacts_obj_class is to force flash compiler to include this class
        private var _contacts_obj_class: Array = null;
        [XmlElementWrapper(name="contacts")]
        [XmlElements(name="contacts", type="Array")]
                public var contacts: Array = new Array();
        /* The full address associated with this address/geofence, as it might be recognized by maps.google.com */
        [XmlElement(name="formattedAddress")]
        public var formattedAddress: String = null;
                [XmlElement(name="geofence")]
        public var geofence: AddressGeofence = NaN;
        /* ID of the address */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* Name of the address or geofence */
        [XmlElement(name="name")]
        public var name: String = null;
        /* Notes associated with an address. */
        [XmlElement(name="notes")]
        public var notes: String = null;
                // This declaration below of _tags_obj_class is to force flash compiler to include this class
        private var _tags_obj_class: Array = null;
        [XmlElementWrapper(name="tags")]
        [XmlElements(name="tags", type="Array")]
                public var tags: Array = new Array();

    public function toString(): String {
        var str: String = "Address: ";
        str += " (contacts: " + contacts + ")";
        str += " (formattedAddress: " + formattedAddress + ")";
        str += " (geofence: " + geofence + ")";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        str += " (notes: " + notes + ")";
        str += " (tags: " + tags + ")";
        return str;
    }

}

}
