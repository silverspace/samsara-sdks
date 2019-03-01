package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.Document;

    public class DocumentsList implements ListWrapper {
        // This declaration below of _Documents_obj_class is to force flash compiler to include this class
        private var _documents_obj_class: samsara.client.model.Documents = null;
        [XmlElements(name="documents", type="samsara.client.model.Documents")]
        public var documents: Array = new Array();

        public function getList(): Array{
            return documents;
        }

}

}
