package samsara.client.model {

import samsara.client.model.DvirBase;

    [XmlRootNode(name="DvirListResponse")]
    public class DvirListResponse {
                // This declaration below of _dvirs_obj_class is to force flash compiler to include this class
        private var _dvirs_obj_class: Array = null;
        [XmlElementWrapper(name="dvirs")]
        [XmlElements(name="dvirs", type="Array")]
                public var dvirs: Array = new Array();

    public function toString(): String {
        var str: String = "DvirListResponse: ";
        str += " (dvirs: " + dvirs + ")";
        return str;
    }

}

}
