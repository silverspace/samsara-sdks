package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.DvirBaseAuthorSignature;
import samsara.client.model.DvirBaseMechanicOrAgentSignature;
import samsara.client.model.DvirBaseNextDriverSignature;
import samsara.client.model.DvirBaseTrailerDefects;
import samsara.client.model.DvirBaseVehicle;

    public class DvirBaseList implements ListWrapper {
        // This declaration below of _DvirBase_obj_class is to force flash compiler to include this class
        private var _dvirBase_obj_class: samsara.client.model.DvirBase = null;
        [XmlElements(name="dvirBase", type="samsara.client.model.DvirBase")]
        public var dvirBase: Array = new Array();

        public function getList(): Array{
            return dvirBase;
        }

}

}
