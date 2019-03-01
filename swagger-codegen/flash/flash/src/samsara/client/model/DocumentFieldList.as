package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.DocumentFieldCreate;
import samsara.client.model.DocumentFieldCreatePhotoValue;
import samsara.client.model.ERRORUNKNOWN;

    public class DocumentFieldList implements ListWrapper {
        // This declaration below of _DocumentField_obj_class is to force flash compiler to include this class
        private var _documentField_obj_class: samsara.client.model.DocumentField = null;
        [XmlElements(name="documentField", type="samsara.client.model.DocumentField")]
        public var documentField: Array = new Array();

        public function getList(): Array{
            return documentField;
        }

}

}
