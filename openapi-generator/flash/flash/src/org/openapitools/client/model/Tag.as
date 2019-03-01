package org.openapitools.client.model {

import org.openapitools.client.model.TaggedAddress;
import org.openapitools.client.model.TaggedAsset;
import org.openapitools.client.model.TaggedDriver;
import org.openapitools.client.model.TaggedMachine;
import org.openapitools.client.model.TaggedSensor;
import org.openapitools.client.model.TaggedVehicle;

    [XmlRootNode(name="Tag")]
    public class Tag {
        /* The addresses that belong to this tag. */
        // This declaration below of _addresses_obj_class is to force flash compiler to include this class
        private var _addresses_obj_class: Array = null;
        [XmlElementWrapper(name="addresses")]
        [XmlElements(name="addresses", type="Array")]
                public var addresses: Array = new Array();
        /* The assets that belong to this tag. */
        // This declaration below of _assets_obj_class is to force flash compiler to include this class
        private var _assets_obj_class: Array = null;
        [XmlElementWrapper(name="assets")]
        [XmlElements(name="assets", type="Array")]
                public var assets: Array = new Array();
        /* The drivers that belong to this tag. */
        // This declaration below of _drivers_obj_class is to force flash compiler to include this class
        private var _drivers_obj_class: Array = null;
        [XmlElementWrapper(name="drivers")]
        [XmlElements(name="drivers", type="Array")]
                public var drivers: Array = new Array();
        /* The GroupID that this tag belongs to. */
        [XmlElement(name="groupId")]
        public var groupId: Number = 0;
        /* The ID of this tag. */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* The machines that belong to this tag. */
        // This declaration below of _machines_obj_class is to force flash compiler to include this class
        private var _machines_obj_class: Array = null;
        [XmlElementWrapper(name="machines")]
        [XmlElements(name="machines", type="Array")]
                public var machines: Array = new Array();
        /* Name of this tag. */
        [XmlElement(name="name")]
        public var name: String = null;
        /* If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag. */
        [XmlElement(name="parentTagId")]
        public var parentTagId: Number = 0;
        /* The sensors that belong to this tag. */
        // This declaration below of _sensors_obj_class is to force flash compiler to include this class
        private var _sensors_obj_class: Array = null;
        [XmlElementWrapper(name="sensors")]
        [XmlElements(name="sensors", type="Array")]
                public var sensors: Array = new Array();
        /* The vehicles that belong to this tag. */
        // This declaration below of _vehicles_obj_class is to force flash compiler to include this class
        private var _vehicles_obj_class: Array = null;
        [XmlElementWrapper(name="vehicles")]
        [XmlElements(name="vehicles", type="Array")]
                public var vehicles: Array = new Array();

    public function toString(): String {
        var str: String = "Tag: ";
        str += " (addresses: " + addresses + ")";
        str += " (assets: " + assets + ")";
        str += " (drivers: " + drivers + ")";
        str += " (groupId: " + groupId + ")";
        str += " (id: " + id + ")";
        str += " (machines: " + machines + ")";
        str += " (name: " + name + ")";
        str += " (parentTagId: " + parentTagId + ")";
        str += " (sensors: " + sensors + ")";
        str += " (vehicles: " + vehicles + ")";
        return str;
    }

}

}
