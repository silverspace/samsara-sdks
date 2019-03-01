package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.DocumentFieldTypes;

    public class DocumentTypeList implements ListWrapper {
        // This declaration below of _DocumentType_obj_class is to force flash compiler to include this class
        private var _documentType_obj_class: samsara.client.model.DocumentType = null;
        [XmlElements(name="documentType", type="samsara.client.model.DocumentType")]
        public var documentType: Array = new Array();

        public function getList(): Array{
            return documentType;
        }

}

}
