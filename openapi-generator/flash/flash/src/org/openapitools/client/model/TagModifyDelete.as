package org.openapitools.client.model {

import org.openapitools.client.model.TaggedAssetBase;
import org.openapitools.client.model.TaggedDriverBase;
import org.openapitools.client.model.TaggedMachineBase;
import org.openapitools.client.model.TaggedSensorBase;
import org.openapitools.client.model.TaggedVehicleBase;

    [XmlRootNode(name="TagModifyDelete")]
    public class TagModifyDelete {
        /* The assets to be removed from this tag. */
        // This declaration below of _assets_obj_class is to force flash compiler to include this class
        private var _assets_obj_class: Array = null;
        [XmlElementWrapper(name="assets")]
        [XmlElements(name="assets", type="Array")]
                public var assets: Array = new Array();
        /* The sensors to be removed from this tag. */
        // This declaration below of _sensors_obj_class is to force flash compiler to include this class
        private var _sensors_obj_class: Array = null;
        [XmlElementWrapper(name="sensors")]
        [XmlElements(name="sensors", type="Array")]
                public var sensors: Array = new Array();
        /* The vehicles to be removed from this tag. */
        // This declaration below of _vehicles_obj_class is to force flash compiler to include this class
        private var _vehicles_obj_class: Array = null;
        [XmlElementWrapper(name="vehicles")]
        [XmlElements(name="vehicles", type="Array")]
                public var vehicles: Array = new Array();
        /* The machines to be removed from this tag. */
        // This declaration below of _machines_obj_class is to force flash compiler to include this class
        private var _machines_obj_class: Array = null;
        [XmlElementWrapper(name="machines")]
        [XmlElements(name="machines", type="Array")]
                public var machines: Array = new Array();
        /* The drivers to be removed from this tag. */
        // This declaration below of _drivers_obj_class is to force flash compiler to include this class
        private var _drivers_obj_class: Array = null;
        [XmlElementWrapper(name="drivers")]
        [XmlElements(name="drivers", type="Array")]
                public var drivers: Array = new Array();

    public function toString(): String {
        var str: String = "TagModifyDelete: ";
        str += " (assets: " + assets + ")";
        str += " (sensors: " + sensors + ")";
        str += " (vehicles: " + vehicles + ")";
        str += " (machines: " + machines + ")";
        str += " (drivers: " + drivers + ")";
        return str;
    }

}

}
