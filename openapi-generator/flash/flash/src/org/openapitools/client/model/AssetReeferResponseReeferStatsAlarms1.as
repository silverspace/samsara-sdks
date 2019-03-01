package org.openapitools.client.model {

import org.openapitools.client.model.AssetReeferResponseReeferStatsAlarms;

    [XmlRootNode(name="AssetReeferResponseReeferStatsAlarms1")]
    public class AssetReeferResponseReeferStatsAlarms1 {
                // This declaration below of _alarms_obj_class is to force flash compiler to include this class
        private var _alarms_obj_class: Array = null;
        [XmlElementWrapper(name="alarms")]
        [XmlElements(name="alarms", type="Array")]
                public var alarms: Array = new Array();
        /* Timestamp when the alarms were reported, in Unix milliseconds since epoch */
        [XmlElement(name="changedAtMs")]
        public var changedAtMs: Number = 0;

    public function toString(): String {
        var str: String = "AssetReeferResponseReeferStatsAlarms1: ";
        str += " (alarms: " + alarms + ")";
        str += " (changedAtMs: " + changedAtMs + ")";
        return str;
    }

}

}
