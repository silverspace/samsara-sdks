package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class DocumentFieldCreatePhotoValueList implements ListWrapper {
        // This declaration below of _DocumentFieldCreate_photoValue_obj_class is to force flash compiler to include this class
        private var _documentFieldCreatePhotoValue_obj_class: samsara.client.model.DocumentFieldCreatePhotoValue = null;
        [XmlElements(name="documentFieldCreatePhotoValue", type="samsara.client.model.DocumentFieldCreatePhotoValue")]
        public var documentFieldCreatePhotoValue: Array = new Array();

        public function getList(): Array{
            return documentFieldCreatePhotoValue;
        }

}

}
