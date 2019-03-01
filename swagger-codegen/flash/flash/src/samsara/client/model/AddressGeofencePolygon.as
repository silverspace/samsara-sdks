package samsara.client.model {

import samsara.client.model.AddressGeofencePolygonVertices;

    [XmlRootNode(name="AddressGeofencePolygon")]
    public class AddressGeofencePolygon {
        /* The vertices of the polygon geofence. These geofence vertices describe the perimeter of the polygon, and must consist of at least 3 vertices and less than 40. */
        // This declaration below of _vertices_obj_class is to force flash compiler to include this class
        private var _vertices_obj_class: Array = null;
        [XmlElementWrapper(name="vertices")]
        [XmlElements(name="vertices", type="Array")]
                public var vertices: Array = new Array();

    public function toString(): String {
        var str: String = "AddressGeofencePolygon: ";
        str += " (vertices: " + vertices + ")";
        return str;
    }

}

}
