package org.openapitools.client.model {

import org.openapitools.client.model.DocumentBase;
import org.openapitools.client.model.DocumentField;

    [XmlRootNode(name="Document")]
    public class Document {
        /* ID of the Samsara dispatch job for which the document is submitted */
        [XmlElement(name="dispatchJobId")]
        public var dispatchJobId: Number = 0;
        /* Notes submitted with this document. */
        [XmlElement(name="notes")]
        public var notes: String = null;
        /* Descriptive name of this type of document. */
        [XmlElement(name="documentType")]
        public var documentType: String = null;
        /* The time in Unix epoch milliseconds that the document is created. */
        [XmlElement(name="driverCreatedAtMs")]
        public var driverCreatedAtMs: Number = 0;
        /* ID of the driver for whom the document is submitted */
        [XmlElement(name="driverId")]
        public var driverId: Number = 0;
        /* The fields associated with this document. */
        // This declaration below of _fields_obj_class is to force flash compiler to include this class
        private var _fields_obj_class: Array = null;
        [XmlElementWrapper(name="fields")]
        [XmlElements(name="fields", type="Array")]
                public var fields: Array = new Array();
        /* VehicleID of the driver at document creation. */
        [XmlElement(name="vehicleId")]
        public var vehicleId: Number = 0;

    public function toString(): String {
        var str: String = "Document: ";
        str += " (dispatchJobId: " + dispatchJobId + ")";
        str += " (notes: " + notes + ")";
        str += " (documentType: " + documentType + ")";
        str += " (driverCreatedAtMs: " + driverCreatedAtMs + ")";
        str += " (driverId: " + driverId + ")";
        str += " (fields: " + fields + ")";
        str += " (vehicleId: " + vehicleId + ")";
        return str;
    }

}

}
