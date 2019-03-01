package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DocumentBase;
import org.openapitools.client.model.DocumentField;

    public class DocumentCreateList implements ListWrapper {
        // This declaration below of _DocumentCreate_obj_class is to force flash compiler to include this class
        private var _documentCreate_obj_class: org.openapitools.client.model.DocumentCreate = null;
        [XmlElements(name="documentCreate", type="org.openapitools.client.model.DocumentCreate")]
        public var documentCreate: Array = new Array();

        public function getList(): Array{
            return documentCreate;
        }

}

}
