package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class DocumentFieldCreatePhotoValueList implements ListWrapper {
        // This declaration below of _DocumentFieldCreate_photoValue_obj_class is to force flash compiler to include this class
        private var _documentFieldCreatePhotoValue_obj_class: org.openapitools.client.model.DocumentFieldCreatePhotoValue = null;
        [XmlElements(name="documentFieldCreatePhotoValue", type="org.openapitools.client.model.DocumentFieldCreatePhotoValue")]
        public var documentFieldCreatePhotoValue: Array = new Array();

        public function getList(): Array{
            return documentFieldCreatePhotoValue;
        }

}

}
