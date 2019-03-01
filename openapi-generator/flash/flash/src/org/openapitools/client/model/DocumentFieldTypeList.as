package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DocumentFieldTypeNumberValueTypeMetadata;

    public class DocumentFieldTypeList implements ListWrapper {
        // This declaration below of _DocumentFieldType_obj_class is to force flash compiler to include this class
        private var _documentFieldType_obj_class: org.openapitools.client.model.DocumentFieldType = null;
        [XmlElements(name="documentFieldType", type="org.openapitools.client.model.DocumentFieldType")]
        public var documentFieldType: Array = new Array();

        public function getList(): Array{
            return documentFieldType;
        }

}

}
