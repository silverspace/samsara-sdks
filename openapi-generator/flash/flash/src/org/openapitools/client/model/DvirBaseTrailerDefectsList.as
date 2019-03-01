package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class DvirBaseTrailerDefectsList implements ListWrapper {
        // This declaration below of _DvirBase_trailerDefects_obj_class is to force flash compiler to include this class
        private var _dvirBaseTrailerDefects_obj_class: org.openapitools.client.model.DvirBaseTrailerDefects = null;
        [XmlElements(name="dvirBaseTrailerDefects", type="org.openapitools.client.model.DvirBaseTrailerDefects")]
        public var dvirBaseTrailerDefects: Array = new Array();

        public function getList(): Array{
            return dvirBaseTrailerDefects;
        }

}

}
