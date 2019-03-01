package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class DocumentBaseList implements ListWrapper {
        // This declaration below of _DocumentBase_obj_class is to force flash compiler to include this class
        private var _documentBase_obj_class: org.openapitools.client.model.DocumentBase = null;
        [XmlElements(name="documentBase", type="org.openapitools.client.model.DocumentBase")]
        public var documentBase: Array = new Array();

        public function getList(): Array{
            return documentBase;
        }

}

}
