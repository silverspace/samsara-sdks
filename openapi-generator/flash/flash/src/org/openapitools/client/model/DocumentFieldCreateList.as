package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DocumentFieldCreatePhotoValue;

    public class DocumentFieldCreateList implements ListWrapper {
        // This declaration below of _DocumentFieldCreate_obj_class is to force flash compiler to include this class
        private var _documentFieldCreate_obj_class: org.openapitools.client.model.DocumentFieldCreate = null;
        [XmlElements(name="documentFieldCreate", type="org.openapitools.client.model.DocumentFieldCreate")]
        public var documentFieldCreate: Array = new Array();

        public function getList(): Array{
            return documentFieldCreate;
        }

}

}
