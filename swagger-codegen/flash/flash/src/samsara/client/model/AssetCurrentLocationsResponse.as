package samsara.client.model {

import samsara.client.model.AssetCable;
import samsara.client.model.AssetCurrentLocation;

    [XmlRootNode(name="AssetCurrentLocationsResponse")]
    public class AssetCurrentLocationsResponse {
        /* The cable connected to the asset */
        // This declaration below of _cable_obj_class is to force flash compiler to include this class
        private var _cable_obj_class: Array = null;
        [XmlElementWrapper(name="cable")]
        [XmlElements(name="cable", type="Array")]
                public var cable: Array = new Array();
        /* Engine hours */
        [XmlElement(name="engineHours")]
        public var engineHours: Number = NaN;
        /* Asset ID */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* Current location of an asset */
        // This declaration below of _location_obj_class is to force flash compiler to include this class
        private var _location_obj_class: Array = null;
        [XmlElementWrapper(name="location")]
        [XmlElements(name="location", type="Array")]
                public var location: Array = new Array();
        /* Asset name */
        [XmlElement(name="name")]
        public var name: String = null;

    public function toString(): String {
        var str: String = "AssetCurrentLocationsResponse: ";
        str += " (cable: " + cable + ")";
        str += " (engineHours: " + engineHours + ")";
        str += " (id: " + id + ")";
        str += " (location: " + location + ")";
        str += " (name: " + name + ")";
        return str;
    }

}

}
