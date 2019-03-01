package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.DocumentFieldType;

    public class DocumentFieldTypesList implements ListWrapper {
        // This declaration below of _DocumentFieldTypes_obj_class is to force flash compiler to include this class
        private var _documentFieldTypes_obj_class: samsara.client.model.DocumentFieldTypes = null;
        [XmlElements(name="documentFieldTypes", type="samsara.client.model.DocumentFieldTypes")]
        public var documentFieldTypes: Array = new Array();

        public function getList(): Array{
            return documentFieldTypes;
        }

}

}
