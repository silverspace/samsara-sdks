package org.openapitools.client.model {

import org.openapitools.client.model.TaggedSensorBase;

    [XmlRootNode(name="TaggedSensor")]
    public class TaggedSensor {
        /* The ID of the Sensor being tagged. */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* Name of the Sensor being tagged. */
        [XmlElement(name="name")]
        public var name: String = null;

    public function toString(): String {
        var str: String = "TaggedSensor: ";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        return str;
    }

}

}
