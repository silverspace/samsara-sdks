package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class DocumentBaseList implements ListWrapper {
        // This declaration below of _DocumentBase_obj_class is to force flash compiler to include this class
        private var _documentBase_obj_class: samsara.client.model.DocumentBase = null;
        [XmlElements(name="documentBase", type="samsara.client.model.DocumentBase")]
        public var documentBase: Array = new Array();

        public function getList(): Array{
            return documentBase;
        }

}

}
