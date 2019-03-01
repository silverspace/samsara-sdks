package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.DocumentFieldTypeNumberValueTypeMetadata;

    public class DocumentFieldTypeList implements ListWrapper {
        // This declaration below of _DocumentFieldType_obj_class is to force flash compiler to include this class
        private var _documentFieldType_obj_class: samsara.client.model.DocumentFieldType = null;
        [XmlElements(name="documentFieldType", type="samsara.client.model.DocumentFieldType")]
        public var documentFieldType: Array = new Array();

        public function getList(): Array{
            return documentFieldType;
        }

}

}
