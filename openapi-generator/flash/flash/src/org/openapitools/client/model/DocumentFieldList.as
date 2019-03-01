package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DocumentFieldCreate;
import org.openapitools.client.model.DocumentFieldCreatePhotoValue;
import org.openapitools.client.model.Object;

    public class DocumentFieldList implements ListWrapper {
        // This declaration below of _DocumentField_obj_class is to force flash compiler to include this class
        private var _documentField_obj_class: org.openapitools.client.model.DocumentField = null;
        [XmlElements(name="documentField", type="org.openapitools.client.model.DocumentField")]
        public var documentField: Array = new Array();

        public function getList(): Array{
            return documentField;
        }

}

}
