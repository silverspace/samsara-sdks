package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.DocumentType;

    public class DocumentTypesList implements ListWrapper {
        // This declaration below of _DocumentTypes_obj_class is to force flash compiler to include this class
        private var _documentTypes_obj_class: samsara.client.model.DocumentTypes = null;
        [XmlElements(name="documentTypes", type="samsara.client.model.DocumentTypes")]
        public var documentTypes: Array = new Array();

        public function getList(): Array{
            return documentTypes;
        }

}

}
