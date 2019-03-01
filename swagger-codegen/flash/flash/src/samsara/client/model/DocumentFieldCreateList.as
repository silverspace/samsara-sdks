package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.DocumentFieldCreatePhotoValue;

    public class DocumentFieldCreateList implements ListWrapper {
        // This declaration below of _DocumentFieldCreate_obj_class is to force flash compiler to include this class
        private var _documentFieldCreate_obj_class: samsara.client.model.DocumentFieldCreate = null;
        [XmlElements(name="documentFieldCreate", type="samsara.client.model.DocumentFieldCreate")]
        public var documentFieldCreate: Array = new Array();

        public function getList(): Array{
            return documentFieldCreate;
        }

}

}
