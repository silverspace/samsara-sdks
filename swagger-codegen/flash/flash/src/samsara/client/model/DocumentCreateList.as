package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.DocumentBase;
import samsara.client.model.DocumentField;

    public class DocumentCreateList implements ListWrapper {
        // This declaration below of _DocumentCreate_obj_class is to force flash compiler to include this class
        private var _documentCreate_obj_class: samsara.client.model.DocumentCreate = null;
        [XmlElements(name="documentCreate", type="samsara.client.model.DocumentCreate")]
        public var documentCreate: Array = new Array();

        public function getList(): Array{
            return documentCreate;
        }

}

}
