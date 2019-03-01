package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DocumentBase;
import org.openapitools.client.model.DocumentField;

    public class DocumentList implements ListWrapper {
        // This declaration below of _Document_obj_class is to force flash compiler to include this class
        private var _document_obj_class: org.openapitools.client.model.Document = null;
        [XmlElements(name="document", type="org.openapitools.client.model.Document")]
        public var document: Array = new Array();

        public function getList(): Array{
            return document;
        }

}

}
