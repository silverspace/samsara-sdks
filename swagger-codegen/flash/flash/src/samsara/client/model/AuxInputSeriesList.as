package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.AuxInput;

    public class AuxInputSeriesList implements ListWrapper {
        // This declaration below of _AuxInputSeries_obj_class is to force flash compiler to include this class
        private var _auxInputSeries_obj_class: samsara.client.model.AuxInputSeries = null;
        [XmlElements(name="auxInputSeries", type="samsara.client.model.AuxInputSeries")]
        public var auxInputSeries: Array = new Array();

        public function getList(): Array{
            return auxInputSeries;
        }

}

}
