package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.DvirBaseAuthorSignature;
import org.openapitools.client.model.DvirBaseMechanicOrAgentSignature;
import org.openapitools.client.model.DvirBaseNextDriverSignature;
import org.openapitools.client.model.DvirBaseTrailerDefects;
import org.openapitools.client.model.DvirBaseVehicle;

    public class DvirBaseList implements ListWrapper {
        // This declaration below of _DvirBase_obj_class is to force flash compiler to include this class
        private var _dvirBase_obj_class: org.openapitools.client.model.DvirBase = null;
        [XmlElements(name="dvirBase", type="org.openapitools.client.model.DvirBase")]
        public var dvirBase: Array = new Array();

        public function getList(): Array{
            return dvirBase;
        }

}

}
