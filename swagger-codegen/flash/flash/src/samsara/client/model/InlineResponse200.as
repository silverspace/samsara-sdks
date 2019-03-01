package samsara.client.model {

import samsara.client.model.Asset;

    [XmlRootNode(name="InlineResponse200")]
    public class InlineResponse200 {
                // This declaration below of _assets_obj_class is to force flash compiler to include this class
        private var _assets_obj_class: Array = null;
        [XmlElementWrapper(name="assets")]
        [XmlElements(name="assets", type="Array")]
                public var assets: Array = new Array();

    public function toString(): String {
        var str: String = "InlineResponse200: ";
        str += " (assets: " + assets + ")";
        return str;
    }

}

}
