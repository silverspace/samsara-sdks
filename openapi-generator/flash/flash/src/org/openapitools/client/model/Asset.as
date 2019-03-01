package org.openapitools.client.model {

import org.openapitools.client.model.AssetCable;

    [XmlRootNode(name="Asset")]
    public class Asset {
        /* Serial number of the host asset */
        [XmlElement(name="assetSerialNumber")]
        public var assetSerialNumber: String = null;
        /* The cable connected to the asset */
        // This declaration below of _cable_obj_class is to force flash compiler to include this class
        private var _cable_obj_class: Array = null;
        [XmlElementWrapper(name="cable")]
        [XmlElements(name="cable", type="Array")]
                public var cable: Array = new Array();
        /* Engine hours */
        [XmlElement(name="engineHours")]
        public var engineHours: Number = 0;
        /* Asset ID */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* Asset name */
        [XmlElement(name="name")]
        public var name: String = null;

    public function toString(): String {
        var str: String = "Asset: ";
        str += " (assetSerialNumber: " + assetSerialNumber + ")";
        str += " (cable: " + cable + ")";
        str += " (engineHours: " + engineHours + ")";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        return str;
    }

}

}
