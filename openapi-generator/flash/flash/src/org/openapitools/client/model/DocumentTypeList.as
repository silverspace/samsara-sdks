package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DocumentFieldType;

    public class DocumentTypeList implements ListWrapper {
        // This declaration below of _DocumentType_obj_class is to force flash compiler to include this class
        private var _documentType_obj_class: org.openapitools.client.model.DocumentType = null;
        [XmlElements(name="documentType", type="org.openapitools.client.model.DocumentType")]
        public var documentType: Array = new Array();

        public function getList(): Array{
            return documentType;
        }

}

}
