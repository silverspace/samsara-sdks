package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class DocumentFieldTypeNumberValueTypeMetadataList implements ListWrapper {
        // This declaration below of _DocumentFieldType_numberValueTypeMetadata_obj_class is to force flash compiler to include this class
        private var _documentFieldTypeNumberValueTypeMetadata_obj_class: samsara.client.model.DocumentFieldTypeNumberValueTypeMetadata = null;
        [XmlElements(name="documentFieldTypeNumberValueTypeMetadata", type="samsara.client.model.DocumentFieldTypeNumberValueTypeMetadata")]
        public var documentFieldTypeNumberValueTypeMetadata: Array = new Array();

        public function getList(): Array{
            return documentFieldTypeNumberValueTypeMetadata;
        }

}

}
