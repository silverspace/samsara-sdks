package samsara.client.model {

import samsara.client.model.AssetCurrentLocationsResponse;

    [XmlRootNode(name="InlineResponse2001")]
    public class InlineResponse2001 {
                // This declaration below of _assets_obj_class is to force flash compiler to include this class
        private var _assets_obj_class: Array = null;
        [XmlElementWrapper(name="assets")]
        [XmlElements(name="assets", type="Array")]
                public var assets: Array = new Array();

    public function toString(): String {
        var str: String = "InlineResponse2001: ";
        str += " (assets: " + assets + ")";
        return str;
    }

}

}
