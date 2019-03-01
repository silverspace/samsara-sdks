package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class DvirBaseMechanicOrAgentSignatureList implements ListWrapper {
        // This declaration below of _DvirBase_mechanicOrAgentSignature_obj_class is to force flash compiler to include this class
        private var _dvirBaseMechanicOrAgentSignature_obj_class: samsara.client.model.DvirBaseMechanicOrAgentSignature = null;
        [XmlElements(name="dvirBaseMechanicOrAgentSignature", type="samsara.client.model.DvirBaseMechanicOrAgentSignature")]
        public var dvirBaseMechanicOrAgentSignature: Array = new Array();

        public function getList(): Array{
            return dvirBaseMechanicOrAgentSignature;
        }

}

}
