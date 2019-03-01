package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.AuxInput;

    public class AuxInputSeriesList implements ListWrapper {
        // This declaration below of _AuxInputSeries_obj_class is to force flash compiler to include this class
        private var _auxInputSeries_obj_class: org.openapitools.client.model.AuxInputSeries = null;
        [XmlElements(name="auxInputSeries", type="org.openapitools.client.model.AuxInputSeries")]
        public var auxInputSeries: Array = new Array();

        public function getList(): Array{
            return auxInputSeries;
        }

}

}
