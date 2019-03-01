package org.openapitools.client.model {

import org.openapitools.client.model.DataInputHistoryResponsePoints;

    [XmlRootNode(name="DataInputHistoryResponse")]
    public class DataInputHistoryResponse {
        /* The ID of this data input */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* Name of this data input */
        [XmlElement(name="name")]
        public var name: String = null;
        /* Data points from this data input */
        // This declaration below of _points_obj_class is to force flash compiler to include this class
        private var _points_obj_class: Array = null;
        [XmlElementWrapper(name="points")]
        [XmlElements(name="points", type="Array")]
                public var points: Array = new Array();

    public function toString(): String {
        var str: String = "DataInputHistoryResponse: ";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        str += " (points: " + points + ")";
        return str;
    }

}

}
