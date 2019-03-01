package org.openapitools.client.model {

import org.openapitools.client.model.AuxInput;

    [XmlRootNode(name="AuxInputSeries")]
    public class AuxInputSeries {
        /* The name of the aux input. */
        [XmlElement(name="name")]
        public var name: String = null;
                // This declaration below of _values_obj_class is to force flash compiler to include this class
        private var _values_obj_class: Array = null;
        [XmlElementWrapper(name="values")]
        [XmlElements(name="values", type="Array")]
                public var values: Array = new Array();

    public function toString(): String {
        var str: String = "AuxInputSeries: ";
        str += " (name: " + name + ")";
        str += " (values: " + values + ")";
        return str;
    }

}

}
