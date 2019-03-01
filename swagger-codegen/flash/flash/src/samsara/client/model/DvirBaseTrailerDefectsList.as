package samsara.client.model {

import io.swagger.common.ListWrapper;

    public class DvirBaseTrailerDefectsList implements ListWrapper {
        // This declaration below of _DvirBase_trailerDefects_obj_class is to force flash compiler to include this class
        private var _dvirBaseTrailerDefects_obj_class: samsara.client.model.DvirBaseTrailerDefects = null;
        [XmlElements(name="dvirBaseTrailerDefects", type="samsara.client.model.DvirBaseTrailerDefects")]
        public var dvirBaseTrailerDefects: Array = new Array();

        public function getList(): Array{
            return dvirBaseTrailerDefects;
        }

}

}
