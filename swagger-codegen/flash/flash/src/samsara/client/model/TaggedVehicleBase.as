package samsara.client.model {


    [XmlRootNode(name="TaggedVehicleBase")]
    public class TaggedVehicleBase {
        /* The ID of the Vehicle being tagged. */
        [XmlElement(name="id")]
        public var id: Number = 0;

    public function toString(): String {
        var str: String = "TaggedVehicleBase: ";
        str += " (id: " + id + ")";
        return str;
    }

}

}
