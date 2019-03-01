package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.DocumentBase;
import samsara.client.model.DocumentField;

    public class DocumentList implements ListWrapper {
        // This declaration below of _Document_obj_class is to force flash compiler to include this class
        private var _document_obj_class: samsara.client.model.Document = null;
        [XmlElements(name="document", type="samsara.client.model.Document")]
        public var document: Array = new Array();

        public function getList(): Array{
            return document;
        }

}

}
