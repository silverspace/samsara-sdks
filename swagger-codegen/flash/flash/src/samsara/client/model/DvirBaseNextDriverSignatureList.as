package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class DvirBaseNextDriverSignatureList implements ListWrapper {
        // This declaration below of _DvirBase_nextDriverSignature_obj_class is to force flash compiler to include this class
        private var _dvirBaseNextDriverSignature_obj_class: samsara.client.model.DvirBaseNextDriverSignature = null;
        [XmlElements(name="dvirBaseNextDriverSignature", type="samsara.client.model.DvirBaseNextDriverSignature")]
        public var dvirBaseNextDriverSignature: Array = new Array();

        public function getList(): Array{
            return dvirBaseNextDriverSignature;
        }

}

}
