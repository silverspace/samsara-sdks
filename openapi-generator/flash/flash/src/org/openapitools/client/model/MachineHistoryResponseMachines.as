package org.openapitools.client.model {

import org.openapitools.client.model.MachineHistoryResponseVibrations;

    [XmlRootNode(name="MachineHistoryResponseMachines")]
    public class MachineHistoryResponseMachines {
        /* Machine name */
        [XmlElement(name="name")]
        public var name: String = null;
        /* Machine ID */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* List of vibration datapoints, with timestamp and vibration measurement for x/y/z axis in mm/s */
        // This declaration below of _vibrations_obj_class is to force flash compiler to include this class
        private var _vibrations_obj_class: Array = null;
        [XmlElementWrapper(name="vibrations")]
        [XmlElements(name="vibrations", type="Array")]
                public var vibrations: Array = new Array();

    public function toString(): String {
        var str: String = "MachineHistoryResponseMachines: ";
        str += " (name: " + name + ")";
        str += " (id: " + id + ")";
        str += " (vibrations: " + vibrations + ")";
        return str;
    }

}

}
