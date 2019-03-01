package org.openapitools.client.model {

import org.openapitools.client.model.TaggedVehicleBase;

    [XmlRootNode(name="TaggedVehicle")]
    public class TaggedVehicle {
        /* The ID of the Vehicle being tagged. */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* Name of the Vehicle being tagged. */
        [XmlElement(name="name")]
        public var name: String = null;

    public function toString(): String {
        var str: String = "TaggedVehicle: ";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        return str;
    }

}

}
