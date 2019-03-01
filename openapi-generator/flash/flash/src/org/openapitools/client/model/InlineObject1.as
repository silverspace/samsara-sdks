package org.openapitools.client.model {

import org.openapitools.client.model.AddressGeofence;

    [XmlRootNode(name="InlineObject1")]
    public class InlineObject1 {
        /* A list of IDs for contact book entries. */
        // This declaration below of _contactIds_obj_class is to force flash compiler to include this class
        private var _contactIds_obj_class: Array = null;
        [XmlElementWrapper(name="contactIds")]
        [XmlElements(name="contactIds", type="Array")]
                public var contactIds: Array = new Array();
        /* The full address associated with this address/geofence, as it might be recognized by maps.google.com */
        [XmlElement(name="formattedAddress")]
        public var formattedAddress: String = null;
                [XmlElement(name="geofence")]
        public var geofence: AddressGeofence = NaN;
        /* The name of this address/geofence */
        [XmlElement(name="name")]
        public var name: String = null;
        /* Notes associated with an address. */
        [XmlElement(name="notes")]
        public var notes: String = null;
        /* A list of tag IDs. */
        // This declaration below of _tagIds_obj_class is to force flash compiler to include this class
        private var _tagIds_obj_class: Array = null;
        [XmlElementWrapper(name="tagIds")]
        [XmlElements(name="tagIds", type="Array")]
                public var tagIds: Array = new Array();

    public function toString(): String {
        var str: String = "InlineObject1: ";
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
