package org.openapitools.client.model {

import org.openapitools.client.model.Tag;

    [XmlRootNode(name="InlineResponse2009")]
    public class InlineResponse2009 {
                // This declaration below of _tags_obj_class is to force flash compiler to include this class
        private var _tags_obj_class: Array = null;
        [XmlElementWrapper(name="tags")]
        [XmlElements(name="tags", type="Array")]
                public var tags: Array = new Array();

    public function toString(): String {
        var str: String = "InlineResponse2009: ";
        str += " (tags: " + tags + ")";
        return str;
    }

}

}
