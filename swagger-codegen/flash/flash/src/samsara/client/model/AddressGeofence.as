package samsara.client.model {

import samsara.client.model.AddressGeofenceCircle;
import samsara.client.model.AddressGeofencePolygon;

    [XmlRootNode(name="AddressGeofence")]
    public class AddressGeofence {
                [XmlElement(name="circle")]
        public var circle: AddressGeofenceCircle = NaN;
                [XmlElement(name="polygon")]
        public var polygon: AddressGeofencePolygon = NaN;

    public function toString(): String {
        var str: String = "AddressGeofence: ";
        str += " (circle: " + circle + ")";
        str += " (polygon: " + polygon + ")";
        return str;
    }

}

}
