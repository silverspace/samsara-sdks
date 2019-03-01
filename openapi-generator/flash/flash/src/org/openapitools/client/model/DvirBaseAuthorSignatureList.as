package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class DvirBaseAuthorSignatureList implements ListWrapper {
        // This declaration below of _DvirBase_authorSignature_obj_class is to force flash compiler to include this class
        private var _dvirBaseAuthorSignature_obj_class: org.openapitools.client.model.DvirBaseAuthorSignature = null;
        [XmlElements(name="dvirBaseAuthorSignature", type="org.openapitools.client.model.DvirBaseAuthorSignature")]
        public var dvirBaseAuthorSignature: Array = new Array();

        public function getList(): Array{
            return dvirBaseAuthorSignature;
        }

}

}
