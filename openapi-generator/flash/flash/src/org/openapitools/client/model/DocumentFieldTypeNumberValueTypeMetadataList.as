package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class DocumentFieldTypeNumberValueTypeMetadataList implements ListWrapper {
        // This declaration below of _DocumentFieldType_numberValueTypeMetadata_obj_class is to force flash compiler to include this class
        private var _documentFieldTypeNumberValueTypeMetadata_obj_class: org.openapitools.client.model.DocumentFieldTypeNumberValueTypeMetadata = null;
        [XmlElements(name="documentFieldTypeNumberValueTypeMetadata", type="org.openapitools.client.model.DocumentFieldTypeNumberValueTypeMetadata")]
        public var documentFieldTypeNumberValueTypeMetadata: Array = new Array();

        public function getList(): Array{
            return documentFieldTypeNumberValueTypeMetadata;
        }

}

}
