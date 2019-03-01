package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class DvirBaseNextDriverSignatureList implements ListWrapper {
        // This declaration below of _DvirBase_nextDriverSignature_obj_class is to force flash compiler to include this class
        private var _dvirBaseNextDriverSignature_obj_class: org.openapitools.client.model.DvirBaseNextDriverSignature = null;
        [XmlElements(name="dvirBaseNextDriverSignature", type="org.openapitools.client.model.DvirBaseNextDriverSignature")]
        public var dvirBaseNextDriverSignature: Array = new Array();

        public function getList(): Array{
            return dvirBaseNextDriverSignature;
        }

}

}
