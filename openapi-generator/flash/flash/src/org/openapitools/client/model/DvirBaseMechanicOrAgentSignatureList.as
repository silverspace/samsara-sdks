package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class DvirBaseMechanicOrAgentSignatureList implements ListWrapper {
        // This declaration below of _DvirBase_mechanicOrAgentSignature_obj_class is to force flash compiler to include this class
        private var _dvirBaseMechanicOrAgentSignature_obj_class: org.openapitools.client.model.DvirBaseMechanicOrAgentSignature = null;
        [XmlElements(name="dvirBaseMechanicOrAgentSignature", type="org.openapitools.client.model.DvirBaseMechanicOrAgentSignature")]
        public var dvirBaseMechanicOrAgentSignature: Array = new Array();

        public function getList(): Array{
            return dvirBaseMechanicOrAgentSignature;
        }

}

}
