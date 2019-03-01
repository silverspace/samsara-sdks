package org.openapitools.client.model {

import org.openapitools.client.model.AssetReeferResponseReeferStatsAlarms1;
import org.openapitools.client.model.AssetReeferResponseReeferStatsEngineHours;
import org.openapitools.client.model.AssetReeferResponseReeferStatsFuelPercentage;
import org.openapitools.client.model.AssetReeferResponseReeferStatsPowerStatus;
import org.openapitools.client.model.AssetReeferResponseReeferStatsReturnAirTemp;
import org.openapitools.client.model.AssetReeferResponseReeferStatsSetPoint;

    [XmlRootNode(name="AssetReeferResponseReeferStats")]
    public class AssetReeferResponseReeferStats {
        /* Fuel percentage of the reefer */
        // This declaration below of _fuelPercentage_obj_class is to force flash compiler to include this class
        private var _fuelPercentage_obj_class: Array = null;
        [XmlElementWrapper(name="fuelPercentage")]
        [XmlElements(name="fuelPercentage", type="Array")]
                public var fuelPercentage: Array = new Array();
        /* Power status of the reefer */
        // This declaration below of _powerStatus_obj_class is to force flash compiler to include this class
        private var _powerStatus_obj_class: Array = null;
        [XmlElementWrapper(name="powerStatus")]
        [XmlElements(name="powerStatus", type="Array")]
                public var powerStatus: Array = new Array();
        /* Engine hours of the reefer */
        // This declaration below of _engineHours_obj_class is to force flash compiler to include this class
        private var _engineHours_obj_class: Array = null;
        [XmlElementWrapper(name="engineHours")]
        [XmlElements(name="engineHours", type="Array")]
                public var engineHours: Array = new Array();
        /* Set point temperature of the reefer */
        // This declaration below of _setPoint_obj_class is to force flash compiler to include this class
        private var _setPoint_obj_class: Array = null;
        [XmlElementWrapper(name="setPoint")]
        [XmlElements(name="setPoint", type="Array")]
                public var setPoint: Array = new Array();
        /* Return air temperature of the reefer */
        // This declaration below of _returnAirTemp_obj_class is to force flash compiler to include this class
        private var _returnAirTemp_obj_class: Array = null;
        [XmlElementWrapper(name="returnAirTemp")]
        [XmlElements(name="returnAirTemp", type="Array")]
                public var returnAirTemp: Array = new Array();
        /* Reefer alarms */
        // This declaration below of _alarms_obj_class is to force flash compiler to include this class
        private var _alarms_obj_class: Array = null;
        [XmlElementWrapper(name="alarms")]
        [XmlElements(name="alarms", type="Array")]
                public var alarms: Array = new Array();

    public function toString(): String {
        var str: String = "AssetReeferResponseReeferStats: ";
        str += " (fuelPercentage: " + fuelPercentage + ")";
        str += " (powerStatus: " + powerStatus + ")";
        str += " (engineHours: " + engineHours + ")";
        str += " (setPoint: " + setPoint + ")";
        str += " (returnAirTemp: " + returnAirTemp + ")";
        str += " (alarms: " + alarms + ")";
        return str;
    }

}

}
